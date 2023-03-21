# Insertion Sort
![sort](https://user-images.githubusercontent.com/94044443/226746017-cd0a74f8-5c12-4b79-bf88-957aa3821d9b.jpg)

```py
#swap elements in a list at indices i and j
def swapElements(myList,i,j):
  temp = myList[i]
  myList[i] = myList[j]
  myList[j] = temp
  
def shiftback(the_list,j):
  while aList[j-1] > aList[j] and j>0:
    #swap elements at aList[j] and aList[j1]
    swapElements(aList,j-1,j)
    j = j-1
  
def insertionSort(aList):
  n = len(aList)
  for k in range(1,n):
    #insert aList[k] in aList[0:k] in sorted order
    shiftback(aList,k)
    
aList = [6,5,3,1,8,7, 2, 4]
insertionSort(aList)
print(aList)
```

```
• Sort the list [10,−4,−1,20,13,−3] into ascending order using insertion sort
• 10, -4, -1, 20, 13, -3      Original List
• -4, 10, -1, 20, 13, -3      1st Iteration
• -4, -1, 10, 20, 13, -3      2nd Iteration
• -4, -1, 10, 20, 13, -3      3rd Iteration
• -4, -1, 10, 13, 20, -3      4th Iteration
• -4, -3, -1, 10, 13, 20      5th Iteration and Sorted List
```
