package linkedlist.circularly;

public interface LinkedList<T> {
    int size();
    boolean isEmpty();
    T first();
    T last();
    void rotate();
    void addFirst(T element);
    void addLast(T element);
    T removeFirst();
}
