# imports
import random
import copy
import matplotlib.pyplot as plt
import numpy

'''
    P = population size
    N = gene size
    G = generation count
    R = number of runs 
'''

P = 500
N = 20
G = 60
R = 2
mutation = 0.025
max_mutation = 0.5

upperBound = 1.0
lowerBound = 0.0

mutation_step = 100


# define Individual class, gene/chromosome list
class Individual:
    gene = []
    fitness = 0


# empty population list to fill
population = []

# numpy ordering for easy to read, used when running the algorithm and printing the graph
generation_average_fitness = numpy.zeros((G, R))
generation_fittest = numpy.zeros((G, R))
overall_fittest = 0
best_overall_average = 0

generation = numpy.linspace(1, G, num=G, dtype=int)

best_in_gen = []
average_fitness = []
average_fitness_generation = []
generation_best_count = []

# used for graph after selection, crossover and mutation
generation_counter = []
counting_average_fitness = []
counting_fittest = []

# one point crossover splits two genes at a random index and swaps the tails
''' 0101|010
    011|1110
'''
def one_point_crossover(pop_array):
    # ",2" cant change or get out of index range error, has to select two genes at a time
    for i in range(0, len(pop_array), 2):
        splice_point = random.randint(0, N)
        selected_gene1 = pop_array[i].gene
        selected_gene2 = pop_array[i + 1].gene

        splice_swap1 = selected_gene1[splice_point:]
        spliced_gene1 = selected_gene1[:splice_point]

        splice_swap2 = selected_gene2[splice_point:]
        spliced_gene2 = selected_gene2[:splice_point]

        final_gene1 = spliced_gene1 + splice_swap2
        final_gene2 = spliced_gene2 + splice_swap1

        pop_array[i].gene = final_gene1
        pop_array[i + 1].gene = final_gene2
    return pop_array


# worksheet 1 tournament selection, gets the fittest of two selections, and appends it to offspring list which gets returned
def tournament_selection(pop_array):
    offspring = []
    for i in range(0, P):
        # select 2 parents at random (p-1 cause index starts at 0),insert parent into pop and set at offspring
        # do serperate twice
        set_parent1 = random.randint(0, P - 1)
        set_offspring1 = population[set_parent1]
        set_parent2 = random.randint(0, P - 1)
        set_offspring2 = population[set_parent2]
        # get fittest from both and return offspring
        if set_offspring1.fitness > set_offspring2.fitness:
            offspring.append(set_offspring1)
        else:
            offspring.append(set_offspring2)
    return offspring

# bitwise mutation, creates a random number to add or remove from genes, replaces binary
def bitwise_mutation(pop_array):
    population_mutated_genes = []
    for i in range(0, P):
        newind = Individual()
        newind.gene = []
        for j in range(0, N):
            # set probabiltiy that gene will be changed
            alter_mutation_probability = random.uniform(0.0, mutation_step)
            # if smaller than mutation * 100 then set a small alter number
            if alter_mutation_probability < (100 * mutation):
                set_small_alter = random.uniform(0.0, max_mutation)
                # add or remove the 0 or 1 from gene (floats)
                if alter_mutation_probability % 2 == 0:
                    offspring[i].gene[j] = offspring[i].gene[j] + set_small_alter
                else:
                    offspring[i].gene[j] = offspring[i].gene[j] - set_small_alter
            newind.gene.append(offspring[i].gene[j])
        population_mutated_genes.append(newind)
        # have to append new individual to empty list and return
    return population_mutated_genes

# set new fitness of deepcopy
def set_fitness(pop_array):
    for i in range(P):
        for j in range(0, N):
            pop_array[i].fitness += pop_array[i].gene[j]

# used for mainly testing
# def get_fitness(pop_array):
#     set_fitness = 0
#     for i in range(len(pop_array)):
#         set_fitness += pop_array[i].fitness
#     return set_fitness

# used for calculating fitness of individuals
def get_fittest(pop_array):
    set_fittest = pop_array[0]
    for i in range(len(pop_array)):
        if pop_array[i].fitness > set_fittest.fitness:
            set_fittest = pop_array[i]
    return set_fittest.fitness

# calculates average fitness of individuals
def get_average_fitness(pop_array):
    set_fitness = 0
    for i in range(len(pop_array)):
        set_fitness += pop_array[i].fitness
    set_average_fitness = set_fitness / len(pop_array)
    return set_average_fitness


# worksheet 1 - 3, now using real-values, setup population with genes and fitnesses
for j in range(0, R):
    population = []
    for x in range(0, P):
        temporary_newind_gene = []
        for i in range(0, N):
            # 0.0, 0.1
            temporary_newind_gene.append(random.uniform(lowerBound, upperBound))
        newind = Individual()
        newind.gene = temporary_newind_gene.copy()

# counting ones for real-values
        fitness = 0
        for k in range(0, N):
            fitness += newind.gene[k]
# set the fitness
        newind.fitness = fitness
# fill the empty population list with the new individual (genes and fitness)
        population.append(newind)
# initialise offspring
    offspring = tournament_selection(population)

    for i in range(int(G)):
        # replace old population with new one (using image on worksheet 2)
        offspring = copy.deepcopy(tournament_selection(offspring))
        offspring = copy.deepcopy(one_point_crossover(offspring))
        new_population = copy.deepcopy(bitwise_mutation(offspring))
        set_fitness(new_population)

        # new_population_fitness = get_fitness(new_population)
        new_population_fittest = get_fittest(new_population)
        new_population_average_fitness = get_average_fitness(new_population)

        # get the new fittest individual
        if new_population_fittest < overall_fittest:
            overall_fittest = new_population_fittest
        # get new average fitness
        if new_population_average_fitness < best_overall_average:
            best_overall_average = new_population_average_fitness

        # replace population again
        population = copy.deepcopy(new_population)

        # set up prints for full generation
        generation_fittest[i][j] = new_population_fittest
        generation_average_fitness[i][j] = new_population_average_fitness

for i in range(G):
    # use numpy mainly for ordering and style / improving python knowledge, can be done in other ways
    average_fitness_total = numpy.sum(generation_average_fitness[i])
    average_fitness_generation.append(average_fitness_total / R)

    generation_best = numpy.sum(generation_fittest[i])
    generation_best_count.append(generation_best / R)

# plot result graph
plt.title(
    "Tournament Selection 2 Individuals, One-Point Crossover, Bit-Wise Mutation, \n P = 260, N = 30, G = 250, R = 5 \n Mutation = 0.025, Max Mutation = 0.5",
    fontsize=11)
plt.plot(generation, generation_best_count, color='green')
plt.plot(generation, average_fitness_generation, color='orange')
plt.xlabel("Generation")
plt.ylabel("Fitness \n Fittest = Green, Average Fitness = Orange")
plt.show()
