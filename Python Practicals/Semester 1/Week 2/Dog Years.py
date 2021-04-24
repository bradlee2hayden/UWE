firstTwoYear=10.5
afterFirstTwoYear=4
humanYear=float(input("Enter Human Years: "))
if(humanYear <= 2 and humanYear >= 0):
    dogYear=humanYear*firstTwoYear
    print(dogYear)

if (humanYear > 2 ):
    dogYear=((humanYear-2)*afterFirstTwoYear)+(firstTwoYear*2)
    print(dogYear)
else:
    if(humanYear < 0):
        print("Error, negative number not allowed")
 


       
    
    
   

