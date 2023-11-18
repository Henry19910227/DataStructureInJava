package linkedlist.singly;

public class SinglyLinkedListNode<T> implements Node<T> {
    private T element;
    private Node<T> next;
    public SinglyLinkedListNode(T value) {
        element = value;
    }
    public T getElement() {
        return element;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> node) {
        next = node;
    }
}