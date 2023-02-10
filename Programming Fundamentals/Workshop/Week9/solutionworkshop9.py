import numpy as np

class Fraction(object):
    ''' Symbolic manipulation of fractions
        Need to deal with zero denominator using exception handling
        Numerators and denominators must be integers
    '''

    def gcd(self, a, b):
        '''
        Inputs: two integers a and b
        Output: the gcd (greatest common divisor of a and b)
        '''
        a = abs(a)  # deal with negative input a
        b = abs(b)  # deal with negative input b
        if a == 0 or b == 0:  # deal with a zero case cos of infinite loop
            return max(a, b)  # since a, b >= 0
        # patholigical case
        if a == 0 and b == 0:
            return np.nan  # gcd(0,0) = infinity
        while (a != b):
            if (a > b):
                a = a - b
            else:
                b = b - a
        return a

    # constructor method inluding the default constructor
    # that builds up Fraction(0, 1) i.e 0/1
    def __init__(self, num=0, denom=1):
        try:
            assert (type(num) == int)  # ensure num is int
            assert (type(denom) == int)
            if (denom != 0):
                common = self.gcd(num, denom)
                if (common != 0):
                    if (num < 0 and denom < 0):  # simplify -1/-2 to 1/2
                        num = -num
                        denom = -denom
                    self.num = num // common  # integer division
                    self.denom = denom // common
            else:
                raise ZeroDivisionError('Cannot have 0 denominator!')
        except AssertionError:
            print('Num and denom must be integers!')

    # print method
    def __str__(self):
        return str(int(self.num)) + "/" + str(int(self.denom))

    # equality testing
    def __eq__(self, other):
        return self.num * other.denom == self.denom * other.num

        # convert a fraction to float

    def to_float(self):
        return self.num / self.denom

        # add two fractions

    def __add__(self, other):
        try:
            n = self.num * other.denom + other.num * self.denom
            d = self.denom * other.denom
            res = Fraction(n, d)
            return res
        except ZeroDivisionError:
            print("Division by 0!")
            return np.nan

    # subtract two fractions
    def __sub__(self, other):
        try:
            n = self.num * other.denom - other.num * self.denom
            d = self.denom * other.denom
            res = Fraction(n, d)
            return res
        except ZeroDivisionError:
            print("Division by 0!")
            return np.nan
        except:
            print("Something went wrong!")
            return np.nan

    # multiply two fractions
    def __mul__(self, other):
        try:
            n = self.num * other.num
            d = self.denom * other.denom
            res = Fraction(n, d)
            return res
        except ZeroDivisionError:
            print("Division by 0!")
            return np.nan

    # inverse of a fraction
    def inverse(self):
        res = Fraction(self.denom, self.num)
        return res

    # divides two Fractions
    def __truediv__(self, other):
        try:
            inv = other.inverse()
            res = self * inv
            return res
        except:
            print('Division by 0!')
            return np.nan

    # helper function
    def scaling_down(self, fac):
        if (fac != 0):
            other = Fraction(1, fac)
            return self * other
        else:
            raise ZeroDivisionError("Cannot divides by zero!")

    def scale(self, fracs, fac):
        '''
        Inputs: list of Fractions - fracs - and a scale factor -fac
        Ouput: list of given fractions divided by fac
        '''
        res = []
        try:
            res = [x.scaling_down(fac) for x in fracs]
            # res = list(map(lambda x: x.scaling_down(fac), fracs))
            return res
        except ZeroDivisionError:
            print("Dividing by 0!")
            return res
        except:
            print("Something went wrong!")
            return res

    def printListOfFractions(self, fracs):
        s = "["
        for f in fracs:
            s = s + f.__str__() + ' '
        s = s + ']'
        print(s)

f = Fraction(3, -9)
g = Fraction(1, 2)
a = f+g
s = f-g
m = f*g
d = f/g
print('a=', a)
print('s=', s)
print('m=', m)
print('d=', d)
l = [f, g]
f.printListOfFractions(l)
res1 = f.scale(l, 0)
res2 = f.scale(l, 4)
f.printListOfFractions(res1)
f.printListOfFractions(res2)

b = Fraction() # default fracion
print(b)
a = b/b
print(a)

f =Fraction(1, 2)
f = f+f+f
print(f)

