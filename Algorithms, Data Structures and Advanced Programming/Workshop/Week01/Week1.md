# Week1 - Revision of Python

## Question1
Write a function letter_counter that takes in a word and returns a tuple formed by a histogram (a set of frequencies for all the letters in the word) and the total number of letters in the word.

COde
```py
def letter_counter(letter):
    d = {}
    for i in letter:
        i = i.split()
        for x in range(len(i)):
            if i[x] not in d:
                d[i[x]] = 1
            else:
                d[i[x]] += 1
    return d


letter = input('Enter the word: ')
print(letter_counter(letter))
```
Output
```
Enter the word: hello
{'h': 1, 'e': 1, 'l': 2, 'o': 1}
```

## Question2
Write a function named getProduct(text) where text is a string showing the product of several positive integers. The function must evaluate the expression in text and return the answer.

For example, if text = `"12*2*10"` then `getProduct(text)` must return `240`. Similarly, if text = `"4*2*3*1"` then getProduct(text) must return `24`.

You can assume that text is always a valid expression (e.g., as in the examples above) and will not contain any character other than digits and `*`.

Code
```py
def getProduct(text):
    nums = text.split("*")
    prod = 1
    for i in nums:
        prod *= int(i)
    return prod


text = input('Enter the expression: ')
print(getProduct(text))
```
Output
```
Enter the expression: 12*2*10
240
```

## Question3
Create a Student class and initialize it with name and ID number. Create the following function
1. Display - It should display all information of the student including their age and mark.
2. setAge - It should assign age to student
3. setMarks - It should assign marks to the student.
Then create an object of the class Student and check if all the methods works fine. Sample output of a Display function:
```
The student: Reza, ID Number: ID123, Age : 30, Mark: 100
```

Code
```py
class Student:
    def __init__(self, name, ID, age, mark):
        self.name = name
        self.id = ID
        self.age = int(age)
        self.mark = int(mark)

    def Display(self):
        print("The studnet: " + self.name + " ID Number: " + self.id + " Age: " + str(self.age) + " Mark: " + str(
            self.mark))

    def setAge(self, newAge):
        self.age = int(newAge)

    def setMarks(self, newMark):
        self.mark = int(newMark)


newStudent = Student("injae", "ID123", 25, 70)
newStudent.Display()
newStudent.setAge(40)
newStudent.setMarks(90)
newStudent.Display()
```
Output
```
The studnet: injae ID Number: ID123 Age: 25 Mark: 70
The studnet: injae ID Number: ID123 Age: 40 Mark: 90
```
