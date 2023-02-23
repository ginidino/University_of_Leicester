# Reading Files

# Write a function that takes a filename and returns a list of lists.
# The sublists should contain the contents of each line of the file, which are separated by commas.

### File Contents ###
'''
a, b, c
1, 2, 3, 4
one, two, three
a, b, 0, c
111111, 1111a1111, 00001234
'''

### Expected Output ###
# [['a', 'b', 'c'], [1, 2, 3, 4], ['one', 'two', 'three'], ['a', 'b', 0, 'c'], [111111, '1111a1111', '00001234']]

### Solution ###

# This solution to the number conversion is a bit hacky. There is a slightly more complex alternative solution below if you are interested.
#
# NOTE: This solution will convert strings with leading 0s [i.e '00001234' -> 1234] which is maybe a bad idea.
#       I am leaving it to keep things simple. Can you fix it?
def convertNumbers(input_list):
    output_list = []
    for element in input_list:
        try:
            element = int(element)
        # If there is an error converting the string (meaning it is not an integer string), then just move on to the next element.
        except ValueError:
            pass # 'pass' means 'do nothing'
        output_list.append(element)
    return output_list


def readFile(filename):
    file = None
    try:
        file = open(filename)

        contents = []
        for line in file:
            line = line.strip().replace(' ', '')
            sublist = line.split(',')
            sublist = convertNumbers(sublist) # function is implemented above

            contents.append(sublist)
        return contents

    except FileNotFoundError:
        print(f"{filename} does not exist")
        return []
    except:
        print(f"Error processing {filename}")
        return []
    finally:
        if file is not None:
            file.close()


print(readFile("file.txt"))



### Here is an alternative 'non-hacky' way to convert the numbers in a list of strings to integers
### It is much less efficient to do it this way because we have to check every character of every string
def stringIsInteger(input_string):
    # There are two conditions a string must meet for it to be a valid integer:
    #     - It contains only numerical characters ['1111a1111' is not valid]
    #     - The first character is not a 0 ['00001234' is not valid - it could be an id or something like that]
    #           - The string '0' is an exception. 0 is obviously an integer

    # Checking first condition
    numerical_characters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}
    for character in input_string:
        if character not in numerical_characters:
            return False

    return input_string[0] != '0' or input_string == '0'  # Checking second condition


def alternative_convertNumbers(input_list):
    output_list = []
    for element in input_list:
        # This check is required because if we try to convert elements that aren't integers (e.g 'a', 'one', '1111a1111'), we get a ValueError.
        if stringIsInteger(element):
            element = int(element)
        output_list.append(element)

    return output_list


# OOP

# Create a class called Person with three attributes: name, age, location
# Add setters for these attributes
# Add a constructor that takes the three class attributes as parameters
# Add a function readFromFile(personFile) that takes a filename as a parameter and sets the person's attributes to the contents of the file
# Add a __str__() function that converts the person to a string

### File Contents ###
'''
Scott, 23, Leicester
'''


### Solution ###
class Person:
    def __init__(self, name=None, age=None, location=None):
        self.name = name
        self.age = age
        self.location = location

    # NOTE: This is 90% just copied from the previous question!
    def readFromFile(self, personFile):
        file = None
        try:
            file = open(personFile)
            # The loop isn't really necessary to read a single line file. There are better options ( e.g file.read() ).
            for line in file:
                line = line.strip().replace(' ', '')
                line = line.split(',')

                self.setName(line[0])
                self.setAge(int(line[1]))
                self.setLocation(line[2])
                break

        except  FileNotFoundError:
            print(f"{personFile} does not exist")
        except:
            print(f"Error processing {personFile}")
        finally:
            if file is not None:
                file.close()

    def setName(self, name):
        self.name = name

    def setAge(self, age):
        self.age = age

    def setLocation(self, location):
        self.location = location

    def __str__(self):
        return f"Name: {self.name}, Age: {self.age}, Location: {self.location}"


person = Person("Scott", 23, "Leicester")
print(person)

person2 = Person()
person2.readFromFile("personFile.txt")
print(person2)
