# Workshop2

## Question 1
Write a Python program that asks the user for the name of a file containing information about the distance of a vendor from Leicester and the cost of an item at that vendor. Each line in the file consists of a distance (as an integer) and an item price (as a float) separated by a comma.

For example: 
```
the file Tiny.txt contains
120,150.12
140,180.1
70,250.02
99,398.72
144,205.42
```
Your program should create a list of distance/cost pairs based on the file contents. It should  print the list, so that you can check that your program works correctly. 
```
Enter a file name: Tiny.txt
[[120, 150.12], [140, 180.1], [70, 250.02], [99, 398.72], [144, 205.42]]
```
Improve the readability of the output by writing a function `printList` so that output will be as follow:
```
Enter a file name: Tiny.txt
120 Miles, £ 150.12
140 Miles, £ 180.1
70 Miles, £ 250.02
99 Miles, £ 398.72
144 Miles, £ 205.42
```
Code
```py
# Task1
def printList(distCost):
    for pair in distCost:
        stringFormatted = str(pair[0]) + " Miles, " + "£ " + str(pair[1])
        print(stringFormatted)

fileName = input("Enter a file name: ")
file = open(fileName)
table = []
recNum = 0
for line in file:
    table.append(line.split(','))
    table[recNum][0] = int(table[recNum][0])
    table[recNum][1] = float(table[recNum][1])
    recNum += 1
file.close()
printList(table)
print()
table = selectionSortDistance(table)
printList(table)
print()
table = selectionSortPrice(table)
printList(table)
```
Output
```
Enter a file name: Tiny.txt
120 Miles, £ 150.12
140 Miles, £ 180.1
70 Miles, £ 250.02
99 Miles, £ 398.72
144 Miles, £ 205.42
```

## Question 2
Write a function `selectionSortDistance` that takes as input a list of distance/cost pairs and sorts the list in increasing order of distance using `Selection Sort`. Use this function to modify your program from Task 1, so that the list is printed in increasing order of distance.

Sample output:
```
Enter a file name: Tiny.txt
70 Miles, £ 250.02
99 Miles, £ 398.72
120 Miles, £ 150.12
140 Miles, £ 180.1
144 Miles, £ 205.42
```
Code
```py
# Task2
def selectionSortDistance(array):
    vendor = len(array)
    for position in range(vendor - 1):
        minRow = position
        for temp in range(position + 1, vendor):
            if array[temp][0] < array[minRow][0]:
                minRow = temp
        array[position], array[minRow] = array[minRow], array[position]

    return array

fileName = input("Enter a file name: ")
file = open(fileName)
table = []
recNum = 0
for line in file:
    table.append(line.split(','))
    table[recNum][0] = int(table[recNum][0])
    table[recNum][1] = float(table[recNum][1])
    recNum += 1
file.close()
printList(table)
print()
table = selectionSortDistance(table)
printList(table)
print()
table = selectionSortPrice(table)
printList(table)
```
Output
```
Enter a file name: Tiny.txt
70 Miles, £ 250.02
99 Miles, £ 398.72
120 Miles, £ 150.12
140 Miles, £ 180.1
144 Miles, £ 205.42
```

## Question 3
Modify your program in Task 2 by adding a function `selectionSortPrice`, so sorts the list in increasing order of Price using Selection Sort

Sample output:
```
Enter a file name: Tiny.txt
120 Miles, £ 150.12
140 Miles, £ 180.1
144 Miles, £ 205.42
70 Miles, £ 250.02
99 Miles, £ 398.72
```

Code
```py
def selectionSortPrice(array):
    vendor = len(array)
    for position in range(vendor - 1):
        minRow = position
        for temp in range(position + 1, vendor):
            if array[temp][1] < array[minRow][1]:
                minRow = temp
        array[position], array[minRow] = array[minRow], array[position]

    return array


fileName = input("Enter a file name: ")
file = open(fileName)
table = []
recNum = 0
for line in file:
    table.append(line.split(','))
    table[recNum][0] = int(table[recNum][0])
    table[recNum][1] = float(table[recNum][1])
    recNum += 1
file.close()
printList(table)
print()
table = selectionSortDistance(table)
printList(table)
print()
table = selectionSortPrice(table)
printList(table)
```
Output
```
Enter a file name: Tiny.txt
120 Miles, £ 150.12
140 Miles, £ 180.1
144 Miles, £ 205.42
70 Miles, £ 250.02
99 Miles, £ 398.72
```
