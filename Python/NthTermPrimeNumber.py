n = int(input("Enter a number: "))

prime = 1
count = 0
flag = int

while(n != count) :
    
    flag = 0
    prime += 1
    
    for i in range(2 , int(prime/2 + 1)) :
        if(prime % i == 0) :
            
            flag = 1
            
    if(flag == 0) :
        count += 1
    
print(prime)
