# Question1
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
print()

def min_Tempreture(table):
    minTemp=table[0][2]
    for row in range(1,len(table)):
        if table[row][2]<minTemp:
            minTemp=table[row][2]
    return minTemp

def max_Tempreture(table):
    maxTemp=table[0][2]
    for row in range(1,len(table)):
        if table[row][2]>maxTemp:
            maxTemp=table[row][2]
    return maxTemp

infile= open( "temp.txt" )
table=[]
Sum_Tempreture=0
for line in infile :
    line=line.split(",")
    line[2]=int(line[2])
    table.append(line)
print("The minimum tempreture of the week is: ",min_Tempreture(table)," and maximum tempreture of the week is: ",max_Tempreture(table))
print()

# Question 2
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
print()

def is_secret_guessed(secret_word, aList):
    for letter in aList:
        if letter not in secret_word:
            return False
    return True

str="Love"
letter=['L','o','v','e',]
print(is_secret_guessed(str, letter))
print()
# Question 3
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
print()

def smallestAbsoluteValue(list_given):
	smallest = list_given[0] #assume for the moment that the 0th item is the smallest
	for anItem in list_given: #consider every item
		if absVal(anItem) < absVal(smallest):
			smallest = anItem     # we do not store the absolute version as we
	return smallest
def absVal(aNumber):
	if aNumber < 0:
		return -aNumber #pass back the negated version (now positive)
	return aNumber #if got here it must already be positive so no need to negate
print()

# Question 4
def joinList(alist, separator):
    string = str(alist[0])
    for i in range(1, len(alist)):
        string += separator + str(alist[i])
    return string


alist = ["apple", 7, "mango", "orange"]
print(joinList(alist, ":"))
print()

def joinList(aList,separator):
    string = str(aList[0])
    for i in range (1, len(aList)):
        string=string + separator + str(aList[i])
    return string

aList = ["apple",7,"mango","orange"]
print(joinList(aList,'*'))
