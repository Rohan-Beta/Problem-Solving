# sum of series
# 1 + 1/2! + 1/3! + ..... 1/n!

def fact(n) :
    if(n < 0):
        return -1
    
    if(n >= 1) :
        return(1 + (1 / (n * fact(n-1))))
    
    else :
        return 1
    
print(fact(3))
