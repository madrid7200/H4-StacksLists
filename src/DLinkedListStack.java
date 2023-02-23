
public class DLinkedListStack<T> implements IStack<T> {
    private DoubleLinkedList<T> list;
    
    public DLinkedListStack() {
        list = new DoubleLinkedList<>();
    }
    
    @Override
    public void push(T item) {
        list.addFirst(item);
    }

    @Override
    public T pop() {
        T item = list.removeFirst();
        if (item == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped item: " + item);
        }
        return item;
    }

    @Override
    public T peek() {
        T item = list.first();
        if (item == null) {
            System.out.println("Stack is empty");
        }
        return item;
    }

    @Override
    public int Size() {
        return list.getsize();
    }
}
