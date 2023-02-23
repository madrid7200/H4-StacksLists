public class LinkedList<T> {

	private LNode<T> head;
	private LNode<T> tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public T first() {
		if (isEmpty()) {
			return null;
		}
		return head.getValue();
	}

	public T last() {
		if (isEmpty()) {
			return null;
		}
		return tail.getValue();
	}

	public void addFirst(T value) {
		LNode<T> newLNode = new LNode<>(value);
		newLNode.setNext(head);
		head = newLNode;
		if (isEmpty()) {
			tail = head;
		}
		size++;
	}

	public void addLast(T value) {
		LNode<T> newLNode = new LNode<>(value);
		if (isEmpty()) {
			head = newLNode;
		} else {
			tail.setNext(newLNode);
		}
		tail = newLNode;
		size++;
	}

	public T removeFirst() {
		if (isEmpty()) {
			return null;
		}
		T removedValue = head.getValue();
		head = head.getNext();
		size--;
		if (isEmpty()) {
			tail = null;
		}
		return removedValue;
	}
}
