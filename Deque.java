public interface Deque<T> {

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

    //returns true if deque is empty
    boolean isEmpty();
}
