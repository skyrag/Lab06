package calculator;

public class StackCalc<T> {
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

    public int size(){
        Iterator<T> iter = iterator();
        int count = 0;
        while(iter.hasNext()){
            count++;
            iter.next();
        }
        return count;
    }

    public String[] toArray() {
        Iterator<T> it = iterator();
        String[] array = new String[size()];
        int count = 0;
        while(it.hasNext()){
            array[count] = it.current().toString();
            count++;
            it.next();
        }

        return array;
    }

    public void COrCe(boolean isC){
        Iterator<T> it = iterator();
        Element<T> last = head;
        while(it.hasNext()){
            if(isC){
                Pop();
            } else {
                if (last.getNext().getValue().equals(Double.NaN)){
                    last.setNext(last.getNext().getNext());
                } else {
                    last = last.getNext();
                }
            }
            it.next();
        }

    }
}
