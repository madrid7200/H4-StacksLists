public class StackFactory {
    
    public static <T> IStack<T> createStack(int stackType) {
        switch(stackType) {
            case 1:
                return new ArrayStack<>();
            case 2:
                return new ArrayListStack<>();
            case 3:
                return new LinkedListStack<>();
            case 4:
                return new DLinkedListStack<>();
            default:
                throw new IllegalArgumentException("Invalid stack type: " + stackType);
        }
    }
}