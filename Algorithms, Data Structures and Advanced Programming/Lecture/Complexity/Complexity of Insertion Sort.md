# Complexity of Insertion Sort
```py
aList = [6,5,3,1,8,7, 2, 4]
n = len(aList)
for k in range(1,n):
  #insert aList[k] in aList[0:k] in sorted order
  j = k
  while aList[j-1] > aList[j] and j>0:
    #swap elements at aList[j] and aList[j+1]
    swapElements(aList,j-1,j)
  j = j-1
print(aList)
```
## Worst-Case Complexity
* In the worst case, the elements are sorted completely desending at the beginning. In each step, all elements of the sorted subarray must, therefore, be shifted to the right so that the element to be sorted - which is smaller than all elements already sorted in each step - can be placed at the very beginning
* Cost of while loop is O(k)
* Overall worst case cost of while loop:
  * O(1 + 2 + 3 + ... + n-1)
  * -> O(n(n-1)/2) -> O(n^2)
* Overall cost of the algorithm:
  * O(n^2)

## Best-Case Complexity 
* Cost of while loop is O(1)
* Overall Best-case cost of while loop:
  * O(n)
* Overall cost of the algorithm: 
  * O(n) 
