public class DLLNode<T> {
    T _cargo;
    DLLNode _prev;
    DLLNode _next;
    
    public DLLNode(T cargo, DLLNode prev, DLLNode next) {
	_cargo = cargo;
	_prev = prev;
	_next = next;
    }

    public void setCargo(T newCargo) {
	_cargo = newCargo;
    }

    public void setPrev(DLLNode newPrev) {
	_prev = newPrev;
    }

    public void setNext(DLLNode newNext) {
	_next = newNext;
    }

    public T getCargo() {
	return _cargo;
    }

    public DLLNode getPrev() {
	return _prev;
    }

    public DLLNode getNext() {
	return _next;
    }
}
