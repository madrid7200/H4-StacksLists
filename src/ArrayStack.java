
public class ArrayStack<T> implements IStack<T> {

    private T[] current;
    private int capacity;
    private int size;
    
    public ArrayStack() {
    	
        this.capacity = 10;
        this.current = (T[]) new Object[capacity];
        this.size = 0;
    }
    
    public ArrayStack(int capacity) {
    	
        current = (T[]) new Object[capacity];
        size = 0;
    }

    @Override
    public T pop() {
    	
        if (size == 0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            T item = current[size-1];
            current[size-1] = null;
            size--;
            System.out.println("pop item " + item);
            return item;
        }
    }

    @Override
    public void push(T item) {
    	
        if (size == current.length) {
            System.out.println("Stack is full");
        } else {
            current[size] = item;
            size++;
            System.out.println("Stack size " + size);
        }
    }

    @Override
    public T peek() {
    	
        if (size == 0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return current[size-1];
        }
    }

    @Override
    public int Size() {
        return size;
    }

}