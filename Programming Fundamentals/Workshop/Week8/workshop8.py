# Question1
def read_data(file):
    d = {}
    file = open(file, "r")
    for i in file:
        i = i.strip("\n").split()
        for x in range(len(i)):
            if i[x] not in d:
                d[i[x]] = 1
            else:
                d[i[x]] += 1
    return d


data = read_data("text1.txt")
print(data)
print()

# Question2
def word_search(docs, word):
    output = set()
    for i in docs:
        docs = open(i, "r")
        for row in docs:
            row = row.lower()
            wordList = row.split()
            if word.lower() in wordList:
                output.add(i)
    if output == set():
        return ("Could not find a match")
    else:
        return output


def multi_word_search(docs, keyword):
    d = {}
    for word in keyword:
        print(word)
        testDict = {word: []}
        d.update(testDict)
        for i in docs:
            doc = open(i, "r")
            for row in doc:
                row = row.lower()
                wordList = row.split()
                if word in wordList:
                    d[word].append(i)
    return d


docs = {'doc1.txt', 'doc2.txt', 'doc3.txt'}
print(word_search(docs, 'casino'))
print(multi_word_search(docs, ['casino', 'they', 'kind']))
print()

# Question3
def winners(data):
    d = {}
    for i in data:
        if i['name'] == None:
            i['name'] = 'Unknown'
        if i['finish'] == 1:
            for item in i['items']:
                if item not in d:
                    dictUpdate = {item: 1}
                    d.update(dictUpdate)
                else:
                    d[item] += 1
    return d


x = [{'name': 'Peach', 'items': ['green shell', 'banana', 'green shell', ], 'finish': 1},
     {'name': 'Bowser', 'items': ['green shell', ], 'finish': 3},
     # Sometimes the racer's name wasn't recorded
     {'name': None, 'items': ['mushroom', ], 'finish': 1},
     {'name': 'Toad', 'items': ['green shell', 'mushroom'], 'finish': 2}]
print(winners(x))