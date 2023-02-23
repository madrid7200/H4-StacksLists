
public class LNode<T> {

	public T value;
	public LNode<T> next;

	
	public LNode(T value) {
		this.value = value;	
		this.next = null;
	}


	public T getValue() {
		return value;
	}


	public void setValue(T value) {
		this.value = value;
	}


	public LNode<T> getNext() {
		return next;
	}


	public void setNext(LNode<T> next) {
		this.next = next;
	}

}
