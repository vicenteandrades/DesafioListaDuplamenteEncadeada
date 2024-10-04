package List;

public class ListaDuplamenteLigada<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addLeft(T element){
        Node<T> node = new Node<>(element);

        if(head == null){
            this.head = node;
            this.tail = node;
        }else {
            node.setNext(head);
            node.setPrevious(node);
            this.head = node;
        }

        this.size++;
    }

    public void addRight(T element){
        Node<T> node = new Node<>(element);

        if(tail == null){
            this.head = node;
            this.tail = node;
        }else{
            node.setPrevious(node);
            this.tail.setNext(node);
            this.tail = node;
        }

        size++;

    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "[]";
        }

        StringBuilder str = new StringBuilder();
        Node<T> current = this.head;

        str.append("[");
        for(int i = 0; i < size - 1; i++){
            str.append(current.getElement() + ",");
            current = current.getNext();
        }
        str.append(current.getElement());
        str.append("]");

        return str.toString();
    }

}
