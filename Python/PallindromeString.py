# palindrome string

n = str(input("Enter a string: "))

length = len(n)
flag = 0

for i in range(0 , length):
    if(n[i] != n[length-i-1]):
        flag = 1
        
        break
    
if(flag):
    print("no")
    
else:
    print("yes")
