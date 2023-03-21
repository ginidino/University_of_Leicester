# Sorting

# Sorting type
* Selection sort
* Insertion sort
* Merge sort
* Quick sort
* Heap sort
* Bubble sort

## Selection sort
* Select the smallest number in the list and move it to index 0
* Select the 2nd smallest number in the list and move it to index 1.
* Select the 3rd smallest number in the list and move it to index 2.
* Select the n-th smallest number in the list and move it to index

### Representing Selection Sort as an algorithm
* Select the smallest number in the list and swap it with the number at index 0.
* Select the smallest number in the list between index 1 to n-1 and swap it with number at index 1.
* Select the smallest number in the list between index 2 to n-1 and swap it with number at index 2.

### Sort the list [10,−4,−1,20,13,−3] into ascending order using
selection sort
```
• 10, -4, -1, 20, 13, -3      Original List
• -4, 10, -1, 20, 13, -3      1st Iteration
• -4, -3, -1, 20, 13, 10      2nd Iteration
• -4, -3, -1, 20, 13, 10      3rd Iteration
• -4, -3, -1, 10, 13, 20      4th Iteration
• -4, -3, -1, 10, 13, 20      5th Iteration & Sorted List
```

### Implementing Selection Sort
```py
def getMinIndex(myList, start, stop):
  min_index = start
  for i in range(start+1,stop):
    if myList[i] < myList[min_index]:
      min_index = i
  return min_index
  
def swapElements(myList,i,j):
  temp = myList[i]
  myList[i] = myList[j]
  myList[j] = temp
  
def selectionSort(aList):
  n = len(aList)
  for index in range(n):
  
    #Find position of the smallest number in aList[index:]
    min_position = getMinIndex(aList,index,n)
    
    #Swap numbers at “index” and “min_position”
    swapElements(aList,index,min_position)
aList = [7,2,11,8,4,2,5,6]
selectionSort(aList)
print(aList)
```

### Analysis of Selection Sort
* The order of elements in the list does not affect the sorting time. meaning, even if the list is partially sorted, still each element is compared and there is no breaking out early.
* Selection sort is applicable for smaller dataset.
* Selection sort is useful when the list is NOT partially sorted.
* Should be used in those algorithm where the cost of swapping does not matter. 
