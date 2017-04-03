# dtr_Deque
<b>Roster</b>
 * Chester Huang
 * Clive Johnston
 * Shaikat Islam

#### Method Selections
The methods that we chose as team included:
```
    //inserts element in front of deque if possible w/o violating capacity
    void addFirst(T x);
    //returns and removes first element of deque; throws exception if deque is empty
    T removeFirst();
    //returns first element of deque
    T getFirst();
    //inserts element into end of deque if possible w/o violating capacity restrictions
    void addLast(T x);
    //returns and removes last element of deque; throws exception if deque is empty
    T removeLast();
    //returns last element of deque; throws exception if deque is empty
    T getLast();
    //checks if the deque is emoty
    boolean isEmpty();
```

Most of these methods came from the JAVA API on the Deque class, found  [here](https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html). We looked for efficiency and easue of use, making sure not to choose methods that seemed rather redundant, such as <em>offerFirst</em> or <em>offerLast</em> which checks for capacity restrictions, unlike <em>addFirst</em> or <em>addLast</em> which are essentially the same (they throw exceptions when the method is unable to insert a new DLLNode into the deque.

#### Method Selections
We chose a doubly-linked node as the architecture for our deque mainly for runtime and efficiency. We figured that a DLLNode would require less iteration than an arrayList or a list-based structure, due to the ability to link. It would be better to add or remove nodes from the left or right without having to traverse the entire list. 











