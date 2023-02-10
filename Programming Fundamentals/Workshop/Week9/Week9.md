# Week9

## Question1
Create a class called Fraction for performing basic arithmetic with fractions. Use integer variables to represent the state attributes of the class – the numerator and the denominator. 

1. Write a constructor method `__init__` that enables an object of this class to be initialized when it is declared. Your constructor should be able to create an object initialized using default attribute values. For that purpose, you may use optional arguments to the method `__init__`. Use exceptions handling as deemed appropriate. Moreover, your constructor should store the fraction in reduced form, i.e., the fraction 2/4 should be stored as ½. To this end, implement the method `gcd(a, b)` that calculates the greatest common divisor of two integers a and b and use it to simplify the fraction. 
Here is a pseudocode for the iterative gcd function for your convenience:
```py
function gcd(a, b)
 while (a != b)
  if (a > b)
    a = a-b
  else
    b = b-a
 return a
```
***Hint**: This constructor is a bit complex, go step by step. First, implement the gcd method and then use the calculated gcd to simplify the fraction. Also, consider raising an exception when the denominator is zero.*

2. Write the method `__str__` to print a given Fraction.
3. Write the method `__eq__ to test the equality of two Fractions
4. Write the method `__add_`_` to add two Fractions. The result of the addition should be stored in reduced form.
5. Write the method `__sub__` to subtract two Fractions. The result of the subtraction should be stored in reduced form.
6. Write the method `__mul__` to multiply two Fractions. The result of the multiplication should be stored in reduced form.
7. Write the method `__truediv__` to divide two Fractions. The result of the division should be stored in reduced form.
8. Write the method scale that takes as inputs a list of Fraction objects `[x1, x2, …, xn]` and an integer factor and returns the list of simplified Fraction objects `[x1/factor, x2/factor, …, xn/factor]`.
9. Write a method `printListOfFractions` that takes in a list of Fraction objects and print them on the screen.

Code
```py
def gcd(m, n):
    while m % n != 0:
        oldm = m
        oldn = n
        m = oldn
        n = oldm % oldn
    return n


class Fraction():
    def __init__(self, num=0, den=0):
        self.num = num
        self.den = den

    def __str__(self):
        return str(self.num) + "/" + str(self.den)

    def __eq__(self, other):
        n = self.num * other.den
        d = other.num * self.den
        return n == d

    def __add__(self, other):
        n = self.num * other.den + other.num * self.den
        d = self.den * other.den
        common = gcd(n, d)
        return Fraction(n // common, d // common)

    def __sub__(self, other):
        n = self.num * other.den - other.num * self.den
        d = self.den * other.den
        common = gcd(n, d)
        return Fraction(n // common, d // common)

    def __mul__(self, other):
        n = self.num * other.num
        d = self.den * other.den
        common = gcd(n, d)
        return Fraction(n // common, d // common)

    def __truediv__(self, other):
        n = self.num * other.den
        d = self.den * other.num
        common = gcd(n, d)
        return Fraction(n // common, d // common)

    def scale(self, objects, factor):
        alist = []
        for i in objects:
            n = i.num
            d = i.den * factor
            common = gcd(n, d)
            frac = Fraction(n // common, d // common)
            alist.append(str(frac))
        return alist

    def printListOfFractions(self, objects):
        alist = []
        for i in objects:
            n = i.num
            d = i.den
            common = gcd(n, d)
            frac = Fraction(n // common, d // common)
            alist.append(str(frac))
        return alist


f = Fraction(2, 4)
f1 = Fraction(1, 2)
f2 = Fraction(2, 5)
print(f1 == f)
print(f1 + f2)
print(f1 - f2)
print(f1 * f2)
print(f1 / f2)
l = [f, f1, f2]
print(Fraction().scale(l, 5))
print(Fraction().printListOfFractions(l))
```
Output
```
True
9/10
1/10
1/5
5/4
['1/10', '1/10', '2/25']
['1/2', '1/2', '2/5']
```
