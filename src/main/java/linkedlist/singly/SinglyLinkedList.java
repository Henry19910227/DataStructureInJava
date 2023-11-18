package linkedlist.singly;

public class SinglyLinkedList<T> implements LinkedList<T> {

    public SinglyLinkedList() {}
    private Node<T> head;
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
        return head.getElement();
    }

    @Override
    public T last() {
        if (tail == null) {
            return null;
        }
        return tail.getElement();
    }

    @Override
    public void addFirst(T element) {
        Node<T> node = new SinglyLinkedListNode<>(element);
        node.setNext(head);
        head = node;
        if (isEmpty()) {
            tail = node;
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        Node<T> node = new SinglyLinkedListNode<>(element);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T element = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return element;
    }
}
