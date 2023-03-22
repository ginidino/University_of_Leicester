## Stack
* A stack is a linear data structure that follows the principle of **Last In First Out**
* This means that last element inserted inside the stack is removed first
* A stack is like list except
  - only interact with the item at the `top`
  -  `push` someting to put it on the top of the stack
  -  `pop` to take something from the top of the stack
  -  check its size

<img width="636" alt="Screenshot 2023-03-22 at 9 53 21 pm" src="https://user-images.githubusercontent.com/94044443/227047286-a7b9dc23-3b2d-4fe2-ae12-4361544f04b0.png">

## Stacks: Common uses
* Reverse a list of items

### Reversting a list
```py
def reverseListWithStack(aList):
  stack = []
  for item in aList:#fill the stack
    stack.append(item) #push item
  #stack can now reverse them
  position = 0
  while len(stack)>0:
    aList[position] = stack.pop()
  #overwrite item at
  #this position with what was popped off the stack
    position += 1
  return aList
```
