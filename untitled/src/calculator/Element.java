package calculator;

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

    @Override
    public String toString() {
        return value.toString();
    }
}
