# Queues
* Unlike stacks, a queue is open at both its ends. One end is always used to `insert data (enqueue)` and the other is used to `removed data (dequeue)`
* A Queues is like a list except
  - only interact with the front and rear
  - `append` something to put it at the end of the queue (enqueue)
  - `serve` to take from the front of the queue (dequeue)
  - check its size
* This kind of behaviour is commonly referred to as **First in First Out**

## Queues: A simple implementation
One way to implelemt is as a python list
```
front -> [3][7][5][2][0] <- rear
```
Python lists have the folloving operations:
* Append - our append operation
* Pop(0) - this will be our seve operation
* Len - this will be our size operation

## Removing negative numbers from a queue
```py
"""
This function will take a queue of numbers and remove the items < 0
"""
def removeNegatives(aQueue):
  numberSeen = 0
  n = len(aQueue)
  while numberSeen <= n:
    item = aQueue.pop(0)
    numberSeen+=1
    if item >=0:
      #only positive numbers are put back in
      aQueue.append(item)
```
