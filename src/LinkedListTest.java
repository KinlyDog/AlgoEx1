import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTestEmpty {
    LinkedList listEmpty;
    boolean arg = listEmpty.head == null && listEmpty.tail == null;

    @BeforeEach
    void setUp() {
        listEmpty = new LinkedList();
    }

    @Test
    void findAll() {

    }

    @Test
    void remove() {
        assertFalse (listEmpty.remove(5));
    }

    @Test
    void removeAll() {
        int n2 = listEmpty.count();
        listEmpty.removeAll(5);

        assertEquals(n2, listEmpty.count());
    }

    @Test
    void clear() {
        listEmpty.clear();

        assertTrue(arg);
    }
    @Test
    void count() {
        assertTrue(listEmpty.count() == 0);
    }

    @Test
    void insertAfter() {

    }


}

class LinkedListTestOne {
    int listOneValue = 13;
    LinkedList listOne = new LinkedList();

    @BeforeEach
    void setUp() {
        listOne.addInTail(new Node(listOneValue));
    }

    @Test
    void OneRemoveTest1() {
        assertTrue(listOne.remove(listOneValue));
    }

    @Test
    void OneRemoveTest2() {
        assertFalse(listOne.remove(1));
    }

/*
    @Test
    void findAll() {
        ArrayList<Node> nodes = new ArrayList<>();
        ArrayList<Node> nodesOne = new ArrayList<>();
        nodesOne.add(new Node(0));

        assertEquals(listEmpty.findAll(2), nodes);
        assertEquals(listOne.findAll(0), nodesOne);

    }*/


    @Test
    void removeEmpty() {
        assertFalse(listEmpty.remove(5));
    }

    @Test
    void removeAll() {
        // full
        for (int i = 0; i < listFullValue; i++) {
            listFull.removeAll(i / 2);
        }

        assertEquals(listFull.count(), listFullValue / 2);

        // one
        int n1 = listOne.count();
        listOne.removeAll(5);
        assertEquals(n1, listOne.count());

        listOne.removeAll(listOneValue);
        assertEquals(listOne.count(), 0);

        // empty
        int n2 = listEmpty.count();
        listEmpty.removeAll(5);

        assertEquals(n2, listEmpty.count());
    }

    @Test
    void clear() {
        listOne.clear();

        boolean arg1 = listOne.head == null && listOne.tail == null;

        assertTrue(arg1);
    }

    @Test
    void count() {
        assertTrue(listOne.count() == 1);
    }

    @Test
    void insertAfter() {
        listOne.insertAfter(listOne.tail, new Node(666));
        assertTrue(listOne.head.value == 666);
        assertTrue(listOne.tail.value == listOneValue);

    }
}

class LinkedListTestFull {
    int listOneValue = 13;
    int listFullValue = 10_000;
    LinkedList listEmpty = new LinkedList();
    LinkedList listFull = new LinkedList();
    LinkedList listOne = new LinkedList();

    @BeforeEach
        // not ok
    void setUp() {
        // one element
        listOne.addInTail(new Node(listOneValue));

        // many elements
        for (int i = 0; i < listFullValue; i++) {
            listFull.addInTail(new Node(i));
        }
    }

    @Test
    void OneRemoveTest1() {
        assertTrue(listOne.remove(listOneValue));
    }

    @Test
    void OneRemoveTest2() {
        assertFalse(listOne.remove(1));
    }

    @Test
    void FullRemoveTest1() {
        assertTrue(listFull.remove(2));
    }

    @Test
    void FullRemoveTest2() {
        assertFalse(listFull.remove(listFullValue));
    }

    @Test
    void FullRemoveTest3() {
        assertEquals(listFull.count(), listFullValue - 1);
    }


/*
    @Test
    void findAll() {
        ArrayList<Node> nodes = new ArrayList<>();
        ArrayList<Node> nodesOne = new ArrayList<>();
        nodesOne.add(new Node(0));

        assertEquals(listEmpty.findAll(2), nodes);
        assertEquals(listOne.findAll(0), nodesOne);

    }*/


    @Test
    void removeEmpty() {
        assertFalse(listEmpty.remove(5));
    }

    @Test
    void removeAll() {
        // full
        for (int i = 0; i < listFullValue; i++) {
            listFull.removeAll(i / 2);
        }

        assertEquals(listFull.count(), listFullValue / 2);

        // one
        int n1 = listOne.count();
        listOne.removeAll(5);
        assertEquals(n1, listOne.count());

        listOne.removeAll(listOneValue);
        assertEquals(listOne.count(), 0);

        // empty
        int n2 = listEmpty.count();
        listEmpty.removeAll(5);

        assertEquals(n2, listEmpty.count());
    }

    @Test
    void clear() {
        listFull.clear();
        listOne.clear();
        listEmpty.clear();

        boolean arg0 = listFull.head == null && listFull.tail == null;
        boolean arg1 = listOne.head == null && listOne.tail == null;
        boolean arg2 = listEmpty.head == null && listEmpty.tail == null;

        assertTrue(arg0);
        assertTrue(arg1);
        assertTrue(arg2);
    }

    @Test
    void count() {
        assertTrue(listEmpty.count() == 0);
        assertTrue(listFull.count() == listFullValue);
        assertTrue(listOne.count() == 1);
    }

    @Test
    void insertAfter() {
        listOne.insertAfter(listOne.tail, new Node(666));
        assertTrue(listOne.head.value == 666);
        assertTrue(listOne.tail.value == listOneValue);

    }
}


