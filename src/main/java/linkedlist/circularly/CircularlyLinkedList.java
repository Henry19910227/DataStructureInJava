package linkedlist.circularly;

public class CircularlyLinkedList<T> implements LinkedList<T> {

    public CircularlyLinkedList(){}

    public static int count = 0;

    private Node<T> tail;

    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext().getElement();
    }

    @Override
    public T last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    @Override
    public void rotate() {
        if (isEmpty()) {
            return;
        }
        tail = tail.getNext();
        size++;
    }

    @Override
    public void addFirst(T element) {
        Node<T> node = new CircularlyLinkedListNode<>(element);
        if (isEmpty()) {
            tail = node;
        }
        node.setNext(tail.getNext());
        tail.setNext(node);
        size++;
    }

    @Override
    public void addLast(T element) {
        addFirst(element);
        tail = tail.getNext();
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<T> head = tail.getNext();
        if (tail == head) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }
}
