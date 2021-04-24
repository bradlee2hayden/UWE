bread=1.49;
discount=0.60;
percentageFromBread=0.6*bread;
dayOldBread=1.49-percentageFromBread;
numberOfLoaves=float(input("Enter amount of bread: "))
regularPrice=numberOfLoaves*bread;
discountPrice=numberOfLoaves*dayOldBread;
print("Regular price: ",regularPrice)
print("Discount: ",discount,"percent")
print("Discount price: ",discountPrice)

