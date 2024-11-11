public class SimpleListe<T> {
    private Element<T> head;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;
        Element<T> current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public void insert(T o) {
        Element<T> newElement = new Element<>(o);
        newElement.setNext(head);
        head = newElement;
    }

}

public class Element<T> {
    private Element<T> next;
    private T value;

    public Element(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }
}
