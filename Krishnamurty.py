# krishnamurty

def fact(n) :
    
    if(n >= 1) :
        return (n * fact(n-1))
    
    else :
        return 1
    
def isKrishnamurty(num) :
    
    sum = 0
    temp = num
    
    while(temp != 0) :
        rem = temp % 10
        sum = sum + fact(rem)
        
        temp //= 10
        
    return (sum == num)

num = int(input("Enter a number: "))

if(isKrishnamurty(num)) :
    print("yes")
    
else :
    print("no")
