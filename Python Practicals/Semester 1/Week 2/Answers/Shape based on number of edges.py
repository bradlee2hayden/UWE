##
# Report the name of a shape from its number of sides
#

# Read the number of sides from the user
nsides = int(input("Enter the number of sides: "))

# Determine the name, leaving it empty if an unsupported number of sides was entered
name = ""
if nsides == 3:
    name = "triangle"
elif nsides == 4:
    name = "quadrilateral"
elif nsides == 5:
    name = "pentagon"
elif nsides == 6:
    name = "hexagon"
elif nsides == 7:
    name = "heptagon"
elif nsides == 8:
    name = "octagon"
elif nsides == 9:
    name = "nonagon"
elif nsides == 10:
    name = "decagon"

# Display an error message or the name of the polygon
if name == "":
    print("That number of sides is not supported by this program.")
else:
    print("That's a", name)
    
