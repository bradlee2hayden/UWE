##
# Remove the outliers from a data set.
#

## Remove the outliers from a list of data

def removeOutliers(data, num_ouliers):
    # Create a new copy of the list that is in sorted order
    retval = sorted(data)

    # Remove num.ouliers largest values
    for i in range(num_ouliers):
        retval.pop()

    # Return the result
    return retval

# Read data from the user and remove the two larest and two smallest values
def main():
    # Read values from the user until a blank line is entered
    values = []
    s = input("Enter a value (bank line to quit): ")
    while s != "":
        num = float(s)
        values.append(num)
        s = input("Enter a value (bank line to quit): ")

    # Display the result or an appropriate error message
    if len(values) < 4:
        print("You did not enter enough values.")
    else:
        print("With the outliers removed: ", removeOutliers(values,2))
        print("The original data: ", values)


# Call the main function
main()
