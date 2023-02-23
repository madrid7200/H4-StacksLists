
public class LinkedList<T> {
	
	public LNode<T> head;
	public int size;
	
	//Adds a Node to the end of the LL
	public void append(T value) {
		//If the List is empty HEad and tail are assigned the New Node
		if (head == null) {
			head = new LNode<T>(value);
			return;			
		}
		LNode<T> current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new LNode<T>(value);
		
	}
	
	//Adds a Node to the Start of the LL
	public void prepend(T value) {
		LNode newHead = new LNode<T>(value);
		newHead.next = head;
		head = newHead;
	}
	
	public void remove(T value) {
		
	}
	
}



