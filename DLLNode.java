public class DLLNode<T> {
    T _cargo;
    DLLNode _next;
    DLLNode _prev;
    
    public DLLNode(T cargo, DLLNode next, DLLNode prev) {
	_cargo = cargo;
	_next = next;
	_prev = prev;
    }

    public void setCargo(T newCargo) {
	_cargo = newCargo;
    }

    public void setNext(DLLNode newNext) {
	_next = newNext;
    }

    public void setPrev(DLLNode newPrev) {
	_prev = newPrev;
    }

    public T getCargo() {
	return _cargo;
    }

    public DLLNode getNext() {
	return _next;
    }

    public DLLNode getPrev() {
	return _prev
    }
}
