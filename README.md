# dtr_Deque
<b>Team dtr Roster</b>
 * Chester Huang
 * Shaikat Islam
 * Clive Johnston

#### Method Selections
The methods that we chose as team included:
```
    //inserts element in front of deque
    void addFirst(T x);
    
    //returns and removes first element of deque; throws exception if deque is empty
    T removeFirst();
    
    //returns first element of deque; throws exception if deque is empty
    T getFirst();
    
    //inserts element into end of deque
    void addLast(T x);
    
    //returns and removes last element of deque; throws exception if deque is empty
    T removeLast();
    
    //returns last element of deque; throws exception if deque is empty
    T getLast();
    
    //returns true if deque is empty
    boolean isEmpty();
```

Most of these methods came from the JAVA API on the Deque class, found  [here](https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html). We looked for efficiency and ease of use, making sure not to choose methods that seemed rather redundant, such as <em>offerFirst</em> or <em>offerLast</em> which checks for capacity restrictions. Instead, methods like <em>addFirst</em> or <em>addLast</em> are essentially the same but will not consider any capacity restrictions, as we believed this feature was not necessary. 

#### Implementation Choice
We chose a doubly-linked node as the architecture for our deque mainly for runtime efficiency. A deque using linked nodes would require less iteration than an ArrayList or a list-based structure, due to the ability to link. It would be better to add or remove nodes from the left or right without having to traverse the entire set of data. Also, there is no need for a linked based structure to shift all the data after a remove operation. Other data structures, like ArrayLists or singly linked nodes would not have offered this runtime advantage.











