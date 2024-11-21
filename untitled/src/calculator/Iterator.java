package calculator;

public class Iterator <T>{
    private Element<T> element;


    public Iterator(Element<T> head) {
        element = head;
    }

    public T current() {
        return element.getValue();
    }

    public boolean hasNext(){
        return element != null;
    }

    public T next(){
        if (element == null){
            throw new RuntimeException("No more elements in the stack");
        }
        T value = element.getValue();
        element=element.getNext();
        return value;
    }
}
