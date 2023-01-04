# Week3 Workshop

## Question1
Prepare a python program that can compute the solution for the following series (using loops)   
<img src="/path/to/task1.jpg"></img>

Code
```py
result = 0
for i in range(1, 11):
    result = result + (3 * i)
print(result)
```
Output
```
165
```

Let’s make this a little more interesting, let’s allow the start and end values to be chosen by the user. For example:
Sample output:   
Where should i start? 3   
Where should i stop? 5   
The result for sum of 3i from 3 to 5 is: 36

Code
```py
start = int(input("Where should I start: "))
stop = int(input("Where should I stop: "))
result = 0

for i in range(start, stop + 1):
    result = result + (3 * i)
print(result)
```
Output
```
Where should I start: 3
Where should I stop: 5
36
```

Extend your program so that the start and stop values are random between 1 to 10

Code
```py
import random

start = random.randint(1, 10)
print(start)
stop = random.randint(1, 10)
print(stop)
sum = 0

if start < stop:
    for i in range(start, stop + 1):
        sum += 3 * i
else:
    print("invalid")
print(sum)
```
Output
```
1
4
30
```
```
invalid
0
```

## Question 2

Write a program to calculate the following by asking the user the start and stop values.

Code
```py
i = int(input("Enter the start value: "))
n = int(input("Enter the stop value: "))

sum = 0

for i in range(i, n + 1):
    sum = 2 * pow(i, 2) + 4 * i
print(sum)
```
Output
```
i = int(input("Enter the start value: "))
n = int(input("Enter the stop value: "))

sum = 0

for i in range(i, n + 1):
    sum = 2 * pow(i, 2) + 4 * i
print(sum)
```

## Question 3
Write a program to calculate the following: `Sum = 2 / 2! - 4/4! + 6/6! - 8 /8!`

Code
```py
num = 2
sum = 0
sum1 = 0
fact = 1
for i in range(1, 9):
    fact *= i
    if i % 2 == 0:
        if i % 4 == 0:
            sum -= num / fact
        else:
            sum1 += num / fact
        num += 2
print(sum + sum1)
```
Output
```
0.841468253968254
```

## Question 4
Write a program to get 10 words from user, count those start with vowel letter. Assume all the words start with capital letter.

Code
```py
count = 0
for i in range(10):
    word = input("Enter the word: ")
    cap_word = word.capitalize()
    print(cap_word)
    vowels = ("A", "E", "I", "O", "U")
    
    if cap_word[0] in vowels:
        count += 1
    
print(count)
```
Output
```
Enter the word: example
Example
Enter the word: exercise
Exercise
Enter the word: apple
Apple
Enter the word: university
University
Enter the word: output
Output
Enter the word: integer
Integer
Enter the word: task
Task
Enter the word: letter
Letter
Enter the word: task
Task
Enter the word: bit
Bit
6
```

## Question 5 
For this task, we want to think about how to generate a group of numbers from one up to value given by user so that they all have the same number of digits as the number entered by user. For example, if the user enters 122, then all numbers from 1 to 122 must be represented with three digits. See further example below:
```
Sample output:
Enter an integer number: 12
00
01
02
03
04
05
06
07
08
09
10
11
12
```

If the user enters 122, then the output will be as follow:
```
000
001
002
.
.
.
099
100
101
.
.
.
120
121
122
```

Code
```py
num = int(input("Enter an integer number: "))
for i in range(num + 1):
    s_i = str(i)
    
    while len(s_i) < len(str(num)):
        s_i = '0' + s_i
    print(s_i)
```
Output
```
Enter an integer number: 122
000
001
002
003
004
005
006
007
008
009
010
011
012
013
014
015
016
017
018
019
020
021
022
023
024
025
026
027
028
029
030
031
032
033
034
035
036
037
038
039
040
041
042
043
044
045
046
047
048
049
050
051
052
053
054
055
056
057
058
059
060
061
062
063
064
065
066
067
068
069
070
071
072
073
074
075
076
077
078
079
080
081
082
083
084
085
086
087
088
089
090
091
092
093
094
095
096
097
098
099
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
```
