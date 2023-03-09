# armstrong

n = int(input("Enter a number: "))

sum = 0
temp = n

while(n != 0) :
    r = n % 10
    sum = sum + (r*r*r)
    
    n //= 10
    
if(temp == sum) :
    print("yes")

else :
    print("no")
