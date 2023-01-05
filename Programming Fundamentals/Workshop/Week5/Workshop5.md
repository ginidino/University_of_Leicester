## Workshop5

## Task 1

The following program reads a text file representing a temperature of 7 different cities based on the format given below. Write a code to complete the given two functions so that it prints the minimum and maximum temperature.
```
“temp.txt”

Manchester,Sunday,9
Leicester,Monday,9
Coventury,Tuesday,11
Birmingham,Wednesday,11
London,Thursday,8
Nottingham,Friday,9
Reading,Saturday,12
```

Code
```py
table = [9, 9, 11, 11, 8, 9, 12]

def min_Tempreture(table):
    min_tem = table[0]
    for i in table:
        if i < min_tem:
            min_tem = i
        else:
            continue
    return min_tem

def max_Tempreture(table):
    max_tem = table[0]
    for i in table:
        if i >= max_tem:
            max_tem = i
    return max_tem

print("The minimum tempreture of the week is: ",min_Tempreture(table)," and maximum tempreture of the week is: ",max_Tempreture(table))
```
Output
```
The minimum tempreture of the week is:  8  and maximum tempreture of the week is:  12
```

## Task 2

Write a program to accept 2 inputs from user, a string and a list of letters. It should then display True if the entered string consists of all the letters in a given list.

Code
```py
alist = []

userStr = input("Enter the word: ")

for i in range(len(userStr)):
    letter = input("Enter the letter: ")
    alist.append(letter)
    
check = True
for x in userStr:
    if x in userStr:
        continue
    else:
        check = False
print(check)
```
Output
```
Enter the word: words
Enter the letter: w
Enter the letter: o
Enter the letter: r
Enter the letter: d
Enter the letter: s
True
```

## Task 3
Write a Python program that given an unsorted list of integers and prints the number in the list with the smallest absolute value. For example, if the list is [3,−5,2,−6,−1] the program should print -1, and if the list is [4,−21,2,−20] your program should print 2. You can assume that the list is called numList and already contains at least one number: you do not need to write code to read the numbers from a ﬁle or ask the user to input them.

Code
```py
alist = [-30, 2, -5, 4, 80]

if alist[0] < 0:
    alist[0] = alist[0] * -1
        
absSmall = alist[0]

for i in alist:
    if i < 0:
        i = i * -1
        
    if i <= absSmall:
        absSmall = i
    else:
        continue
print(absSmall)
```
Output
```
2
```

## Task 4

Write a function named joinList(aList,separator) where aList is a list and separator is a string. The function must return a string that concatenates all items in aList using the separator between them. You can assume that each item in the input list is either a string or a number. You are not allowed to use built-in python functions such as `join()`   
For example, assume that aList = ["apple", 7, "mango", "orange"] 
* `joinList(aList,":")` must return `"apple:7:mango:orange"` 
* `joinList(aList,",")` must return `"apple,7,mango,orange"`

Code
```py
def joinList(aList,separator):
    string = str(aList[0])
    for i in range (1, len(aList)):
        string=string + separator + str(aList[i])
    return string

aList = ["apple",7,"mango","orange"]
print(joinList(aList,'*'))
```
Output
```
apple:7:mango:orange
```
