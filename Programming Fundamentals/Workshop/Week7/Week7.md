# Week7

## Question1
```py
#given input data
data = ((45, 'foot'), (21, 'basket'), (10, 'hand'), (24, 'foot'), (21, 'hand'))
def unique_data_items(data):
 ''' input data is made of ((int, string), (int, string), ...)'''
 unique_nums = () #initialising the tuple
 unique_words = ()
 ''' Add code to fill the tuples unique_nums and unique_words with
 numbers and words that are unique'''

 ''' returns the pair (tuple) of unique numbers and words'''
```
A sample run of the function unique_data_items(data) will return (4, 3)

Code
```py
def unique_data_items(data):
    nums = ()
    words = ()
    for t in data:
        if t[0] not in nums:
            nums += (t[0],)
        if t[1] not in words:
            words += (t[1],)
            
    numOfUniqueNums = len(nums)
    numOfUniqueWords= len(words)
    return (numOfUniqueNums, numOfUniqueWords) 

data = ((45, 'hand'), (21, 'basket'), (10, 'hand'), (24, 'foot'), (21, 'hand'))
print(unique_data_items(data))
```

Output
```
(4, 3)
```


## Question2
Given a list of numbers, we would like to count the number of negative numbers as well as their average. Write the following functions as specified:
* Count_negatives_1, which takes in a list of numbers and returns a tuple composed of the number of negatives and the average of those negative numbers. Use list for this function. You can use a loop but avoid the use of a
loop; instead use the method sorted on a modified list of the input.
* Count_negatives_2, which takes in a list of numbers and returns a tuple composed of the number of negatives and the average of those negative numbers. But, use array operations to implement the function.

A sample run of say the function count_negatives_1([-2, 4, -3, 1]) will return (2, -2.5)

Code
```py
def count_negatives_1(data):
    data.append(0)
    data = sorted(data)
    zero = data.index(0)
    data = data[:zero]
    return len(data), sum(data)/len(data)

def count_negatives_2(data):
    data = list(filter(lambda x : x < 0, data))
    return (len(data), sum(data)/len(data))

print(count_negatives_1([-2, 4, -3, 1]))
print(count_negatives_2([-2, 4, -3, 1]))
```

Output
```
(2, -2.5)
(2, -2.5)
```

## Question3
1. Open the txt file and observe it contains rows of numbers separated by spaces. Please do not edit nor modify the given txt file.
2. Write the function read_data, which takes in a file name and returns a two-dimensional array storing all the data in the given file.
3. Write the function row_averages that takes in the data output from the function read_data and returns an array composed of the averages for each row of the data.
4. Write the function col_averages that takes in the output from the function read_data and returns an array composed of the averages for each column of data.

Code
```py
import numpy as np

def read_data(file):
    data = []
    infile = open(file, "r")
    for i in infile:
        lineData = []
        i = i.strip()
        i = i.split()
        for element in i:
            lineData.append(float(element))
        data.append(lineData)
    return np.array(data)
    
def row_averages(data):
    avg = []
    for i in data:
        sum = 0
        for j in i:
            sum += j
        avg.append(sum / len(i))
    return np.array(avg)
     
def col_averages(data):
    sum = []
    sum = len(data[0]) * [0.0]
    for i in data:
        for x in range(len(i)):
            sum[x] += i[x]
    for y in range(len(sum)):
        sum[y] /= len(data)
    return np.array(sum)

data = read_data("data.txt")
print(data)
print()
print(row_averages(read_data("data.txt")))
print(col_averages(read_data("data.txt")))
```

Output
```
[[ 23.1    3.5   56.4  -12.4    2.7   21.4 ]
 [ -2.4   36.     1.9   12.6    6.3   12.3 ]
 [ 34.6   25.   -10.8   11.3    0.7   -7.5 ]
 [  3.4   23.6   14.5   17.3   14.8  -13.45]]

[15.78333333 11.11666667  8.88333333 10.025     ]
[14.675  22.025  15.5     7.2     6.125   3.1875]
```
