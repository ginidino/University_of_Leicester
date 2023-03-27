# Graph
* A graph is a pictorial representation of a set of objects where some pairs of objects are connected by links. The interconnected objects are represented by points termed as *vertices*, and the lnks that connect the vertices are called *edges*
* A graph G = (V, E) is defined using a set of **vertices V** and a set of **edges E**
* An edge e is represented as e = (u, v) where u and v are two vertices
<img width="418" alt="스크린샷 2023-03-27 오후 9 20 26" src="https://user-images.githubusercontent.com/94044443/228057203-f0be17c6-df87-4700-9f43-8bac444a58a7.png">

## Different Types of Graph
* Undirected Graph
<img width="273" alt="스크린샷 2023-03-27 오후 9 23 57" src="https://user-images.githubusercontent.com/94044443/228057956-b9b193da-dd87-4d4f-aaa7-2490c5b9b89e.png">

* Directed Graph
<img width="288" alt="스크린샷 2023-03-27 오후 9 23 39" src="https://user-images.githubusercontent.com/94044443/228057885-e009e0a9-0926-41f2-a5c4-d2a3581bdb31.png">

* Non-simple Graph
<img width="428" alt="스크린샷 2023-03-27 오후 9 23 20" src="https://user-images.githubusercontent.com/94044443/228057817-1a37556d-040a-4823-8be7-70ff6fe765ad.png">

* Simple Graph
<img width="294" alt="스크린샷 2023-03-27 오후 9 23 03" src="https://user-images.githubusercontent.com/94044443/228057751-84f492c8-fc15-41e3-86eb-adaa310afe18.png">

* Undirected Weighted Graph
<img width="290" alt="스크린샷 2023-03-27 오후 9 22 43" src="https://user-images.githubusercontent.com/94044443/228057673-0c250425-aabd-432a-9841-ae27e7105c17.png">

* Directed Weighted Graph
<img width="345" alt="스크린샷 2023-03-27 오후 9 22 19" src="https://user-images.githubusercontent.com/94044443/228057596-71832605-295e-457a-81de-31a2de9403bc.png">

* Lavelled Graph
<img width="389" alt="스크린샷 2023-03-27 오후 9 21 53" src="https://user-images.githubusercontent.com/94044443/228057520-20a246f9-7ab8-49fe-a516-58c18c5dd481.png">

## Some Graph Representation
* Adjacency Matrix
  * A table where each cell is a possible edge
  * The indices of that cell tell us which vertices it refers to 
  * 0 represents no edge
  * 1 represents edge
  * If the graph is weighted the value becomes the weight

## Some Graph Representation
* Adjacency Matrix for Directed Graph

||A|B|C|D|E|
|---|---|---|---|---|---|
|A|0|1|0|0|0|
|B|0|0|1|0|0|
|C|0|0|0|0|1|
|D|0|0|1|0|1|
|E|0|0|0|0|0|

<img width="288" alt="스크린샷 2023-03-27 오후 9 23 39" src="https://user-images.githubusercontent.com/94044443/228057885-e009e0a9-0926-41f2-a5c4-d2a3581bdb31.png">

In Python
```py
[
 [0,1,0,0,0]
 [0,0,1,0,0]
 [0,0,0,0,1]
 [0,0,1,0,1]
 [0,0,0,0,0]
]
```

* Adjacency Matrix for Un-Directed Graph

||A|B|C|D|E|
|---|---|---|---|---|---|
|A|0|1|0|0|0|
|B|0|0|1|0|0|
|C|0|0|0|0|1|
|D|0|0|1|0|1|
|E|0|0|0|0|0|

<img width="273" alt="스크린샷 2023-03-27 오후 9 23 57" src="https://user-images.githubusercontent.com/94044443/228057956-b9b193da-dd87-4d4f-aaa7-2490c5b9b89e.png">

In Python
```py
[
[0,1,0,0,0]
[1,0,1,0,0]
[0,1,0,1,1]
[0,0,1,0,1]
[0,0,1,1,0]
]
```

* Adjacency List:
  * A table where each inner list holds the vertices that are adjacent to a fiven vertex
<img width="564" alt="스크린샷 2023-03-27 오후 9 32 14" src="https://user-images.githubusercontent.com/94044443/228059657-e895f17e-4e4b-4c4e-b61a-38d488f7c546.png">

```
A -> B
B -> A C D
C -> B
D -> B E F
E -> D F
F -> D E F
G -> H I
H -> G I
I -> G H
```
<img width="367" alt="스크린샷 2023-03-27 오후 9 33 08" src="https://user-images.githubusercontent.com/94044443/228059869-9f377962-6eb9-4b41-9daf-d0995cc79879.png">

The numbers in parenthesis correspond to the weights.
<img width="686" alt="스크린샷 2023-03-27 오후 9 35 06" src="https://user-images.githubusercontent.com/94044443/228060292-2a67bbef-d1e0-4ef5-9104-26d1c13a7af6.png">

## Exercise
|Start vertex|End vertex|Cost|
|:---:|:---:|:---:|
|1|3|10|
|2|3|7|
|2|4|5|
|2|5|2|
|3|6|20|

```
1 -> 3(10)
2 -> 3(7), 4(5), 5(2)
3 -> 6(20)
```

## Basic Graph Representation in Python
* Given the graph below, we can use Python dictionary data type to present the graph
```py
graph = {"A" : ["B"],
         "B" : ["A", "C"],
         "C" : ["B", "D", "E"],
         "D" : ["C", "E"],
         "E" : ["C", "D"]
        }
print(graph)
```
<img width="273" alt="스크린샷 2023-03-27 오후 9 23 57" src="https://user-images.githubusercontent.com/94044443/228057956-b9b193da-dd87-4d4f-aaa7-2490c5b9b89e.png">

## Graph Traversal
* Graph Traversal: Graph traversal or graph search is a process of visiting, checking or updatin each vertex in a graph
  * Breath-first search(BFS): BFS traverses a graph breadth ward motion(visits the sibling vertex) and uses a queue to remember to get the next vertex to start a search, when a dead end occurs in any iteration
  * Depth-first search(DFS): it traverses the depth of any particular path before exploring its breadth. A stack is generally used when implementing the algorithm

## Breadth-first Search
Breadth-first search, pseudocode
```py
G = ... # the graph
n = ... # the start node
visited = <the empty set> # the set of visited nodes
todo = [n] # the list of nodes we need to visit
while <todo is not empty>:
  m = todo[0] # m is first item in todo
  todo = todo[1:] # remove first item from todo
  print(m)
  <add m to visited>
  for x in neighbours(m):
    if x not in visited:
      if x not in todo:
        todo.append(x)
```

## Basic Algorithm: Are two nodes are connected?
* Start at one node (the "source" or "start" node)
* Look at all the neighbours
* Look at all the neighbours of the neighbours
* Look at all the neighbours of the neighbours of the neighbours, etc.
* Stop if you reach the other node (the "destination" or "target" node), in which case, the two nodes ARE connected
* Otherwise, stop if there are no neighbours left that you havent't already looked at (in which case, there is no way you can get from one node to the other, and the nodes are NOT connected)
* Indeed this is a sort of breadth-first(BFS) search of a graph
* BFS traverses a graph breadth ward motion and uses a queue to remember to get the next vertex to start a search, when a dead end occurs in any iteration

## How to check two nodes are connected or no
* Start at the source node
* Perfom a breadth-first search
* If you reach the target, the two nodes are connected
* Otherwise, the two nodes aren't connected

## The Problem Can be Prpresented as:
* Consider the graph consisting of the following:
  * Vertices corresponding to the terminals
  * Edges joining each pair of vertices
  * Weight on each edge corresponding to the length of the edge
* Find a **spanning tree** of this graph with minimum total weight
* A spanning tree of graph G is a tree which:
  * Contains all the vertices of G, and
  * Contains a subset of the edges in G (or all if it's already a tree)

## Possible Solution
<img width="410" alt="스크린샷 2023-03-27 오후 9 59 54" src="https://user-images.githubusercontent.com/94044443/228065338-a9cb81f6-2890-4b57-a77a-c6731ac10af3.png">

## Prim's algorithm to find Spanning Tree
**Finds a spanning tree of a graph G**     
**Input**: A graph G, simple and connected    
**Output**: A spanning tree of G

<img width="347" alt="스크린샷 2023-03-27 오후 10 03 10" src="https://user-images.githubusercontent.com/94044443/228065983-0958aec6-3ea5-40c9-b0fd-8f5562dfe9c7.png">
<img width="702" alt="스크린샷 2023-03-27 오후 10 03 37" src="https://user-images.githubusercontent.com/94044443/228066078-db273c1c-4a60-42c4-98d1-9e6ca1783fdc.png">

## Prim’s algorithm to find a Minimum Spanning Tree
**Finds a spanning tree of a graph G**     
**Input**: A graph G, simple and connected    
**Output**: A **minimum** spanning tree of G

<img width="697" alt="스크린샷 2023-03-27 오후 10 07 23" src="https://user-images.githubusercontent.com/94044443/228066792-26661a67-6c3e-42ec-ac74-c85c509b2773.png">
