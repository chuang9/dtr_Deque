import java.util.NoSuchElementException;

public class DLLDeque<T> implements Deque<T> {

    private DLLNode<T> _front, _end;

    public DLLDeque() {
        _front = _end = null;
    }
        
    //inserts element in front of deque
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
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        
	T retVal = _front.getCargo();
        if (_front == _end) {
            _front = _end = null;
        }
        else {
            _front = _front.getPrev();
            _front.setNext(null);
        }
        return retVal;
    }

    //returns first element of deque; throws exception if deque is empty
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        
        return _front.getCargo();
    }
    
    //inserts element into end of deque
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
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        
        T retVal = _end.getCargo();
        if (_front == _end) {
            _front = _end = null;
        }
        else {
            _end = _end.getNext();
            _end.setPrev(null);
        }
        return retVal;
    }

    //returns last element of deque; throws exception if deque is empty
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        
        return _end.getCargo();
    }

    //returns true if deque is empty
    public boolean isEmpty() {
        return _front == null;
    }

    public String toString() {
	String retStr = "END ";

        if (isEmpty()) {
        }
        else if (_front == _end) {
            retStr += _front.getCargo() + " ";
        }
        else {
            DLLNode<T> currentNode = _end;
            while (currentNode != null) {
                retStr += currentNode.getCargo() + " ";
                currentNode = currentNode.getNext();
            }
        }
        
        return retStr + "FRONT";
    }

    
    public static void main(String[] args) {

    }
}
