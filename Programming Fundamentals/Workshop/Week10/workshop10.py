#Question1
class Point(object):
    """ Point class for representing and manipulating x,y coordinates. """

    def __init__(self, x=1, y=1):
        """ Create a new point at a given coordinates """
        self.x = x
        self.y = y

    # defining own print method
    def __str__(self):
        return "(" + str(self.x) + ", " + str(self.y) + ")"


class Segment(object):

    def __init__(self, x1, y1):
        self.x1 = x1
        self.y1 = y1

    def __str__(self):
        return str(self.x1) + str(self.y1)

    def distance(self):
        return str(((self.y1.x - self.x1.x) ** 2 + (self.y1.y - self.x1.y) ** 2) ** 0.5)


p1 = Point()
p2 = Point(3, 2)
s = Segment(p1, p2)
print(s.distance())

print()

# Question2
import math


class Point():
    def __init__(self, x=1, y=1):
        """ Create a new point at a given coordinates """
        self.x = x
        self.y = y

    # defining own print method
    def __str__(self):
        return "(" + str(self.x) + ", " + str(self.y) + ")"


class Circle(Point):
    '''Class definition using inheritance'''

    def __init__(self, x, y, r):
        Point.__init__(self, x, y)
        self.r = r

    def __str__(self):
        return "Location = " + Point.__str__(self) + "; Radius = " + str(self.r)


class Cylinder(Circle):
    def __init__(self, x, y, r, l):
        Circle.__init__(self, x, y, r)
        self.l = l
        # self.surArea = (math.pi*(self.r**2))*2 + (2*math.pi*self.r*self.l)

    def __str__(self):
        return 'Circle: ' + Circle.__str__(self) + ' Height: ' + str(self.l)

    def surArea(self):
        return (math.pi * (self.r ** 2)) * 2 + (2 * math.pi * self.r * self.l)


class Cylinder_comp():
    def __init__(self, c, h):
        self.c = c
        self.h = h

        # self.surArea = (math.pi*(self.c.r**2))*2 + (2*math.pi*self.c.r*self.h)

    def __str__(self):
        return 'Circle: ' + str(self.c) + ' Height: ' + str(self.h)

    def surArea(self):
        return (math.pi * (self.c.r ** 2)) * 2 + (2 * math.pi * self.c.r * self.h)


c = Cylinder(5, 6, 2, 5)
print(c)
print(c.surArea())

testCircle = Circle(2, 3, 2)
c1 = Cylinder_comp(testCircle, 5)
print(c1)
print(c1.surArea())


