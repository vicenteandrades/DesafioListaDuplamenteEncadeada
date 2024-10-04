package List;

public class Node<T> {
    Node<T> next;
    private T element;
    Node<T> previous;

    public Node(T element) {
        this.element = element;
        this.next = null;
        this.previous = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}
