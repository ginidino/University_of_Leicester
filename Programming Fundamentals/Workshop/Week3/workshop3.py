# Task 1
sum = 0
for i in range(1, 11):
    sum += 3 * i
print(sum)
print()

# Task1-1
result = 0
start = int(input('Enter the start number: '))
stop = int(input('Enter the stop number: '))

for i in range(start, stop + 1):
    result += 3 * i
print(result)
print()

# Task1-2
import random
start_ran = random.randint(1, 10)
stop_ran = random.randint(1, 10)
print(start_ran)
print(stop_ran)

add = 0
if start_ran < stop_ran:
    for i in range(start_ran, stop_ran + 1):
        add += i
else:
    print('invalid')
print(add)
print()

# Task 2
total = 0
k = int(input('Enter the start number: '))
n = int(input('Enter the stop number: '))

for count in range(k, n + 1):
    total += 2 * count ** 2 + 4 * count
print(total)
print()


# Task3
num = 2
sum = 0
sum1 = 0
fact = 1
for i in range(1, 8):
    fact *= i
    if i % 2 == 0:
        if i % 4 == 0:
            sum -= num / fact
        else:
            sum1 += num / fact
        num += 2


print(sum + sum1)
print()

fact = 1
sign = 1
result = 0
count = 1
while count <= 8:
    fact = fact * count
    if count % 2 == 0:
        result = result + ((sign * count) / fact )
        sign = -sign
    count = count + 1
print('The output of this series is : ', round(float(result),2))
print()

# Task4
count = 0
for i in range(10):
    word = input('Enter the word: ')
    cap_word = word.capitalize()
    print(cap_word)
    vowels = ('A', 'E', 'I', 'O', 'U')

    if word[0] in vowels:
        count += 1

print(count)
print()

count=0
for i in range (10):
    name=input("Name: ")
    if name[:1] == 'A' or name[:1]=='O' or name[:1]=='U' or name[:1]=='I' or name[:1]=='E':
        count =count + 1
print(count)
print()

# Task5
num = int(input('Enter an integer number: '))
str_num = 0
for i in range(num):
    if len(str(i)) < len(str(num)):
        str_num = '0' + str(num)
print(str_num)
print()

n = int(input("please insert an integer number: "))
maxDigit=len(str(abs(n)))
count=0
for count in range(n+1):
    diff=maxDigit - len(str(abs(count)))
    if diff > 0:
        count = "0" * diff + str(count)
    print(count)