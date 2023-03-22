# Big O notation
* The complextity of an algorithm is described using a language called Big O notation
* It is how we compare the effiency of different approaches to a problem
* With Big O notation we express the runtime in terms of -how quickly it grows relative to the input, as the input gets larger
* Typically, following simplification rules
  * if f(N) is a product of serveral terms, any constants that do not depend on N can be ignored
  * if f(N) is a sum of servral terms, if there is one with the largest growth rate, it can be kept and others can be omitted
* E.g.
  * 12N^2 + 4N^3 -> O(N^3)
  * 12N^2 + 3Nlog(N) -> O(N^2)
  * 8N^4 + N^2log(N) + 12000 -> O(N^4)
  * 1000 + 5000 -> O(N^0) -> O(1)

## Complexity of power in big-O
```py
def power(x, N):
  ’computes x to the power of N’
  
  value = 1
  k = 1
  
  while k <= N:
    value *= x
    k += 1
    
  return value
```
Total running time = 3 + (N + 1) + 2N = 3N + 4   
Complexity -> O(N)
