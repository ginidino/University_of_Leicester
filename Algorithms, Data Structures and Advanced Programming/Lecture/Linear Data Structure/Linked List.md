#  Linked List

## Singly Linked List
* A linked list is a sequence of **data elements**, which are connected together via links. Each data element contains a connection to another data element in form of a pointer. Python does not have linked lists in its standard library
* A singly linked list is made of series of nodes where ceach node consists of two fields:
  * Data Field: it has the data that we want to store
  * Next pointer: points to the address of the next node in the list

<img width="662" alt="Screenshot 2023-03-25 at 8 39 49 pm" src="https://user-images.githubusercontent.com/94044443/227740574-e5bfa336-0265-46fc-bb87-84403bb06c88.png">

## Implementation of Linked List in Python
* Create Nodes: a node can be defined as class which has two attributes: data and next
```py
class Node:
 def __init__(self,data):
  self.data = data
  self.next = None
```
```py
node1 = Node("“January”")
```
* Add Nodes to linked list: in order to add nodes to the linked list, we need to create a class called *LinkedList*
