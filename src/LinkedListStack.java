
public class LinkedListStack<T> implements IStack<T> {

    private LNode<T> head;
    private int size;

    public LinkedListStack() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void push(T item) {
        LNode<T> newNode = new LNode<>(item);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    @Override
    public T pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return null;
        }
        T item = head.getValue();
        head = head.getNext();
        size--;
        System.out.println("pop item " + item);
        return item;
    }

    @Override
    public T peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return head.getValue();
    }

    @Override
    public int Size() {
        return size;
    }
}