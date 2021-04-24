def multiplyList(myList):

    #Multiply elements onebyone
    result = 1
    for x in myList:
        result = result * x
    return result

list = [8, 2]
print(multiplyList(list)) 
