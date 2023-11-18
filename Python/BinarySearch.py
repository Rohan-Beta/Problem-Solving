# binary search

def binarySearch(arr , low , high , x):
    
    if(high >= low):
        
        mid = (high + low) // 2
        
        if(arr[mid] == x):
            return mid
        
        elif(arr[mid] > x):
            return binarySearch(arr , low, mid-1 , x)
        
        else: #arr[mid] < x
            return binarySearch(arr, mid+1 , high , x)
        
    else:
        return -1
    

arr = [1 , 2 , 4 ,5 , 6]
x = 4

search = binarySearch(arr , 0 , len(arr)-1 , x)

if(search != -1):
    print(f"{x} found at index {search + 1}")

else:
    print(f"{x} not found")
