#  Linked List

## Singly Linked List
* A linked list is a sequence of **data elements**, which are connected together via links. Each data element contains a connection to another data element in form of a pointer. Python does not have linked lists in its standard library
* A singly linked list is made of series of nodes where ceach node consists of two fields:
  * Data Field: it has the data that we want to store
  * Next pointer: points to the address of the next node in the list

<img width="662" alt="Screenshot 2023-03-25 at 8 39 49 pm" src="https://user-images.githubusercontent.com/94044443/227740574-e5bfa336-0265-46fc-bb87-84403bb06c88.png">

## Implementation of Linked List in Python
* **Create Nodes:** a node can be defined as class which has two attributes: data and next
```py
class Node:
 def __init__(self,data):
  self.data = data
  self.next = None
```
```py
node1 = Node("“January”")
```
* **Add Nodes to linked list:** in order to add nodes to the linked list, we need to create a class called *LinkedList*
<img width="102" alt="스크린샷 2023-03-27 오후 8 40 58" src="https://user-images.githubusercontent.com/94044443/228049042-3eb8233c-a813-488a-b0ce-ad8db63f8ce0.png">
```py
node1 = Node("“January”")
```

```py
class Node:
 def __init__(self,data):
  self.data = data
  self.next = None
  
  def insert(self, newNode):
   if self.head is None:
    self.head=newNode
   else:
    lastNode=self.head
    while True:
     if lastNode.next is None:
      break
     lastNode=lastNode.next
    lastNode.next=newNode
```
```py
node1 = Node(“Jan”)
lnklist = LinkedList()
lnklist.insert(node1)

node2 = Node(“Feb”)
lnklist.insert(node2)

node3 = Node(“Mar”)
lnklist.insert(node3)
```
<img width="298" alt="스크린샷 2023-03-27 오후 8 43 02" src="https://user-images.githubusercontent.com/94044443/228049473-e40d2b2b-bad3-40e6-8ab0-57aa1325d6f6.png">

* **Add new node as a head node:**
<img width="440" alt="스크린샷 2023-03-27 오후 8 44 50" src="https://user-images.githubusercontent.com/94044443/228049806-2547142a-a836-49e0-b3c3-f3d881f57c0c.png">

* Step 1: store the current head node inot a temporary node
* Step 2: make the new node as a head node
* Step 3: make the next of your new node point to the temporary node

* **Add new node as a head node:** in order to add nodes to the linked list, we need to creade a class called *LinkedList*

```py
class Node:
 def __init__(self,data):
  self.data = data
  self.next = None
  
  def insert(self, newNode):
   if self.head is None:
    self.head=newNode
   else:
    lastNode=self.head
    while True:
     if lastNode.next is None:
      break
     lastNode=lastNode.next
    lastNode.next=newNode
   
   def insertHead(self, newNode):
    tempNode = self.head
    self.head = newNode
    self.head.next = tempNode
    del tempNode
```
```py
node4 = Node(“Jan”)
lnklist.insertHead(node4)
```
<img width="296" alt="스크린샷 2023-03-27 오후 8 47 12" src="https://user-images.githubusercontent.com/94044443/228050298-27595377-4f70-410c-b9d6-4497da50148c.png">

* **Add new node at specific position:**
<img width="421" alt="스크린샷 2023-03-27 오후 8 49 46" src="https://user-images.githubusercontent.com/94044443/228050830-81d79215-b508-4cea-b74a-6da92a66cb22.png">

* Step 1: traverse the list till that specific position
* Step 2: store the details of the previous node
* Step 3: make a connection from the next of previous node to a new node

```py
class Node:
 def __init__(self,data):
  self.data = data
  self.next = None
  
  def insert(self, newNode):
   if self.head is None:
    self.head=newNode
   else:
    lastNode=self.head
    while True:
     if lastNode.next is None:
      break
     lastNode=lastNode.next
    lastNode.next=newNode
   
   def insertHead(self, newNode):
    tempNode = self.head
    self.head = newNode
    self.head.next = tempNode
    del tempNode
    
   def insertAt(self, newNode, position):
    currentNode=self.head
    currentPosition=0
    while True:
     if currentPosition == position:
      previousNode.next=newNode
      newNode.next=currentNode
      break
     previousNode=currentNode
     currentNode=currentNode.next
     currentPosition += 1
```
```py
node4 = Node(“Feb”)
lnklist.insertAt(node4, 1)
```
<img width="271" alt="스크린샷 2023-03-27 오후 8 50 37" src="https://user-images.githubusercontent.com/94044443/228051019-da3721cf-9af8-443b-b146-ae32cfa0c3d1.png">

* **List Traversal:**
```py
Class LinkedList:
 def __init__(self):
  self.head=None
  
 def traversal(self):
  currentNode=self.head
  while currentNode is not None:
   print(currentNode.data)
   currentNode=currentNode.next
```

* **Delete a node from the end of the list:**
<img width="422" alt="스크린샷 2023-03-27 오후 8 52 46" src="https://user-images.githubusercontent.com/94044443/228051476-5c8426cb-bc1e-4dd6-aa1f-4f4cbf7932bb.png">

* Traverse till end of the list
* Store the last second node into a temporary node
* Delete the last node
* Make the next of temporary node points to **None**

```py
class Node:
 def __init__(self,data):
  self.data = data
  self.next = None
  
  def insert(self, newNode):
   if self.head is None:
    self.head=newNode
   else:
    lastNode=self.head
    while True:
     if lastNode.next is None:
      break
     lastNode=lastNode.next
    lastNode.next=newNode
   
   def insertHead(self, newNode):
    tempNode = self.head
    self.head = newNode
    self.head.next = tempNode
    del tempNode
    
   def insertAt(self, newNode, position):
    currentNode=self.head
    currentPosition=0
    while True:
     if currentPosition == position:
      previousNode.next=newNode
      newNode.next=currentNode
      break
     previousNode=currentNode
     currentNode=currentNode.next
     currentPosition += 1
   
   def deleteEnd(self):
    lastNode=self.head
    while lastNode.next is not None:
     prevNode=lastNode
     lastNode=lastNode.next
    prevNode.next=None 
```
```py
lnklist.deleteEnd()
```
<img width="303" alt="스크린샷 2023-03-27 오후 8 54 20" src="https://user-images.githubusercontent.com/94044443/228051821-2b08ae97-6058-4a72-8c5d-86dc22c6b1a5.png">

* Check if the list is empty
```py
Class LinkedList:
 def __init__(self):
  self.head=None

 def isEmpty(self):
  if self.head is None:
   return True
  else:
   return False
```

* **Delete a node from the head of the list:**
```py
class Node:
 def __init__(self,data):
  self.data = data
  self.next = None
  
  def insert(self, newNode):
   if self.head is None:
    self.head=newNode
   else:
    lastNode=self.head
    while True:
     if lastNode.next is None:
      break
     lastNode=lastNode.next
    lastNode.next=newNode
   
   def insertHead(self, newNode):
    tempNode = self.head
    self.head = newNode
    self.head.next = tempNode
    del tempNode
    
   def insertAt(self, newNode, position):
    currentNode=self.head
    currentPosition=0
    while True:
     if currentPosition == position:
      previousNode.next=newNode
      newNode.next=currentNode
      break
     previousNode=currentNode
     currentNode=currentNode.next
     currentPosition += 1
   
   def deleteEnd(self):
    lastNode=self.head
    while lastNode.next is not None:
     prevNode=lastNode
     lastNode=lastNode.next
    prevNode.next=None 
   
   def deleteHead(self):
    if self.isEmpty() is False:
     prevHead=self.head
     self.head=self.head.next
     prevHead.next=None
     print("The first item is deleted successfully")
    else:
     print("Linked List is empty, Delete Failed")
```
```py
lnklist.deleteHead()
```
<img width="229" alt="스크린샷 2023-03-27 오후 8 56 51" src="https://user-images.githubusercontent.com/94044443/228052341-d99e5736-0182-4777-87d4-995f5d104aec.png">

* **Delete a node from the specific postion:**
<img width="426" alt="스크린샷 2023-03-27 오후 8 59 54" src="https://user-images.githubusercontent.com/94044443/228052975-ba232b07-3335-4fb7-8b53-d953a3259a57.png">

* Traverse till the node that need to be deleted
* Store the details of the previous node
* Establish a connection from the next of the previous node to the next of this node
* Make the next of this node points to **None**

```py
Class LinkedList:
 def __init__(self):
  self.head=None

 def deleteAt(self,position):
  currentNode=self.head
  currentPosition=0
  while True:
   if currentPosition == position:
    prevNode.next=currentNode.next
    currentNode.next=None
    break
   prevNode=currentNode
   currentNode=currentNode.next
   currentPosition +=1
```
```py
lnklist.deleteEnd()
```
<img width="244" alt="스크린샷 2023-03-27 오후 8 59 37" src="https://user-images.githubusercontent.com/94044443/228052930-526e36d7-13d5-4492-8b83-f50af7af62eb.png">
