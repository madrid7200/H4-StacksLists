
public class DoubleLinkedList<T> {
	
	private DLLNode<T> head;
	private DLLNode<T> tail;
	private int size;
	
	public DoubleLinkedList () {
		head = new DLLNode<>(null,null,null);
		tail = head;
	}
	
	public int getsize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public T first() {
		if(isEmpty()) {
			return null;
		}
		return head.getNext().getValue();
	}
	
	public T last() {
		if(isEmpty()) {
			return null;
		}
		return tail.getPrev().getValue();	
	}
	
	//Uses add between method to add a new node after the head
	public void addFirst(T value) {
		addBetween(value, head, head.next);
		
	}
	
	//Uses add between method to add a new node before the tail
	public void addLast(T value) {
		addBetween(value, tail.prev, tail);
	}
	
	//Inserts a new node betwen 2 Nodes defined 
	private void addBetween(T value, DLLNode<T> prev, DLLNode<T> next) {
		DLLNode<T> newDNode = new DLLNode<T>(value, prev, next);
		prev.setNext(newDNode);
		next.setPrev(newDNode);
		size++;
	}
	
	//Removes reference to the first node after the head
	public T removeFirst() {
		if(isEmpty()) {
			return null;
		}
		return remove(head.getNext());
	}
	
	public T removeLast() {
		if(isEmpty()) {
			return null;
		}
		return remove(tail.getPrev());
	}
	
	//Receives a Node to be deleted
	//removes the references to said node by updating the pointers
	private T remove(DLLNode<T> toDelete) {
		DLLNode<T> prevNode = toDelete.getPrev();
		DLLNode<T> nextNode = toDelete.getPrev();
		
		prevNode.setNext(nextNode);
		nextNode.setPrev(prevNode);

		return toDelete.getValue();
	
	}
	
	
	
	
	
	
	
	
	
	

}
