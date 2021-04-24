import random
import copy
import math
import matplotlib.pyplot as plt
import numpy

'''
    P = population size
    N = gene size
    G = generation count
    R = number of runs 
'''
# params
P = 500
N = 20
G = 250
R = 2
mutation = 0.025
max_mutation = 1

upperBound = 32.0
lowerBound = -32.0

mutation_step = 100

selection_size = 2

generation_fittest = numpy.zeros((G, R))
generation_average_fitness = numpy.zeros((G, R))
overall_fittest = 0
best_overall_average = 0

generation = numpy.linspace(1, G, num=G, dtype=int)

population = []
best_in_gen = []
average_fitness = []
average_fitness_generation = []
generation_best_count = []

# define Individual class
class Individual:
    gene = []
    fitness = 0
    normalised_fitness = 0

# worksheet 1 tournament selection but able to increase its selection size, gets the fittest of two selections, and appends it to offspring list which gets returned
def tournament_selection(pop_array):
    offspring = []
    # populate offspring with p length
    while len(offspring) < P:
        best_of_parents = Individual()
        best_of_parents.fitness = 0
        get_parents = []

        while len(get_parents) < selection_size:
            get_parents.append(pop_array[random.randint(0, P - 1)])

        for i in range(len(get_parents)):
            if get_parents[i].fitness < best_of_parents.fitness:
                best_of_parents = get_parents[i]

        offspring.append(best_of_parents)

    return offspring

def tournament_selection(pop_array):
    offspring = []
    for i in range(0, P):
        # select 2 parents at random (p-1 cause index starts at 0),insert parent into pop and set at offspring
        # do serperate twice
        set_parent1 = random.randint(0, P - 1)
        set_offspring1 = population[set_parent1]
        set_parent2 = random.randint(0, P - 2)
        set_offspring2 = population[set_parent2]
        # get fittest from both and return offspring
        if set_offspring1.fitness < set_offspring2.fitness:
            offspring.append(set_offspring1)
        else:
            offspring.append(set_offspring2)
    return offspring

# used for roulette-wheel, bad fitness out, best ones in, otherwise roulette-wheel wont be as efficient -
# Normalization means dividing the fitness value of each individual by the sum of all fitness values
def normalisation_function(pop_array):
    # throw out bad fitnesses and keep best ones, dont set to high of value otherwise wont
    # get good optimisation
    set_max_fitness = -50
    set_minimum_fitness = 50

    for i in range(0, P):
        # find and set max fitness
        if pop_array[i].fitness > set_max_fitness:
            set_max_fitness = pop_array[i].fitness
        elif pop_array[i].fitness < set_minimum_fitness:
            set_minimum_fitness = pop_array[i].fitness
    # call normalisation function for the fitness refresh
    for i in range(0, P):
        # normalisation average
        pop_array[i].normalised_fitness = (set_max_fitness - pop_array[i].fitness) / (set_max_fitness - set_minimum_fitness)
    return pop_array

# uses normalisation and then sets a random spin point
# have wheel selection point as area instead of point
def roulette_wheel(pop_array):
    # set to set normalise fitness
    pop_array = normalisation_function(pop_array)
    offspring = []
    offspring_fitness = sum(i.normalised_fitness for i in pop_array)
    while len(offspring) < P:
        # set random wheel stop point
        wheel_spin_point = random.uniform(0, offspring_fitness)
        current_fitness_count = 0
        for i in pop_array:
            # set current fitness count and select offspring if bigger thant wheelspin area
            current_fitness_count += i.normalised_fitness
            if current_fitness_count > wheel_spin_point:
                offspring.append(i)
                break
    return offspring

# one point crossover splits two genes at a random index and swaps the tails
''' 0101|010
    011|1110
'''
def one_point_crossover(pop_array):
    # ",2" cant change or get out of index range error, has to select two genes at a time
    for j in range(0, len(pop_array), 2):
        splice_point = random.randint(0, N)
        selected_gene1 = pop_array[j].gene
        selected_gene2 = pop_array[j + 1].gene

        splice_swap1 = selected_gene1[splice_point:]
        spliced_gene1 = selected_gene1[:splice_point]

        splice_swap2 = selected_gene2[splice_point:]
        spliced_gene2 = selected_gene2[:splice_point]

        final_gene1 = spliced_gene1 + splice_swap2
        final_gene2 = spliced_gene2 + splice_swap1

        pop_array[j].gene = final_gene1
        pop_array[j + 1].gene = final_gene2
    return pop_array

# multi point crossover splits two genes at two random indexs and swaps the tails
''' 0101|01|0
    011|11|10
'''
def multi_point_crossover(pop_array):
    for j in range(0, len(pop_array), 2):
        splice_point1 = random.randint(0, N)
        splice_point2 = random.randint(0, N + 1)

        selected_gene1 = pop_array[j].gene
        selected_gene2 = pop_array[j + 1].gene

        splice_swap1 = selected_gene1[splice_point1:]
        spliced_gene1 = selected_gene1[:splice_point1]

        splice_swap2 = selected_gene2[splice_point1:]
        spliced_gene2 = selected_gene2[:splice_point1]

        set_new_gene1 = spliced_gene1 + splice_swap2
        set_new_gene2 = spliced_gene2 + splice_swap1

        splice_swap3 = selected_gene1[splice_point2:]
        spliced_gene3 = selected_gene1[:splice_point2]

        splice_swap4 = selected_gene2[splice_point2:]
        spliced_gene4 = selected_gene2[:splice_point2]

        set_new_gene3 = spliced_gene3 + splice_swap4
        set_new_gene4 = spliced_gene4 + splice_swap3

        pop_array[j].gene = set_new_gene1 + set_new_gene3
        pop_array[j + 1].gene = set_new_gene2 + set_new_gene4
    return pop_array

# minimsation fitness function (optimistion worksheet) note [-32.0<xi<32.0] return the fitness and replace counting ones
def expo_minimisation(pop_array):
    set_squared = 0
    set_cosine = 0
    set_exp_cos = 0

    for i in range(0, N):
        set_squared += pow(pop_array.gene[i], 2)
        set_cosine += math.cos(2 * math.pi * pop_array.gene[i])

    set_temp = (1 / N) * set_squared
    set_first_half = -0.2 * math.sqrt(set_temp)

    for i in range(0, N):
        set_exp_cos = (1 / N) * set_cosine

    expo_fitness = -20 * math.exp(set_first_half) - math.exp(set_exp_cos)

    return expo_fitness

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
                set_small_alter = random.uniform(0, max_mutation)
                # if 0, 1, then change add alter num thats bigger than upper bound(32)
                if random.randint(0, 1):
                    if pop_array[i].gene[j] + set_small_alter > upperBound:
                        pop_array[i].gene[j] = upperBound
                    else:
                        pop_array[i].gene[j] += set_small_alter
                else:
                    # do same but minus alter num thats smaller than lower bound(-32)
                    if pop_array[i].gene[j] - set_small_alter < lowerBound:
                        pop_array[i].gene[j] = lowerBound
                    else:
                        pop_array[i].gene[j] -= set_small_alter
            newind.gene.append(pop_array[i].gene[j])
        # have to append new individual to empty list and return
        population_mutated_genes.append(newind)
    return population_mutated_genes

# no set fitness needed due to only using expo min fitness function

# used for mainly testing
# def get_fitness(pop_array):
#     set_fitness = 0
#     for i in range(len(pop_array)):
#         set_fitness += pop_array[i].fitness
#     return set_fitness

# used for calculating fitness of individuals
def get_fittest(pop_array):
    set_current_fitness = pop_array[0]
    for i in range(len(pop_array)):
        if pop_array[i].fitness < set_current_fitness.fitness:
            set_current_fitness = pop_array[i]
    return set_current_fitness.fitness

# calculates average fitness of individuals
def get_average_fitness(pop_array):
    set_fitness = 0
    for i in range(len(pop_array)):
        set_fitness += pop_array[i].fitness
    set_average_fitness = set_fitness / len(pop_array)
    return set_average_fitness

# worksheet 1 - 3, now using real-values, setup population with genes and fitnesses, replacing counting ones
for j in range(0, R):
    population = []
    # setup population with genes and fitnesses
    for x in range(0, P):
        temporary_newind_gene = []
        for i in range(0, N):
            # -32, 32
            temporary_newind_gene.append(random.uniform(lowerBound, upperBound))
        newind = Individual()
        newind.gene = temporary_newind_gene.copy()

        # expo fitness instead of counting ones
        newind.fitness = expo_minimisation(newind)

        population.append(newind)
    # initialise offspring
    offspring = tournament_selection(population)

    for i in range(int(G)):
        # replace old population with new one (using image on worksheet 2)
        offspring = copy.deepcopy(tournament_selection(offspring))
        offspring = copy.deepcopy(one_point_crossover(offspring))
        new_population = copy.deepcopy(bitwise_mutation(offspring))

        for p in range(P):
            new_population[p].fitness = expo_minimisation(new_population[p])

        offspring = copy.deepcopy(tournament_selection(population))

        for p in range(P):
            offspring[p].fitness = expo_minimisation(offspring[p])

        # new_population_fitness = get_fitness(new_population)
        new_population_fittest = get_fittest(new_population)
        new_population_average_fitness = get_average_fitness(new_population)

        # optimise population fitness values and average fitness values
        if new_population_fittest < overall_fittest:
            overall_fittest = new_population_fittest

        if new_population_average_fitness < best_overall_average:
            best_overall_average = new_population_average_fitness

        # replace population again
        population = copy.deepcopy(new_population)

        generation_fittest[i][j] = new_population_fittest
        generation_average_fitness[i][j] = new_population_average_fitness


for i in range(G):
    # use numpy mainly for ordering and style / improving python knowledge, can be done in other ways
    average_fitness_total = numpy.sum(generation_average_fitness[i])
    average_fitness_generation.append(average_fitness_total / R)

    generation_best = numpy.sum(generation_fittest[i])
    generation_best_count.append(generation_best / R)

plt.title(
    "Tournament Selection 2 Individuals, One-Point Crossover, Bit-Wise Mutation, \n P = 500, N = 250, G = 20, R = 25 \n Mutation = 0.025, Max Mutation = 1",
    fontsize=11)
plt.plot(generation, generation_best_count, color='green')
plt.plot(generation, average_fitness_generation, color='orange')
plt.xlabel("Generation")
plt.ylabel("Fitness \n Fittest = Green, Average Fitness = Orange")
plt.show()
