# Week8

## Question 1
Write a function that takes as input a text file and returns a tuple formed by a histogram - a set of frequencies for all the words in the text file - and the total number of words in the file. Assume the text file does not contain punctuations.

Code
```py
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
```
Output
```
{'The': 3, 'Avenue': 2, 'Range': 2, 'Station': 1, 'massacre': 1, 'was': 4, 'the': 13, 'murder': 2, 'of': 7, 'at': 1, 'least': 1, 'nine': 1, 'Aboriginal': 2, 'Tanganekald': 1, 'people,': 1, 'who': 2, 'were': 4, 'shot': 1, 'by': 3, 'white': 1, 'settlers': 1, 'on': 2, 'pastoral': 1, 'station': 1, 'in': 3, 'colony': 1, 'South': 1, 'Australia': 1, 'around': 1, 'September': 1, '1848,': 1, 'during': 1, 'Australian': 1, 'frontier': 1, 'wars.': 1, 'Those': 1, 'confirmed': 1, 'to': 1, 'have': 1, 'been': 2, 'killed': 1, 'an': 1, 'old': 1, 'blind': 1, 'man,': 1, 'three': 2, 'women,': 1, 'two': 1, 'teenage': 1, 'girls,': 1, 'and': 3, 'female': 1, 'children,': 1, 'including': 1, 'a': 2, 'baby.': 1, 'sheep': 1, 'farmer': 1, 'James': 1, 'Brown': 2, '(pictured)': 1, 'his': 1, 'overseer,': 1, 'Eastwood,': 1, 'suspected,': 1, 'charged': 1, 'with': 1, '"unknown': 1, 'aboriginal': 1, 'natives"': 1, 'March': 1, '1849.': 1, 'magistrate': 1, 'committed': 1, 'him': 1, 'for': 1, 'trial': 1, 'said': 1, 'that': 1, 'there': 2, '"little': 1, 'question': 1, 'butchery': 1, 'or': 1, 'butcher".': 1, 'Further': 1, 'investigation': 1, 'ordered,': 1, 'but': 1, 'November': 1, '1849': 1, 'sittings': 1, 'Supreme': 1, 'Court': 1, 'colonial': 1, 'capital': 2, 'Adelaide,': 1, 'case': 1, 'had': 1, 'dropped.': 1, 'At': 1, 'time': 1, 'significant': 1, 'restrictions': 1, 'use': 1, 'evidence': 1, 'given': 1, 'witnesses,': 1, 'especially': 1, 'where': 1, 'verdict': 1, 'could': 1, 'involve': 1, 'punishment.': 1}
```
## Question 2
A police officer has received few reports. But they want to pay attention to reports including a specific word.
1. Write a function word_search, which takes as inputs a set of reports and a keyword to return all the reports that contain the given keyword. Your function should meet the following criteria
    * Do not include documents where the keyword string shows up only as a part of a larger word. For example, if she were looking for the keyword “closed”, you would not include the string “enclosed.”
    * She does not want you to distinguish upper case from lower case letters. So the phrase “Closed the case.” would be included when the keyword is “closed”
    * The punctuation was removed from the text so no commas, full stop, etc.

Example: If you have

`docs = {“doc1.txt”, “doc2.txt”, “doc3.txt”}` wherein
* doc1 contains "The Learn Python Challenge Casino",
* doc2 contains "They bought a car",
* and doc 3 contains "Casinoville", then, your function
`word_search(docs, 'casino')` would return
`{'doc1.txt'}`

2. As we would like to also enable multiple searches, write a function, `multi_word_search`, which takes as inputs a set of documents and a list of keywords to return a dictionary mapping each keyword to a list of documents that contain it.

Code
```py
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
```
Output
```
{'doc1.txt'}
casino
they
kind
{'casino': ['doc1.txt'], 'they': ['doc2.txt'], 'kind': ['doc3.txt']}
```
## Question 3
A game player is trying to perform an analysis to determine the best items for winning races on the Mario Kart circuit. He has some data in the form of list of dictionaries that look like:
```
[
{'name': 'Peach', 'items': ['green shell', 'banana', 'green
shell',], 'finish': 1},
{'name': 'Bowser', 'items': ['green shell',], 'finish': 3},
# Sometimes the racer's name wasn't recorded
{'name': None, 'items': ['mushroom',], 'finish': 1},
{'name': 'Toad', 'items': ['green shell', 'mushroom'], 'finish':
2}
]
```
* “items” is a list of all the power-up items the racer picked up in that race, and
* “finish” was their placement in the race (1 for first place, 3 for third, etc.).

Write a function winners that takes in a list of dictionaries as given above and return a dictionary mapping items to the number of times those items were picked up by racers who finished in first place. If the racer’s name is missing, replace it by `‘Unknown’` in the dataset.

Code
```py
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
            
    
    
x = [{'name': 'Peach', 'items': ['green shell', 'banana', 'green shell',], 'finish': 1},
{'name': 'Bowser', 'items': ['green shell',], 'finish': 3},
# Sometimes the racer's name wasn't recorded
{'name': None, 'items': ['mushroom',], 'finish': 1},
{'name': 'Toad', 'items': ['green shell', 'mushroom'], 'finish': 2}]
print(winners(x))
```
Output
```
{'green shell': 2, 'banana': 1, 'mushroom': 1}
```
