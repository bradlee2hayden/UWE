##
# Compute the refund amount for a collection of bottles.
#
SMALL_DEPOSIT = 0.25
LARGE_DEPOSIT = 0.50

#Read input from the user
small = int(input("How many containers 1 litre or less do you have?"))
large = int(input("How many containers more than 1 litre do you have?"))

#Compute the refund amount
refund = small * SMALL_DEPOSIT + large * LARGE_DEPOSIT

#Display the result
print("your total refund will be £%.2f." % refund)
