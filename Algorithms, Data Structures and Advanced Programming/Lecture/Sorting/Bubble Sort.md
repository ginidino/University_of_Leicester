# Bubble Sort

**Main idea**:   
Lighter bubbles rise to the top, Heavier ones sink to the bottom.

> smaller elements “bubble” to the front of the list, larger sink to the end.

Given n numbers to sort:
* Repeat the following n-1 times:
  - For each pair of adjacent numbers:
    * If the number on the left is greater than the number on the right, swap them.

## Bubble Sort Algorithm
```
Algorithm BubbleSort(L)
// Sorts a list using bubble sort
// Input: A list of orderable items
// Output: A list sorted in increasing order
n ⟵length(L)
i ⟵0
while i< n-1 {
  j ⟵0
  while j< n-1 {
    if L[j] > L[j+1] {
      swap L[j] and L[j+1]
    }
    j ⟵j + 1
  }
  i ⟵i + 1
}
```
```py
def bubble_sort(the_list):
    n = len(the_list)
    i = 0
    while i < n - 1:
        j = 0
        if the_list[j] > the_list[j + 1]:
            swap(the_list, j, j + 1)
        j += 1
    i += 1

def swap(the_list, i, j):
    tmp = the_list[i]
    the_list[i] = the_list[j]
    the_list[j] = tmp
```
