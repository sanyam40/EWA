/*

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

3-----STACKS :The Stack class represents a last-in-first-out (LIFO) stack of objects.
•As Stack supports LIFO (Last In First Out), it is also known as LIFO List.
•The Stack class internally has a pointer called TOP, which points to the top of the stack element.

 1) ADDING ELEMENTS : PUSH()
 2) ACCESSIGN THE HEAD ELEMENT : PEEK()
 3) REMOVING THE ELEMENT : pop()
 4) SEARCHING : search(element)
 5) ISEMPTY : empty()
 6) Traversing a Stack
		for(Integer in : stack) {
			System.out.println(in);
		}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------        

4-----QUEUE : Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner.
•It is a collection of elements (or objects) that follows FIFO (First In First Out) order i.e., insertion occurs at the rear end while deletion occurs at the front end. 
•Since Queue is an interface, it can be implemented using LinkedList or PriorityQueue classes.

--Priority Queue : 
• PriorityQueue is a class under Collections framework which process the elements (or objects) based on their priorities
• It is based upon the heap data structure, element with the highest priority will be dequeued first
• A Priority Queue doesn’t contain null values and we cannot create a priority queue that contain elements (or objects) which are non-comparable
• The element present at the head of the priority queue is the least priority element 
 
 1) ADDING ELEMENTS : ADD()
 2) ACCESSIGN THE HEAD ELEMENT : PEEK()
 3) REMOVING THE ELEMENT : REMOVE() , POLL() [REMOVE() only in that it throws an exception if this queue is empty.]
 4) SIZE : SIZE()
 5) ITERATING :
    Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
 6) OFFER :adds element at the last in queue 

 ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

 5-----SET : A collection that contains no duplicate elements.It allows Null  value.
 • Two popular classes of the Set interface are:
1) HashSet  
2) TreeSet

• HashSet uses the mechanism of Hash Tables, while TreeSet uses the mechanism of Binary Search Tree.

1) HashSet [ IT USES THE ARRAY ]
• It is used to create a collection of elements which are stored in a hash table
• Hash Table uses hash codes to group elements & this mechanism is known as Hashing
• It contains unique elements only (no duplicates allowed)
• It doesn’t maintain any insertion order (like Lists), elements inside the Hash Table are inserted according to their hash codes
• It is considered as one of the best approach for searching 
operations, takes O(log n) time.

--LinkedHashSet : 
• The LinkedHashSet class provides functionalities of both the Hashtable and the linked list data structure
• It implements the Set Interface and extends HashSet class
• Stores unique elements just like the HashSet
• Maintains insertion order i.e., when cycling through a LinkedHashSet using an iterator, the elements will be returned in the order in which they were inserted
• Provides all optional set operations and permits null values.

2) TreeSet
• The TreeSet class uses a tree data structure for collecting elements
• Just like HashSet, it also contains unique set of elements
• Elements are stored in a node (just like linked lists) arranged in a tree shape
• Objects of the TreeSet class are stored in ascending order
• The TreeSet Iterator performs inorder traversals of the tree, delivering values in ascending order

 T.C. : 0(1)
 1) ADDING ELEMENTS : ADD()
 2) REMOVING THE ELEMENT : REMOVE()
 3) ITERATION : for (String s : hs)
            System.out.print(s + ", ");
 4) SIZE : SIZE()
 5) CREATING A COPY : clone()     
 6) ISEMPTY : isempty()  
 7) COMPARING : equals() [BETWEEN TWO HASHSETS]  
 8) SETS OPERATION :
 A)set.add - to add an element into a set.
 B)set.addAll- union 
 C)set.retainAll - intersection between to sets . 
 D)set.remove - difference between two sets .   

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

 6-----MAP : 
 • A Map is a collection interface that contain elements in the form of a key-value pair
 • Every key and value pair inside a map is called an entry
 • The key should always be unique (no duplicate keys allowed), however, values can be repeated 
 • A Map can’t be traversed, so we need to convert it into a Set using keySet() and entrySet() methods
 • The java library has mainly two implementations of Map interface namely,
    • HashMap
    • TreeMap
    • LinkedHashMap

1)HashMap
• The HashMap class implements the Map interface and uses a 
hash table for collecting objects
• Elements are stored using key-value pair
• It can have one null key and multiple null values
• It does not maintain any order
• Maps support efficient organization of information in tables.

a)entryset() - for printing in array
b)keyset() - for pritign all the keys.
c)values() - for printing all the values

2)TREE MAP
• It maintains its keys ordered within a balanced red-black tree
• It contains unique entries (key-value pair) (no duplicates allowed)
• The entries in a TreeMap are always stored based on the natural order of their keys (ascending order)
• A TreeMap cannot contain null-keys, however, it can have multiple null values.

3)LinkedHashMap
• Linked HashMap is a Hashtable and Doubly Linked List implementation of the Map interface
• This class extends HashMap and implements the Map interface
• It maintains the iteration/insertion ordering, which is normally the order in which keys are inserted into the map
• It also provides a constant time performance (best case) for basic operations like insert, remove and contains.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */