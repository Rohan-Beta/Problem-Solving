def prime(n):
    
    if(n == 1 or n == 1):
        return False
    
    elif(n > 1):
        for i in range(2 , n) :
            if(n % i == 0):
              
                return False
    return True

n = int(input("Enter a number: "))

for i in range(2 , n):
    if(prime(i)):
        print(i)
