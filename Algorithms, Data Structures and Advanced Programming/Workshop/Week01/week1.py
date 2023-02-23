# Task1
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
print()

# Task2
def getProduct(text):
    nums = text.split("*")
    prod = 1
    for i in nums:
        prod *= int(i)
    return prod


text = input('Enter the expression: ')
print(getProduct(text))
print()

# Task3
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