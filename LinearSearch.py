# linear search

def linerSearch(arr , x):
    
    for i in range(0 , len(arr)):
        
        if(arr[i] == x):
            return (i+1)
        
    return -1

arr = [2 , 3 , 4 , 5]
x = 4

search = linerSearch(arr , x)

if(search != -1):
    print(f"{x} found at index {search}")
    
else:
    print(f"{x} not found")
