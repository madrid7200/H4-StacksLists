import java.util.ArrayList;

public class Stack<T> implements IStack<T> {
	
	private ArrayList <T> current;
	private int size;
	
	
	public Stack(){
		current = new ArrayList<>();
		size = 0;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(size == 0) {
			System.out.println("Stack is empty");
			//System.out.print("hola" + current.get(size-1));
		}
		else {
			T item = current.get(size-1);
			current.remove(size-1);
			size = size-1;
			System.out.println("pop item " + item);
			return item;
		}
		return null;
	}

	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		current.add(item);
		size = size+ 1;
		System.out.println("Stack size " + size);
	
	}

	@Override
	public T peek() {
		
		// TODO Auto-generated method stub
		if(size == 0) {
			System.out.println("Stack is empty");
		}
		
		return current.get(0);
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return size;
	}

}
