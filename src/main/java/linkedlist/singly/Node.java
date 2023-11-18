package linkedlist.singly;

public interface Node<T> {
    T getElement();
    Node<T> getNext();
    void setNext(Node<T> node);
}
