# Merge Sort

## Divide and Conquer Sorting
Divide and Conquer paradigm
* Divide the problem into smaller sub-problems
* Conquer (solve) each sub-problem and combine the results

Divide and Conquer Sorting
* Merge sort
* Quick sort

## Merge Sort Algorithms
```py
# merge sort (naive version) -------------------------------------------
def merge(A, B):
    merged=[]
    i,j=0,0 #initialize i and j to 0
    
    while i < len(A) and j < len(B):
        if A[i] < B[j]:
            merged.append(A[i])
            i=i+1
        else:
            merged.append(B[j])
            j=j+1
   
    if i < len(A):
        merged += A[i:]
    if j < len(B):
        merged += B[j:]
    return merged


 
def mergesort(xs):
    """Mergesort."""
    if len(xs) <= 1:
        # NOTE list is very small... and already sorted
        return xs
    midpoint = len(xs)//2  # NOTE integer division
    l, r = xs[0:midpoint], xs[midpoint:]
    l2, r2 = mergesort(l), mergesort(r)
    return merge(l2,r2)


# example --------------------------------------------------------------

arr=[14,2,16,11,5,7,66,4,3]
print("Mergesort example: ",str(mergesort(arr)))
```
* Two fuctions are involved
* The mergeSort() function recursively call itself to divide the list till size become one
* The merge() function is used to merge the two halves

## Merge Sort
Divide Step
* Divide the list into sub-lists each of length 1
Conquer Step
* Repeatedly merge sub-lists to produce new sorted sub-lists until there is only one sorted list

## Exercise
<img width="640" alt="Screenshot 2023-03-25 at 8 24 34 pm" src="https://user-images.githubusercontent.com/94044443/227739827-488aa966-a5b8-42c3-8e00-656832f17f31.png">

## Merging two sorted lists
* Repeat until i or reach the end of the corresponding list
  * Compare elements at i and j
  * Insert the smaller in merged and increment its pointer
* Append remaining items in the unfinished list to merged
<img width="444" alt="Screenshot 2023-03-25 at 8 26 51 pm" src="https://user-images.githubusercontent.com/94044443/227739945-90b9a26a-c911-4d0a-bc0b-316a1a3c2c39.png">

## Merging two sorted lists
```py
def mergeLists(A, B, merged):
  i,j=0,0 #initialize i and j to 0
  # repeat until reaches the end of at least one list
  while i < len(A) and j < len(B):
  # insert the smaller element in merged and increment pointer
    if A[i] < B[j]:
      merged.append(A[i])
      i=i+1
    else:
      merged.append(B[j])
      j=j+1
      
  # if A/B is unfinished, add remaining elements to merged
  if i < len(A):
    merged += A[i:]
  if j < len(B):
    merged += B[j:]
  
A = [1,5,6] # example from previous slide
B = [3,4,7,8]
```
