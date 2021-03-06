package collectors;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectorsDemoTest {
    private CollectorsDemo demo = new CollectorsDemo();

    @Test
    public void createList() throws Exception {
        List<String> nameList = demo.createList();
        assertEquals(7, nameList.size());
        assertEquals(ArrayList.class, nameList.getClass());
    }

    @Test
    public void createSet() throws Exception {
        Set<String> nameSet = demo.createSet();
        assertEquals(6, nameSet.size());
        assertEquals(HashSet.class, nameSet.getClass());
    }

    @Test
    public void createDeque() throws Exception {
        Deque<String> nameDeque = demo.createDeque();
        assertEquals(7, nameDeque.size());
        assertEquals(ArrayDeque.class, nameDeque.getClass());
    }

    @Test
    public void createArray() throws Exception {
        String[] names = demo.createArray();
        assertEquals(4, names.length);
    }
}