# find that the sqare root of the number is prime or not

import math

n = int(input("Enter a number: "))
num = int(math.sqrt(n))

flag = 0

if(n == 1):
    print("no")
    
elif(n > 1):
    for i in range(2 , n):
        if(n % i == 0):
            flag = 1
            
            break
        
    if(flag):
        print("no")
    else:
        print("yes")
