

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

    private Iterator<T> iterator() {
        return new Iterator<>(head);
    }

    private int size(){
        Iterator<T> iter = iterator();
        int count = 0;
        while(iter.hasNext()){
            count++;
            iter.next();
        }
        return count;
    }

    public T[] toArray() {
        Iterator<T> it = iterator();
        int size = size();
        T[] array = (T[]) new Object[size];
        int count = 0;
        while(it.hasNext()){
            array[count] = it.current();
            count++;
            it.next();
        }

        return array;
    }
}
