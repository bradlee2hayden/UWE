
Dog_age = int(input("Insert a dog age in dog years: "))
 
    
if Dog_age < 3:
    Human_age = Dog_age * 10.5
      
else:
    if Dog_age >= 3:
        Human_age = ((Dog_age-2) * 4) + 21
        
print ('Your dog is', Human_age, 'human years old') 
