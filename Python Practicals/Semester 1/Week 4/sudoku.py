sub_set = {1,2,3,4,5,6,7,8,9}

def check_horiz(i,j):
    return sub_set - set(container[i])

def check_vert(i,j):
    return_set = []
    for x in range(9):
        return_set.append(contrainer[x][j])
        return sub_set - set(ret_set)

def check_square(i,j):
    one = [0,1,2]
    two = [3,4,5]
    three = [6,7,8]
