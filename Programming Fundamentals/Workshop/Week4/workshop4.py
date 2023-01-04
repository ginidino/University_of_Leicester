# Qustion1
num = 0
alist = []
while num < 5:
    list_num = int(input('Enter the number: '))
    num += 1
    alist.append(list_num)

print(alist)

# Question 1-1
num = 0
alists = []
while num < 5:
    list_num = int(input('Enter the number: '))
    num += 1

    powNum = pow(list_num, 2)
    alists.append(powNum)

print(alists)

# Question2
lists = []
x = [int(x) for x in input("Enter some numbers: ").split()]
y = [float(y) for y in input("Enter some numbers: ").split()]
for i in range(5):
    print(lists)

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

# Question3
"""Write a program in Python that simulates the rolling of 100 dice, by generating a number from 1 to 6, it then count the number of times each dice has appeared and stores these numbers in a list and display"""
import random
dice_list = []
for i, dice in enumerate(dice_list, start=1):
    dice = random.randint(1, 100)
    dice_list.append(dice)
print("Dice", i, ":", dice, "times")
# Question4
while True:
    word = input('Enter the word: ')
    check = True

    if word == '':
        break

    for i in range(len(word)):
        if word[i] != word[len(word) - i - 1]:
            check = False

    if check == True:
        print("The text, %s, is a palindrome!" % word)
    else:
        print("The text, %s, is not a palindrome!" % word)
