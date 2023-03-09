# lcm and hcf of two number

a = int(input("Enter first number :"))
b = int(input("Enter second number: "))

hcf = 1

for i in range(2 , a+1) :
    
    if(a % i == 0 and b % i == 0) :
        hcf = i
        
lcm = int((a*b) / (hcf))

print(f"lcm is: {lcm}")
print(f"hcf is: {hcf}")
