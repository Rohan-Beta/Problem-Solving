# find that the sqare root of the number is prime or not

import math

n = int(input("Enter a number: "))
num = int(math.sqrt(n))

# print(num)

if(num == 2 or num == 3 or num == 5 or num == 7) :
    print("Prime Number")
    
elif(num % 2 == 0 or num % 3 == 0 or num % 5 == 0 or num % 7 == 0) :
    print("Not prime")
        
else:
    print("prime")
