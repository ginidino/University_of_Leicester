import random
# Question1
n = int(input("How times would you like to flip the coin?: "))

for i in range(n):
    flip = random.random()
    print(flip)

    if flip > 0.5:
        print('The coin came up heads')
    else:
        print('The coin came up tails.')
print()
# Question2
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

# Question3
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
print("the sum is %d" % sum)
print("The average is %f." % (average))
print()

# Question4
count = 0
for i in range(20):
    ranNum = random.randint(1, 50)

    if ranNum % 2 == 0 and ranNum % 3 == 0:
        count += 1
        print("The generaed number that meet the requirement, item number: %d is : %d" % (count, ranNum))

print()
print("The total number of generated values shich are divisible by 2 and 3 is %d" % count)