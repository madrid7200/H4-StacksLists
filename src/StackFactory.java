
public class StackFactory {

    public static <T> IStack<T> createStack(String stackType) {
        switch(stackType.toLowerCase()) {
        
            case "array":
                return new ArrayStack<>();
            case "linkedlist":
                return new LinkedListStack<>();
            case "dlinkedlist":
                return new DLinkedListStack<>();
            default:
                throw new IllegalArgumentException("Invalid stack type: " + stackType);
        }
    }
}