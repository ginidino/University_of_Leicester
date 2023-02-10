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