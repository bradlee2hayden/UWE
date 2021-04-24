##
# Determine and display the season associated with a date.
#

# Read the date from the user
month = input("Enter the name of the month; ")
day = int(input("Enter the day number: "))

# Determine the season
if month == "january" or month == "February":
    season = "Winter"
elif month == "March":
    if day < 20:
        season = "Winter"
    else:
        season = "Spring"
elif month == "April" or month == "May":
    season = "Spring"
elif month == "June":
    if day < 21:
        season = "Spring"
    else:
        season = "Summer"
elif month == "July" or month == "August":
    season = "Summer"
elif month == "September":
    if day < 22:
        season = "Summer"
    else:
        season = "Autumn"
elif month == "October" or month == "November":
    season = "Autumn"
elif month == "December":
    if day <21:
        season = "Autumn"
    else:
        season = "Winter"
            
# Display the result
print(month, day, "is in", season)
