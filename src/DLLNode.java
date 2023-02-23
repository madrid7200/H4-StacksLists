
public class DLLNode<T> {
	
	public T value;
	public DLLNode<T> next;
	public DLLNode<T> prev;
	
	public DLLNode(T value, DLLNode<T> prev,DLLNode<T> next ) {
		this.value = value;
		this.prev = prev;
		this.next = next;
		
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public DLLNode<T> getNext() {
		return next;
	}

	public void setNext(DLLNode<T> next) {
		this.next = next;
	}

	public DLLNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DLLNode<T> prev) {
		this.prev = prev;
	}
}
