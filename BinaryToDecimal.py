# Binary To Decimal

def binaryToDecimal(n) :
    decimal = 0
    
    for i in n :
        decimal = decimal * 2 + int(i)
        
    print(decimal)
    
n = input("Enter binary number: ")
binaryToDecimal(n)
