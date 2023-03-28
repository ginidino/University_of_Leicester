# Binary Search Tree
* The values of each node in its left subtree is less than its value
* The values of each node in its right subtree is greater than is value
<img width="388" alt="스크린샷 2023-03-28 오후 5 46 45" src="https://user-images.githubusercontent.com/94044443/228310998-4de06bad-2a6f-49ec-8666-43708122ca0f.png">

> Node: Every subtree is a Binary Search Tree

## Binary Search Tree's Operations
* Searching a value
* Inserting a value

### Insert 2
<img width="254" alt="스크린샷 2023-03-28 오후 5 48 45" src="https://user-images.githubusercontent.com/94044443/228311441-8f42ffc6-9409-4e88-935d-e0d1bf7fcc7e.png">
<img width="283" alt="스크린샷 2023-03-28 오후 5 48 52" src="https://user-images.githubusercontent.com/94044443/228311466-8e6c3eb8-a814-446d-a792-e585b63efc44.png">
<img width="266" alt="스크린샷 2023-03-28 오후 5 49 05" src="https://user-images.githubusercontent.com/94044443/228311503-a7ae3064-d980-490e-8c70-5ffb6a7c9ce9.png">


### Insert 7
<img width="218" alt="스크린샷 2023-03-28 오후 5 49 32" src="https://user-images.githubusercontent.com/94044443/228311587-6db40f73-4cf1-4e09-96d9-828fd590e18c.png">
<img width="235" alt="스크린샷 2023-03-28 오후 5 49 50" src="https://user-images.githubusercontent.com/94044443/228311651-0b6677b7-50c0-4f20-b14e-f026b3db6cfa.png">
<img width="213" alt="스크린샷 2023-03-28 오후 5 49 59" src="https://user-images.githubusercontent.com/94044443/228311675-363e564b-1acf-4e0a-960e-93900f96dcc9.png">
<img width="241" alt="스크린샷 2023-03-28 오후 5 50 08" src="https://user-images.githubusercontent.com/94044443/228311709-7fb9980e-a4c4-45f4-ba3d-19e6b35ae961.png">

## Inserting a value in Binary Search Tree
1. Search for the value in Binary Search Tree
2. Insert when reached below leaf
<img width="423" alt="스크린샷 2023-03-28 오후 5 51 06" src="https://user-images.githubusercontent.com/94044443/228311896-ae8bbe4b-f1ce-4328-a5cb-c9e7638b3969.png">

## Insert into BST: Python Implementation
```
class TreeNode:
    def __init__(self,item=None):
        self.item=item
        self.left=None
        self.right=None

    def is_leaf(self):
        return self.left is None and self.right is None

class BinaryTree:
    def __init__(self, root):
        self.root=root
    
    #add insert fucntion here...
```
```py
    def insert(self, item):
        if self.root is None:
            self.root = TreeNode(item)
        else:
            self._insert(item, self.root)

    def _insert(self, item, currentNode):
        if item < currentNode.item:
            if currentNode.left is None:
                currentNode.left = TreeNode(item)
            else:
                self._insert(item, currentNode.left)
        elif item > currentNode.item:
            if currentNode.right is None:
                currentNode.right = TreeNode(item)
            else:
                self._insert(item, currentNode.right)
        else:
            print("Item is already existed in the tree")
```
<img width="115" alt="스크린샷 2023-03-28 오후 5 53 32" src="https://user-images.githubusercontent.com/94044443/228312461-f52502b6-3e5c-4bb6-b322-9f16222b5bc1.png">

## Searching Binary Search Tree
```py
# pseudocode to search a target in a binary search tree
search(target, Tree)
  if (Tree is empty)
    return False # not present
  if root == target
    return True
  if root > rarget # search target in Left subtree
    search(target, LeftSubtree)
  else # search target in Right subtree
    search(target, RightSubtree)
```

## Searching Binary Search Tree
<img width="417" alt="스크린샷 2023-03-28 오후 5 56 23" src="https://user-images.githubusercontent.com/94044443/228313118-053eb01d-f22d-4f3c-a3f4-1bdb74bfd530.png">

## Complete Binary Tree
* A complete binary tree is a special type of binary tree where all the levels of the tree are filled completely except the lowest level nodes which are filled from as left as possible
<img width="152" alt="스크린샷 2023-03-28 오후 5 58 01" src="https://user-images.githubusercontent.com/94044443/228313494-4782cd45-964c-4c09-8687-aff8d4a0310e.png">


