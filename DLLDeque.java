public class DLLDeque<T> implements Deque<T> {

    private DLLNode<T> _front, _end;

    public DLLDeque() {
        _front = _end = null;
    }
        
    //inserts element in front of deque if possible w/o violating capacity
    public void addFirst(T x) {
        if (isEmpty()) {
            DLLNode<T> newNode = new DLLNode(x, null , null);
            _front = newNode;
            _end = newNode;
        }
        else {
            DLLNode<T> newNode = new DLLNode(x, _front, null);
            _front.setNext(newNode);
            _front = newNode;
        }
    }

    //returns and removes first element of deque; throws exception if deque is empty
    public T removeFirst() {
	T retVal = _front.getCargo();
        _front = _front.getPrev();
        _front.setNext(null);
        return retVal;
    }

    //returns first element of deque
    public T getFirst() {
        return _front.getCargo();
    }
    


    //inserts element into end of deque if possible w/o violating capacity restrictions
    public void addLast(T x) {
        if (isEmpty()) {
            DLLNode<T> newNode = new DLLNode(x, null , null);
            _front = newNode;
            _end = newNode;
        }
        else {
            DLLNode<T> newNode = new DLLNode(x, null, _end);
            _end.setPrev(newNode);
            _end = newNode;
        }
    }

    //returns and removes last element of deque; throws exception if deque is empty
    public T removeLast() {
        T retVal = _end.getCargo();
        _end = _end.getNext();
        _end.setPrev(null);
        return retVal;
    }

    //returns last element of deque; throws exception if deque is empty
    public T getLast() {
        return _end.getCargo();
    }

    //returns true if deque is empty
    public boolean isEmpty() {
        return _front == null;
    }

    public String toString() {
	String retStr = "END ";
	DLLNode<T> currentNode = _end;
	while (currentNode.getNext() != null) {
	    retStr += currentNode.getCargo() + " ";
	    currentNode = currentNode.getNext();
	}
	return retStr + getFirst() + " " + "FRONT";
    }

    public static void main(String[] args) {
        DLLDeque<String> testDeque = new DLLDeque();
	testDeque.addFirst("aa");
	testDeque.addFirst("bb");
	testDeque.addLast("zz");
	testDeque.addLast("xx");
	System.out.println(testDeque);

	System.out.println(testDeque.removeLast());
	System.out.println(testDeque.removeLast());	
	System.out.println(testDeque.removeFirst());
	System.out.println(testDeque.removeFirst());


    }

}
