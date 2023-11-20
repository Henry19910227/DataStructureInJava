package linkedlist.circularly;

public interface Node<T> {
    T getElement();
    Node<T> getNext();
    void setNext(Node<T> node);
}
