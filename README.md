# dsa-notes-and-code
repo full of my notes on data structures and algorithms. 

- [linked lists](###LinkedLists)

## Data structures
### LinkedLists
Data structure that is typically contains a list of nodes that each hold a reference to their next node. A doubly linked list will also contain a reference to the previous node. Takes O(n) time to visit nth element of the list.

### methods

 **add()**
- create a new node containing new value
- assign next field of new node to the previous nodes dex
- assign next field of previous node to cur

Benefit is that you can insert in O(1) space

**add at beginning**
- create a new node with value
- link the new node to our head ()
- assign new node to head

**delete**
- find node to deletes previous node and its next node
- link previous node to next node
- null out the node to delete

Will be O(1) space complexity and O(n) time complexity because we have to traverse to find previous node

**delete first node**
- assign next node to head



