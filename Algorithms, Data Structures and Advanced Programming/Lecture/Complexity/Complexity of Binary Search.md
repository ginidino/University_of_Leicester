# Complexity of Binary Search
```py
def binarySearch(aList, target):
  low = 0
  high = len(aList)-1
  
  while low <= high:
    mid = (low + high) // 2
    
    if aList[mid] == target:
      return mid
      
      if aList[mid] > target:
        high = mid-1
        
    else:
      low = mid+1
    
  return -1
```
## Best-case
* When the target is at middle of aList
  * While loop only runs once
  * Running time: constant # of operations
  * Complexity O(1)

Running time is something like: 3 + c.log(n) where c is a constant   
Complexity -> O(log n)
