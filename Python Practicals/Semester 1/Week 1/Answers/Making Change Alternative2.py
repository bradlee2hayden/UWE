##
#compute the minimum collection of coins in change
#
PENCE_PER_2_POUND_COIN = 200
PENCE_PER_1_POUND_COIN = 100
PENCE_PER_50_PENCE_COIN = 50
PENCE_PER_20_PENCE_COIN = 20
PENCE_PER_10_PENCE_COIN = 10
PENCE_PER_5_PENCE_COIN = 5
PENCE_PER_2_PENCE_COIN = 2
PENCE_PER_1_PENCE_COIN = 1

#Read the number of pence from the user
Cost = float(input("Enter the cost of purchase in pounds: "))
Cash = float(input("Enter the cash ammount in pounds: "))
pence = Cash * 100 - Cost * 100
print("Give the following Change")
#Determine the nymer of £2 coins
print(" ", pence // PENCE_PER_2_POUND_COIN, "£2 coins")
pence = pence % PENCE_PER_2_POUND_COIN 
#Determine the nymer of £1 coins
print(" ", pence // PENCE_PER_1_POUND_COIN, "£1 coins")
pence = pence % PENCE_PER_1_POUND_COIN 
#Determine the nymer of 50p coins
print(" ", pence // PENCE_PER_50_PENCE_COIN, "50p coins")
pence = pence % PENCE_PER_50_PENCE_COIN
#Determine the nymer of 20p coins
print(" ", pence // PENCE_PER_20_PENCE_COIN, "20p coins")
pence = pence % PENCE_PER_20_PENCE_COIN
#Determine the nymer of 10p coins
print(" ", pence // PENCE_PER_10_PENCE_COIN, "10p coins")
pence = pence % PENCE_PER_10_PENCE_COIN
#Determine the nymer of 5p coins
print(" ", pence // PENCE_PER_5_PENCE_COIN, "5p coins")
pence = pence % PENCE_PER_5_PENCE_COIN
#Determine the nymer of 2p coins
print(" ", pence // PENCE_PER_2_PENCE_COIN, "2p coins")
pence = pence % PENCE_PER_2_PENCE_COIN
#Determine the nymer of 1p coins
print(" ", pence // PENCE_PER_1_PENCE_COIN, "1p coins")
pence = pence % PENCE_PER_1_PENCE_COIN


