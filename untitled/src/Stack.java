public class Stack <T> {
    private Element<T> head;

    public T Pop() {
        Element<T> temp = head;
        head = head.getNext();
        return temp.getValue();
    }

    public void Push(T data) {
        Element<T> newhead = new Element<>(data);
        newhead.setNext(head);
        head = newhead;
    }
}
