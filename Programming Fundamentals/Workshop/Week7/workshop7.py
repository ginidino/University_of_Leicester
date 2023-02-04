# Task1
def unique_data_items(data):
    nums = ()
    words = ()
    for t in data:
        if t[0] not in nums:
            nums += (t[0],)
        if t[1] not in words:
            words += (t[1],)

    numOfUniqueNums = len(nums)
    numOfUniqueWords = len(words)
    return (numOfUniqueNums, numOfUniqueWords)


data = ((45, 'hand'), (21, 'basket'), (10, 'hand'), (24, 'foot'), (21, 'hand'))
print(unique_data_items(data))
print()

# Task2
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

# Task3
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