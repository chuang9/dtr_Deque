public class dtr implements Queue<T> {

    private  DLLNode<T> _head, _tail;
    private int _size;


    public dtr() {
	_head = _tail = null;
	_size = 0;
    }
    

    
    //inserts element in front of deque if possible w/o violating capacity
    public void addFirst(T x) {
	_head.setPrev(new DLLNode<T>(x, _head, null));
	_head = _head.getPrev();
	_size++;
    }


	
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
