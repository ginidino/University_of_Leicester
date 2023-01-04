# Workshop4

## Question 1
Write a Python program that uses a while loop to ask the user to input 5 numbers. The program should then enter each of these numbers into a list. Then, once all numbers are entered, prints the list.

Modify your program such that it outputs the list containing the square of each entered number

Code
```py
alist = []
pow_list = []
num = 0
pow_num = 0

while num < 5:
    list_num = int(input("Enter the number: "))
    num += 1
    alist.append(list_num)
    pow_list.append(pow(list_num, 2))
print(alist)
print(pow_list)
```
Output
```
Enter the number: 3
Enter the number: 4
Enter the number: 5
Enter the number: 6
Enter the number: 7
[3, 4, 5, 6, 7]
[9, 16, 25, 36, 49]
```


## Question 2
Write a program in Python that asks user to input 5 lines of numbers. Your program should represent these lines as a table.

For example:
```
Enter some numbers: 1 2 3 4 5
Enter some numbers: 5 6 7
Enter some numbers: 1 1 1 1
Enter some numbers: 1.5 6 7.5 2
Enter some numbers: 0
[[1, 2, 3, 4, 5], [5, 6, 7], [1, 1, 1, 1], [1.5, 6, 7.5, 2], [0]]
```

Code
```py
num = 0
alist = []

while num < 5:
    list_num = input("Enter the number: ")
    alist_num = list_num.split(" ")
    
    alist.append(alist_num)
    
    num += 1

print(alist)
```

Output
```
Enter the number: 1 1 1 1
Enter the number: 1.5 1.3 2.5
Enter the number: 0 0 0
Enter the number: 3.1
Enter the number: 5
[['1', '1', '1', '1'], ['1.5', '1.3', '2.5'], ['0', '0', '0'], ['3.1'], ['5']]
```
Code
```py
maxRows=5
table=maxRows*[0]
rowNumber=0
while rowNumber < maxRows:
    temp=input("Enter some numbers: ").split()
    table[rowNumber]=len(temp)*[0]
    for colNumber in range(len(temp)):
        table[rowNumber][colNumber]=float(temp[colNumber])
    rowNumber=rowNumber+1
print(table)
```
Output
```
Enter some numbers: 1 1 1 1
Enter some numbers: 1.5 1.3 2.5
Enter some numbers: 0 0 0
Enter some numbers: 3.1
Enter some numbers: 5
[[1.0, 1.0, 1.0, 1.0], [1.5, 1.3, 2.5], [0.0, 0.0, 0.0], [3.1], [5.0]]
```

## Question 3
Write a program in Python that simulates the rolling of 100 dice, by generating a number from 1 to 6, it then count the number of times each dice has appeared and stores these numbers in a list and display as follow:
```
Sample output
Dice 1: 21 times
Dice 2: 14 times
Dice 3: 13 times
Dice 4: 21 times
Dice 5: 13 times
Dice 6: 18 times
```

Code
```py
import random

num = 0
alist = []

while num < 100:
    ran_num = random.randint(1, 6)
    alist.append(ran_num)
    num += 1
print("Dice 1:", alist.count(1), "times")
print("Dice 2:", alist.count(2), "times")
print("Dice 3:", alist.count(3), "times")
print("Dice 4:", alist.count(4), "times")
print("Dice 5:", alist.count(5), "times")
print("Dice 6:", alist.count(6), "times")
```
Output
```
Dice 1: 19 times
Dice 2: 14 times
Dice 3: 16 times
Dice 4: 15 times
Dice 5: 14 times
Dice 6: 22 times
```

## Question 4
A palindrome is a word that is spelt the same forward and backwards. Your task is to write a program that takes, as input, a single word and returns yes if it is a palindrome and no otherwise.

Code
```py
while True:
    word = input("Enter the word: ")
    check = True
    
    if word == "":
        break
    
    for i in range(len(word)):
        if word[i] != word[len(word) - i - 1]:
            check = False
    
    if check == True:
        print("The word, %sm is a palindrome." % word)
    else:
        print("The word, %sm is not a palindrome." % word) 
```
Output
```
Enter the word: level
The word, levelm is a palindrome.
Enter the word: example
The word, examplem is not a palindrome.
Enter the word: mom
The word, momm is a palindrome.
Enter the word: 
```
