# Order Algorithmic Time Complexity

The following are in order of increasing time complexity:
* Constant O(1)
* Logarithmic O(log N)
* Linear O(N)
* Superlinear O(N log N)
* Quadratic O(N^2)
* Exponential O(2^N)
* Factorial O(N!)

## Constant O(1)
* All instructions are performed a fixed amount of times
* Example: 
  ```
  Print the first number in a list
  ```
* The algorithm deos not depend on N
* If N double, its running time T remains constant

## Logarithmic O(log N)
* Problem is brokend up into smaller problems and solved independently. Each step cuts the size by a constant factor
* Example
  ```
  Binary search algorithm
  ```  
* If N doubles, running time T get slightly slower (T and a bit)
* In general paractical for most values of N

## Linear O(N)
* Each element requires a certain (fixed) amount of processing
* Example:
  ```
  Linear
  ``` 
* If N doubles, running tiems T doubles (2*T)
* Practical for N aroung 1 billion

## Superlinear O(N log N)
* Problem is broken up into smaller problems and solved independently. Each step cuts the size by a constant factor and the final solution is obtained by combining the sub-solutions
* Example
  ```
  Merge sort
  ```  
* If N doubles, running time T gets slightly bigger than double (2*T and a bit)
* Practical for N around 1 billion

## Quadratic O(N^2)
* Processes all pairs of data items
  - Often occurs when you have double nested loop 
* Example
  ```
  Insertion Sort
  ```  
* If N doubles, running time T increases four times (4*T)
* Impractical for N > 1 million

## Exponential O(2^N)
* Combinatorial explosion
* Example
  ```
  Finding all the subsets of N items
  ```  
* If N doubles, running time T squares (T*T)
* Impractial if N > 40

## Factorial O(N!)
* Example
  ```
  Finding all the permutations of N items
  ```  
* Impractial if N > 20

## Example
```py
def function2(aList):
  N = len(aList)
  value = 0
  for i in range(N):
    for j in range(0,2*N,4):
      value += i*j
  return value
```
What is the time complexity:
- O(N^2) as outer loop runs N times and inner loop runs rougly N/2 times
- O(N) as outer loop runs N//2 times and inner loop runs 100 times 
