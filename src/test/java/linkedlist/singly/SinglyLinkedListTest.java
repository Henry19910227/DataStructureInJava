package linkedlist.singly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SinglyLinkedListTest {

    @Test
    void size() {
        LinkedList<Integer> list = new SinglyLinkedList<>();
        assertEquals(0, list.size());
        list.addFirst(1);
        assertEquals(1, list.size());
        list.addLast(2);
        assertEquals(2, list.size());
        list.addLast(3);
        assertEquals(3, list.size());
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
    void addFirst() {
    }

    @Test
    void addLast() {
    }

    @Test
    void removeFirst() {
        // 創建LinkedList
        LinkedList<Integer> list = new SinglyLinkedList<>();
        // 添加 First
        list.addFirst(1);
        assertEquals(1, list.size());
        assertEquals(1, list.first());
        assertEquals(1, list.last());
        // 添加 First
        list.addFirst(0);
        assertEquals(2, list.size());
        assertEquals(0, list.first());
        assertEquals(1, list.last());
        // 添加 Last
        list.addLast(2);
        assertEquals(3, list.size());
        assertEquals(0, list.first());
        assertEquals(2, list.last());
        // 刪除 First
        list.removeFirst();
        assertEquals(2, list.size());
        assertEquals(1 ,list.first());
        assertEquals(2 ,list.last());
        // 刪除 First
        list.removeFirst();
        assertEquals(1, list.size());
        assertEquals(2 ,list.first());
        assertEquals(2 ,list.last());
        // 刪除 First
        list.removeFirst();
        assertEquals(0, list.size());
        assertNull(list.first());
        assertNull(list.last());
    }
}