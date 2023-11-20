package linkedlist.circularly;

import linkedlist.circularly.LinkedList;
import linkedlist.circularly.CircularlyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CircularlyLinkedListTest {

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void first() {
    }

    @Test
    void last() {
    }

    @Test
    void rotate() {
        LinkedList<Integer> list = new CircularlyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        assertEquals(1, list.first());
        assertEquals(3, list.last());
        list.rotate();
        assertEquals(2, list.first());
        assertEquals(1, list.last());
    }

    @Test
    void addFirst() {
        LinkedList<Integer> list = new CircularlyLinkedList<>();
        list.addFirst(1);
        assertEquals(1, list.first());
        assertEquals(1, list.last());
        list.addFirst(2);
        assertEquals(2, list.first());
        assertEquals(1, list.last());
        list.addFirst(3);
        assertEquals(3, list.first());
        assertEquals(1, list.last());
    }

    @Test
    void addLast() {
        LinkedList<Integer> list = new CircularlyLinkedList<>();
        list.addLast(1);
        assertEquals(1, list.first());
        assertEquals(1, list.last());
        list.addLast(2);
        assertEquals(1, list.first());
        assertEquals(2, list.last());
        list.addLast(3);
        assertEquals(1, list.first());
        assertEquals(3, list.last());
    }

    @Test
    void removeFirst() {
        LinkedList<Integer> list = new CircularlyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertEquals(3, list.removeFirst());
        assertEquals(2, list.removeFirst());
        assertEquals(1, list.removeFirst());
        assertNull(list.removeFirst());
    }
}
