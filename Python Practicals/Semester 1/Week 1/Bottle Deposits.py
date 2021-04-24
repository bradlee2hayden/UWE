amount=float(input("enter number of containers: "))
size=float(input("enter size of containers in litres: "))
if(size<1):
    deposit=0.25
else:
    deposit=0.50

cost=deposit*amount
print("£",cost)
