# Recursion
* Recursion is a function which it call itself
* Solve a large problem by solving a sub-problems
  * Sub-problems are the same kind as the original problem and they can be solved with the same algorithm
  * Simpler to solve: sub-problems are so imple that they can be solved without further reductions (base case) 
* It needs at least once base case to stop cecursive call otherwise the program will crash

## Candidate problems for recursion
* Must be possible to decompose them into simpler similar problems
* At some point, the problems must become so simple that can be solved with no further decomposition
* Once all sub-problems are solved, the solution to the original problem can be computed by combining these solutions

## General recursive structure
<img width="705" alt="Screenshot 2023-03-22 at 11 23 40 pm" src="https://user-images.githubusercontent.com/94044443/227060543-ba18fd48-4507-47f8-997b-3270da4f89ef.png">

### Example
Add numbers from 1 to N
```py
def addNumbers(N):
    if N == 0:
        return 0
    else:
        subtotal = addNumbers(N-1)
        return subtotal + N

total = addNumbers(5)
print(total)
```
```py
def addNumbers(N):
    while N > 0:
        subtotal = N + subtotal
        N -= 1
    return subtotal

total = addNumbers(5)
print(total)
```
<img width="677" alt="Screenshot 2023-03-22 at 11 29 32 pm" src="https://user-images.githubusercontent.com/94044443/227061390-f3d64295-de5f-4f28-99d0-e67e73aa24f5.png">

Pringting numbers from N to 1 without a loop
```py
def printNumbers(N):
    print(N)
    if N == 1:
        pass # do nothing
    else:
        printNumbers(N-1)  
printNumbers(5)
```
if N == 1: <- Base case

## Write a recursive function to compute the factorial
```py
def getFactorial(N):
    if N==0:
        return 1
    else:
        return N*getFactorial(N-1)
print(getFactorial(5))
```
* Solution for base case (e.g., N = 0)?
  * 1 
* Assume you know the solution for smaller problem (i.e., (N-1)!), what will be the solution for N.
  * N! = N * (N-1)!

### Exercise
Write a recursive function that takes as input a positive integer n and returns a list L that contains the factorial values, 1!, 2!, ..., n!.
For example: If the input is n=5, then the output should be:
[1, 2, 6, 24, 120].

```py
def factorialList (n):
    if n == 1:
        ansList = [0] * n
        ansList [0] = 1
    else :
        ansList = factorialList(n-1)
        ansList.append(n*ansList[n-2])
    return ansList
value=int (input("Enter the range : "))
print( factorialList ( value ))
```

Write a program to compute power using recursion : Power ( 2,3 ) = 2 ** 3 = 8
```py
#computes x**N
def Power(x,N):
    if N==0: 
        return 1
    else:
        return x*Power(x,N-1) 
print(Power(3,4))
```
if N==0: -> Solution for base case(x**0 = 1)
return x*Power(x,N-1) -> Assume you know solution for x**(N-1) x**N = x*x**(N-1)

## Algorithm Fib(N)
```py
// Compute the Nth Fibonacci Number
// Input: A non negative integer N.
// Output: The Nth Fibonacci number

if (N = 0 or N = 1) 
    return N
else
    return Fib(N-2) + Fib(N-1)
```
Computing n-th Fibonacci number
```py
def fib(n):
    if n == 0 or n == 1:
        return n
    else:
        return fib(n-2)+fib(n-1)
print(fib(6))
```
* return n   -> Solution for base case. 0-th number is 0 and 1st number is 1.
* return fib(n-2)+fib(n-1) -> n-th number is the sum of (n-2)-th number and (n-1)-th number

