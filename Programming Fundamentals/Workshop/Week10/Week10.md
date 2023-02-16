# Week10 - OOP Going Further

## Lab Objectives
The aim of this worksheet is to introduce you to Object Oriented Programming in Python by getting you to:
* Define your own class
* Write code for class attributes and methods
* Use the class to create and manipulate objects
* Extend code by using inheritance or composition 

## Question1
Consider the class Point as defined in the Week 10 Lectures. Using Composition, write a class Segment with the following methods:
* A constructor with optional arguments
* A print method to print a segment
* A method distance() to calculate the distance between the two end points of the segment. 

Code
```py
class Point(object):
    """ Point class for representing and manipulating x,y coordinates. """
    def __init__(self, x, y):
        """ Create a new point at a given coordinates """
        self.x = x
        self.y = y
    # defining own print method
    def __str__(self):
        return "("+str(self.x)+","+str(self.y)+")"

class Segment(object):
    '''
    Class Segment uses composition and has two attributes
    - Origin which is a Point
    - Destination which is a Point
    '''
    #constructor
    def __init__(self, orig, dest):
        self.orig = orig
        self.dest = dest
    # to print an object    
    def __str__(self):
        return "Orig = "+str(self.orig)+", Dest = "+str(self.dest)
    
    def distance(self):
        '''
        returns the distance between the two end points of the segment.
        '''
        xs = (self.orig.x-self.dest.x)**2
        ys = (self.orig.y-self.dest.y)**2
        return (xs+ys)**0.5

o = Point(0, 0)
d = Point(2, 3)
s = Segment(o, d)
print(s)
print(s.distance())
```
Output
```
Orig = (0,0), Dest = (2,3)
3.605551275463989
```

## Question2
Consider the class Point and the class Circle as discussed in Week 10 Lectures. Given these two classes, write a class Cylinder with similar methods as those in the class Circle. Do this in two ways:
1. By using inheritance
2. By using composition.

In each case, test your class methods for well-chosen various input data. 

Code
```py
import math
class Circle(Point):
    '''Class definition using inheritance'''
    # constructor
    def __init__(self, x, y, r):
        Point.__init__(self, x, y)
        self.radius = r
        
    def __str__(self):
        return "Location = "+Point.__str__(self)+"; Radius = "+str(self.radius)
    
    def area(self):
        return math.pi*self.radius**2
    
c = Circle(1,2, 3.)
print("Area = ", "{:10.3f}".format(c.area()))
```
```
Area =      28.274
```
```py
class Cylinder(Circle):
    '''
    Using inheritance from Circle
    '''
    #constructor
    def __init__(self, x, y, r, h):
        Circle.__init__(self, x, y, r)
        self.height = h
        
    def __str__(self):
        return Circle.__str__(self)+"; Height = "+str(self.height)
    
    def area(self):
        circonf_area = 2*math.pi*self.radius*self.height
        circs_area = 2*Circle.area(self)
        return circonf_area+circs_area

cylind = Cylinder(0, 0, 3.5, 5.5)
print(cylind)
print(cylind.area())
```
```
Location = (0,0); Radius = 3.5; Height = 5.5
197.92033717615698
```
```py
class Cylinder2(object):
    '''
    Using Composition from Circle; attributes are
    - circle (base of the cylinder)
    - height
    '''
    #constructor
    def __init__(self, c, h):
        self.circle = c
        self.height = h
        
    def __str__(self):
        return str(self.circle)+" Height = "+str(self.height)
    
    def area(self):
        circ = self.circle
        circonf_area = 2*math.pi*circ.radius*self.height
        circs_area = 2*circ.area()
        return circonf_area+circs_area

c = Circle(1, 2, 5.6)
h = 8.7
cylind2 = Cylinder2(c, h)
print(cylind2)
print(cylind.area())
```
```
Location = (1,2); Radius = 5.6 Height = 8.7
197.92033717615698
```
