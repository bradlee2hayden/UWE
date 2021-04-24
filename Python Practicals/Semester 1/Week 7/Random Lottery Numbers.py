##
# Compute random but disntinct numbers for a lottery ticket.
#

from random import randrange

MIN_NUM = 1
MAX_NUM = 49
NUM_NUMS = 6

# Keep a list of the numbers for the ticket.
ticket_nums = []

# Generate NUM_NUMS random but disntict numbers
for i in range(NUM_NUMS):
    # Generate a number that ins't already on the ticket
    rand = randrange(MIN_NUM, MAX_NUM + 1)
    while rand in ticket_nums:
        rand = randrange(MIN_NUM, MAX_NUM + 1)

    # Add the distinct number to the ticket
    ticket_nums.append(rand)

# Sort the numbers into ascending order and display them
ticket_nums.sort()
print("Your numbers are: ", end="")
for n in ticket_nums:
    print(n, end=" ")
print()
