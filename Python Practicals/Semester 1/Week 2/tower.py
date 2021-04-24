
def TowerOfHanoi(n, start, middle, end):
    if n==1:
         print("move disk 1 from rod",start,"to rod", middle)
    else:
        TowerOfHanoi(n-1,start,end,middle)
        print("Move disk",str(n),"from rod",start,"to rod",middle)
        TowerOfHanoi(n-1, end, middle, start)

n=4
TowerOfHanoi(n, "A", "B", "C")



        
    


                     
                     
                     
        



