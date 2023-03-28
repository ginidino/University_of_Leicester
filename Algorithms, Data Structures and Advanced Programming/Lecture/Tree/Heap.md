## Heap
* Heap is a specialized tree-based data structure which is a **complete binary tree**
* Some of the application of Heap data structure:
  - **Priority queues**: The heap sturcture is commoly used to implement priority queues, where elements are stored in a heap and ordered based on their priority. This allows constant-time access to the highest-priority element, making it an efficient data structure for managing tasks or events that require prioritization
  - **Memory management**: The heap data structure is used in memory management systems to allocate and deallocate memory dynamically. The heap is used to store the memory blocks, and the heap data structure is used to efficiently manage the memory blocks and allocate them to programs as needed
* There are two types of heap:
  - **Max-heap**
  - **Min-heap**

## Min-Heap
* A min-heap is a balanced binary tree in which
  - each parent is alwyas smaller then or equal to its children (this implies that the root is the smallest element in the heap)
<img width="422" alt="스크린샷 2023-03-28 오후 6 04 10" src="https://user-images.githubusercontent.com/94044443/228314838-12b97a9f-0547-4b88-9d84-3f740f01e9e1.png">

## Heap can be represented as List
<img width="605" alt="스크린샷 2023-03-28 오후 6 05 14" src="https://user-images.githubusercontent.com/94044443/228315089-e9e91015-f588-4954-8d7c-7db3e4987cdd.png">

### Min-Heap Operations
* Insert: insert a value in the min-heap and ensure that heap properties are maintained
* Extraction: Retrieve and delete the minimum value from heap and ensure that heap properties are maintained

## Insertion in Heap (up-Heap)
* Append the new element in hList
* while parent(new) > new
  * Swap parent and new element

<img width="693" alt="스크린샷 2023-03-28 오후 6 09 12" src="https://user-images.githubusercontent.com/94044443/228316042-bcf84697-c98f-4eb9-aa1c-a510b3279fd7.png">
<img width="657" alt="스크린샷 2023-03-28 오후 6 09 26" src="https://user-images.githubusercontent.com/94044443/228316093-5c616a77-f000-4484-874a-2911e8649a6c.png">
<img width="612" alt="스크린샷 2023-03-28 오후 6 09 41" src="https://user-images.githubusercontent.com/94044443/228316140-a14b3b1d-b116-45a1-acc9-c916001b27b0.png">
<img width="664" alt="스크린샷 2023-03-28 오후 6 09 50" src="https://user-images.githubusercontent.com/94044443/228316197-9be770cc-2b5d-4d8e-8c3c-2e84bb45c221.png">
<img width="658" alt="스크린샷 2023-03-28 오후 6 09 57" src="https://user-images.githubusercontent.com/94044443/228316247-d57217af-1f7c-4294-922d-72e65a22a735.png">
<img width="643" alt="스크린샷 2023-03-28 오후 6 10 08" src="https://user-images.githubusercontent.com/94044443/228316291-18c55886-9287-4c0d-b36b-2ef0f2d7083f.png">
<img width="641" alt="스크린샷 2023-03-28 오후 6 10 45" src="https://user-images.githubusercontent.com/94044443/228316418-75110ff6-7236-4296-99e3-6a40f3da9b65.png">
<img width="669" alt="스크린샷 2023-03-28 오후 6 10 57" src="https://user-images.githubusercontent.com/94044443/228316450-da105123-4cb5-486a-8522-387f1c60c815.png">

## Insertion to Max-heap
* Insert the following items (in the order they are listed) into a max-heap
* 10, 16, 2, 29, 6, 14, 11, 4

## extractMin from Heap(downHeap)
<img width="663" alt="스크린샷 2023-03-28 오후 6 14 17" src="https://user-images.githubusercontent.com/94044443/228317254-a0a9c620-e072-43d4-8edc-d84b2ec0d6a8.png">

* Store and delete hList[0]
<img width="614" alt="스크린샷 2023-03-28 오후 6 15 08" src="https://user-images.githubusercontent.com/94044443/228317465-ad857817-6808-4f4c-98e7-3179714c4cf2.png">

* Move hList[N-1] (called last) to hList[0]
<img width="655" alt="스크린샷 2023-03-28 오후 6 16 02" src="https://user-images.githubusercontent.com/94044443/228317687-ab1b1b00-b6cb-4745-86b1-e11abcec6d5c.png">

* While leftchild(last) < last or rightchild(last) < last
  * Swap last with minimum(leftchild, rightchild)
<img width="668" alt="스크린샷 2023-03-28 오후 6 16 56" src="https://user-images.githubusercontent.com/94044443/228317867-df97894b-7c9a-4ca1-b378-f902e5a4d72d.png">
<img width="640" alt="스크린샷 2023-03-28 오후 6 17 06" src="https://user-images.githubusercontent.com/94044443/228317902-754db72e-1547-47c3-a4fb-23a19b6aeff5.png">
<img width="658" alt="스크린샷 2023-03-28 오후 6 17 20" src="https://user-images.githubusercontent.com/94044443/228317936-b16bc76d-3efb-40a4-89a2-1f3a2402d5db.png">
<img width="665" alt="스크린샷 2023-03-28 오후 6 17 40" src="https://user-images.githubusercontent.com/94044443/228318018-d6b5fa15-d475-4519-8c89-4e71a24e9b81.png">
<img width="670" alt="스크린샷 2023-03-28 오후 6 17 50" src="https://user-images.githubusercontent.com/94044443/228318064-a9704c26-4b02-4645-91da-a9ab94e0b711.png">

* Return extracted
<img width="692" alt="스크린샷 2023-03-28 오후 6 18 15" src="https://user-images.githubusercontent.com/94044443/228318161-fffc06cc-f84d-4228-b88d-c7e1b7d85380.png">
