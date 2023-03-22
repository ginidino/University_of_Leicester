# Analysis of Selection Sort
* The order of elements in the list does not affect the sorting time. meansing, even if the list is partially sorted, still each element is compared and there is no breaking out early
* Selection sort is applicable for smaller dataset
* Selection sort is useful when the list is N)T partially sorted
* Should be used in those algorithm where the cost of swapping does not matter
* The best-case and worst-case time complexity of Selection Sort is O(n^2)

## Complexity of getMinIndex
<img width="642" alt="Screenshot 2023-03-22 at 10 34 34 pm" src="https://user-images.githubusercontent.com/94044443/227053562-20e83f9d-c922-4b51-b7a0-bee0dd015ea8.png">

Let n = stop-start   
Total running time something like 2 + n + n-1 + n-1   
Complexity -> O(N)

## Complexity of Selection Sort
```py
def getMinIndex(myList, start, stop):
  min_index = start
  for i in range(start,stop):
    if myList[i] < myList[min_index]:
      min_index = i
  return min_index
  
def swapElements(myList,i,j):
  temp = myList[i]
  myList[i] = myList[j]
  myList[j] = temp
  
aList = [7,2,11,8,4,2,5,6]
n = len(aList)
for index in range(n):
  #Find position of the smallest number in aList[index:]
  min_position = getMinIndex(aList,index,n)
  
  #Swap numbers at “index” and “min_position”
  swapElements(aList,index,min_position)
print(aList)
```
Cost of getMinIndex when:
* index is 0 -> n
* index is 1 -> n-1
* index is 2 -> n-2
* ...
* index is  n-1 -> 1

Total cost of getMinIndex:
* 1 + 2 + ...+ n
* n(n+1)/2 -> O(n^2)

Total cost of swapElements:
* n*O(1) -> O(n)

Complexity of Selection Sort:
* O(n^2)+O(n) -> O(n^2)
