# Tutorial3

## Question 1:
Write a program that takes a number N as input from the user and simulates N coin flips printing the results each time.
> Hint: use random.random(), anything above 0.5 represents Head otherwise Tails

Sample output
```
How times would you like to flip the coin? 5
The coin came up heads.
The coin came up tails.
The coin came up tails.
The coin came up heads.
The coin came up heads.
```
Code
```py
import random

n = int(input("How times would you like to flip the coin?: "))

for i in range(n):
    flip = random.random()
    print(flip)

    if flip > 0.5:
        print('The coin came up heads')
    else:
        print('The coin came up tails.')
```
Output
```
How times would you like to flip the coin?: 5
0.6475186755369506
The coin came up heads
0.7969042486334925
The coin came up heads
0.8505106140665669
The coin came up heads
0.1793420442007504
The coin came up tails.
0.825978447022407
The coin came up heads
```

## Question 2:
Modify the program from question 1 to store the number of heads and tails in variables. Once you have generated the variables, print the total number of heads and the total number of tails. Calculate the ratio of heads to the total coin flips. The ratio of two number A and B is A/B

Code
```py
import random

tries = int(input("How times would you like to flip the coin?: "))

head = 0
tail = 0
for i in range(tries):
    coin = random.random()
    print(coin)

    if coin > 0.5:
        print('The coin came up heads')
        head += 1
    else:
        print('the coin came up tails')
        tail += 1
print()
print("The total number of head is %d and the ratio of heads is %f. " % (head, head / tries))
print("The total number of tails is %d and the ratio of tails is %f. " % (tail, tail / tries))

```

Output
```
How times would you like to flip the coin?: 5
0.32033719197532007
the coin came up tails
0.923616975950199
The coin came up heads
0.21612898027407557
the coin came up tails
0.024497640948380806
the coin came up tails
0.8176490385026415
The coin came up heads

The total number of head is 2 and the ratio of heads is 0.400000. 
The total number of tails is 3 and the ratio of tails is 0.600000. 
```

## Question 3:
Write a program to get 10 student’s mark and calculate the average mark.

Code
```py
sum = 0
average = 0
count = 0
for i in range(10):
    mark = int(input("Enter 10 students's mark: "))
    count += 1
    if mark < 0 or mark > 100:
        print("invalid output")
        break

    sum += mark
    average = sum / count

print("The average is %f." % (sum, average))
```

Output
```
Enter 10 students's mark: 100
Enter 10 students's mark: 98
Enter 10 students's mark: 78
Enter 10 students's mark: 67
Enter 10 students's mark: 85
Enter 10 students's mark: 34
Enter 10 students's mark: 56
Enter 10 students's mark: 74
Enter 10 students's mark: 65
Enter 10 students's mark: 75
the sum is 732
The average is 73.200000.
```

## Question 4
Write a program to generate 20 random number from 1 to 50, display those which are divisible by 3 and 2. The following is the sample output:
```
The generated number that meet the requirement, item number: 1 is: 24
The generated number that meet the requirement, item number: 2 is: 36
The generated number that meet the requirement, item number: 3 is: 6
The generated number that meet the requirement, item number: 4 is: 24

The total number of generated values which are divisible by 2 and 3 is: 4
```

Code
```py
import random

count = 0
for i in range(20):
    ranNum = random.randint(1, 50)

    if ranNum % 2 == 0 and ranNum % 3 == 0:
        count += 1
        print("The generaed number that meet the requirement, item number: %d is : %d" % (count, ranNum))

print()
print("The total number of generated values shich are divisible by 2 and 3 is %d" % count)
```

Output
```
The generaed number that meet the requirement, item number: 1 is : 48
The generaed number that meet the requirement, item number: 2 is : 42
The generaed number that meet the requirement, item number: 3 is : 12
The generaed number that meet the requirement, item number: 4 is : 48

The total number of generated values shich are divisible by 2 and 3 is 4
```
