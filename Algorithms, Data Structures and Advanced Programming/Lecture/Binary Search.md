# Binary Search
```py
If ( target == middle item )
  target is found
else if ( target < middle item )
  search left-half of list with the same method
else
  search right-half of list with the same method
```

## Binary Search Case1:
targer = 10 (middle item)
<img width="648" alt="스크린샷 2023-03-27 오후 9 06 23" src="https://user-images.githubusercontent.com/94044443/228054323-66690bfa-2348-460d-b2e0-7b84c705f016.png">

## Binary Search Case2:
target = 19
<img width="649" alt="스크린샷 2023-03-27 오후 9 07 37" src="https://user-images.githubusercontent.com/94044443/228054572-2866ce97-8ed8-4b84-ae94-31d2bdded4cd.png">

## Binary Search Case3:
target = 7
<img width="632" alt="스크린샷 2023-03-27 오후 9 08 17" src="https://user-images.githubusercontent.com/94044443/228054708-607e7125-4e01-445d-9f38-07071da5d0a3.png">

## Binary Search
<img width="540" alt="스크린샷 2023-03-27 오후 9 08 46" src="https://user-images.githubusercontent.com/94044443/228054819-15f6850a-42a3-4ceb-825f-890aae94699f.png">

* Searching target in range (lo to hi)
* Assume target = 20
  * Repeat until range is not empty(i.e., while lo <= hi)
    * mid = (lo + hi) / 2
    * if target < array[mid].
      * Search from lo to mid - 1 (e.g., move hi to mid - 1)
    * if target > array[mid]
      * Search from mid + 1 to hi (e.g., move lo to mid + 1)
    * if target == array[mid]
      * Return mid

* Assume target = 23
* Repeat until range is not empty(i.e., while lo <= hi)
  * mid = (lo + hi) / 2
  * if target < array[mid].
    * Search from lo to mid - 1 (e.g., move hi to mid - 1)
  * if target > array[mid]
    * Search from mid + 1 to hi (e.g., move lo to mid + 1)
  * if target == array[mid]
    * Return mid
  * return -1

```py
# returns the index of target if target is found, otherwise returns -1
def binarySearch(aList, target):
  low = 0
  high = len(aList)-1
    # continue until range is not empty
  while low <= high:
    mid = (low + high) // 2
    # return the index if target is found
    if aList[mid] == target:
      return mid
    # otherwise update the range
    elif aList[mid] > target:
      high = mid-1
    else:
      low = mid+1
  # if range is empty and target is not found, return -1
  return -1
  
aList = [5,10,15,20,25,30,35,40,45,50,55]
print(binarySearch(aList,20))
```
