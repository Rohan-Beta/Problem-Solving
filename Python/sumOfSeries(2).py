# sum of series
# 1 + 2/2! + 3/3! + 4/4! + ...... + n/n!

def fact(n) :
    num = 1
    
    if(n >= 1) :
        num += 1
        return(1 + (num / (n * fact(n-1))))
    
    else :
        return 1
    
print(fact(3))
