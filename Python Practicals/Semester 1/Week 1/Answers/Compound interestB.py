def compound_interest(principle, rate, time):
    CI = principle * (pow((1 + rate / 100), time))
    return CI
 
 
p = float(input("Enter the principal amount: "))
r = float(input("Enter the interest rate: "))
t = float(input("Enter the time in years: "))
 
interest = compound_interest(p, r, t)
print("Compound interest is %.2f" % interest)
