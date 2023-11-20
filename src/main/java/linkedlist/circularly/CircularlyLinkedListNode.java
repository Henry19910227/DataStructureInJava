package linkedlist.circularly;

import linkedlist.singly.SinglyLinkedListNode;

public class CircularlyLinkedListNode<T> implements Node<T> {
    public CircularlyLinkedListNode(T value) {
        element = value;
    }
    private T element;

    private Node<T> next;

    @Override
    public T getElement() {
        return element;
    }

    @Override
    public Node<T> getNext() {
        return next;
    }

    @Override
    public void setNext(Node<T> node) {
        next = node;
    }
}
