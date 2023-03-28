## Binary Tree
* Every node has at most two children
* Every subtree is a Binary Tree
* Note: Empty tree is also a binary tree

<img width="453" alt="스크린샷 2023-03-28 오후 5 23 47" src="https://user-images.githubusercontent.com/94044443/228305713-638a3824-269f-4002-9cae-79183e591bf5.png">

## Perfect Binary Tree
<img width="692" alt="스크린샷 2023-03-28 오후 5 24 15" src="https://user-images.githubusercontent.com/94044443/228305827-ef7caa0a-14ac-4e2c-8d24-9e6e21edbce8.png">

## Unbalanced Binary Tree
<img width="313" alt="스크린샷 2023-03-28 오후 5 24 43" src="https://user-images.githubusercontent.com/94044443/228305921-853c1813-12ac-4472-bb26-ef72027faac4.png">

## Balanced Binary Tree
<img width="600" alt="스크린샷 2023-03-28 오후 5 24 53" src="https://user-images.githubusercontent.com/94044443/228305952-0a339a90-5bc1-4ef1-9634-3d3051a2163b.png">

For every node     
|height(left subtree) - height(right subtree)| <= 1

## Binary Tree Implementation in Python
```py
class TreeNode:
    def __init__(self, item=None):
        self.item = item
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self):
        self.root = None
```
```py
ex1 = TreeNode(1)
bt = BinaryTree(ex1)
ex1.left = TreeNode(2)
ex1.right = TreeNode(3)
ex1.left.left = TreeNode(4)
ex1.left.right = TreeNode(5)
```
<img width="211" alt="스크린샷 2023-03-28 오후 5 27 44" src="https://user-images.githubusercontent.com/94044443/228306619-d764a158-26db-46fd-b123-c74cd9bbb386.png">

## The Size of Binary Tree
```py
def __len__(self):
    return self.len_aux(self.root)

def len_aux(self, current):
    if current is None:
        return 0
    else:
        return 1 + self.len_aux(current.left) + self.len_aux(current.right)
```
```py
print(bt.__len__())
```
The output will be 5 for the given Tree

## Calculate the Height of the Binary Tree
```py
def height(self):
    return self.height_aux(self.root)

def height_aux(self, current):
    if current is None:
        return -1
    else:
        return 1 + max(self.height_aux(current.left), self.height_aux(current.right))
```

## Traversal
* Systematic way of **visiting**/processing **all the nodes**
* **Methods:** Preorder, Inorder, and Postorder
* They **all** traverse the left subtree before the right subtree. It's all about the **position of the root**

<img width="614" alt="스크린샷 2023-03-28 오후 5 32 19" src="https://user-images.githubusercontent.com/94044443/228307638-b19134f8-6cf5-4ae7-8603-f21426155e13.png">

## Example: Preorder
<img width="675" alt="스크린샷 2023-03-28 오후 5 32 44" src="https://user-images.githubusercontent.com/94044443/228307719-7409cb14-1c86-4607-b687-376ccc6dfc2a.png">

```
[43][31][20][28][40][33][64][56][47][59][89]
```

## Print Preorder Traversal
1. Print the **root** node
2. Traverse the **left** subtree
3. Traverse the **right** subtree

```py
def print_preorder(self):
    self.print_preorder_aux(self.root)

# The helper method receives a reference to the "next root"

def print_preorder_aux(self, current):
    if current is not None: # if not a base case
        print(current)
        self.print_preorder_aux(current.left)
        self.print_preorder_aux(current.right)
```
```py
class TreeNode:
    def __init__(self, item = None):
        self.item = item
        self.left = None
        self.right = None

    def __str__(self):
        return str(self.item)
```

## Print Inorder Traversal
<img width="704" alt="스크린샷 2023-03-28 오후 5 37 12" src="https://user-images.githubusercontent.com/94044443/228308705-9616fe6c-d47b-48bc-9b24-c9b00d9ea424.png">

## Example: Inorder
<img width="697" alt="스크린샷 2023-03-28 오후 5 37 30" src="https://user-images.githubusercontent.com/94044443/228308779-fa4d57e6-f1fd-4247-b2b3-a0aed310a7aa.png">

```
[20][28][31][33][40][43][47][56][59][64][89]
```
1. Print the **left** subtree
2. Traverse the **root** node
3. Traverse the **right** subtree

```py
def print_inorder(self):
    self.print_inorder_aux(self.root)

def print_inorder_aux(self, current):
    if current is not None: # if not a base case
        self.print_preorder_aux(current.left)
        print(current)
        self.print_inorder_aux(current.right)
```

## Print Postorder Traversal
<img width="648" alt="스크린샷 2023-03-28 오후 5 39 55" src="https://user-images.githubusercontent.com/94044443/228309352-7f92d4d5-64c6-42b6-9dd4-0e5058758130.png">

<img width="686" alt="스크린샷 2023-03-28 오후 5 40 20" src="https://user-images.githubusercontent.com/94044443/228309424-f5b5f8e9-d1ca-4f17-a1b8-14d89b4d16ac.png">

```
[28][20][33][40][31][47][59][56][89][64][43]
```
1. Traverse the **left** subtree
2. Traverse the **right** subtree
3. Print the **root** node

```py
def print_postorder(self):
    self.print_postorder_aux(self.root)
  
def print_postorder_aux(self, current):
    if current is not None: # if not a base case
        self.print_postorder_aux(current.left)
        self.print_postorder_aux(current.right)
        print(current)
```


