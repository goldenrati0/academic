/**
 * SortedLinkedListTest.java
 */
package cse220.assign2;

import cse220.assign2.LinkedList;
import junit.framework.TestCase;

/**
 * Testcases for cse220.assign2.LinkedList class.
 */
public class LinkedListTest extends TestCase {

    /**
     * @param name
     */
    public LinkedListTest(String name) {
        super(name);
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#LinkedList()} .
     */
    public final void testLinkedList() {
        LinkedList a = new LinkedList();
        assertEquals(0, a.size());
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#size()}.
     */
    public final void testSize() {
        LinkedList a = new LinkedList();
        assertEquals(0, a.size());
        a.add("A");
        assertEquals(1, a.size());
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#isEmpty()}.
     */
    public final void testIsEmpty() {
        LinkedList a = new LinkedList();
        assertTrue(a.isEmpty());
    }

    /**
     * Test method for
     * {@link cse220.assign2.LinkedList#contains(java.lang.Object)}.
     */
    public final void testContains() {
        LinkedList a = new LinkedList();
        a.add("A");
        assertTrue(a.contains("A"));
        assertFalse(a.contains("B"));
    }

    /**
     * Test method for
     * {@link cse220.assign2.LinkedList#indexOf(java.lang.Object)}.
     */
    public final void testIndexOf() {
        LinkedList a = new LinkedList();
        a.add("A");
        a.add("B");
        assertEquals(0, a.indexOf("A"));
        assertEquals(1, a.indexOf("B"));
        assertEquals(-1, a.indexOf("C"));
    }

    /**
     * Test method for
     * {@link cse220.assign2.LinkedList#lastIndexOf(java.lang.Object)} .
     */
    public final void testLastIndexOf() {
        LinkedList a = new LinkedList();
        a.add("A");
        a.add("A");
        a.add("B");
        a.add("A");
        assertEquals(3, a.lastIndexOf("A"));
        assertEquals(2, a.lastIndexOf("B"));
        assertEquals(-1, a.lastIndexOf("C"));
    }

    /**
     * Test method for
     * {@link cse220.assign2.LinkedList#add(java.lang.Object)}.
     */
    public final void testAddObject() {
        LinkedList a = new LinkedList();
        a.add("A");
        a.add("B");
        assertEquals("A", a.get(0));
        assertEquals("B", a.get(1));
    }

    /**
     * Test method for
     * {@link cse220.assign2.LinkedList#add(int, java.lang.Object)}.
     */
    public final void testAddIntObject() {
        LinkedList a = new LinkedList();
        a.add("A");
        a.add("B");
        assertEquals("A", a.get(0));
        assertEquals("B", a.get(1));
        a.add(0, "C");
        a.add(1, "D");
        assertEquals("C", a.get(0));
        assertEquals("D", a.get(1));
        assertEquals("A", a.get(2));
        assertEquals("B", a.get(3));

        // valid indices are now [0,4]. [0,3] will add in the middle, and
        // 4 will add to the end.
        try {
            a.add(5, "Help!");
            fail("Failed to throw exception");
        } catch (IndexOutOfBoundsException e) {
            ;
        } catch (Exception e) {
            fail("Wrong exception type");
        }
    }

    /**
     * Test method for
     * {@link cse220.assign2.LinkedList#addAll(cse220.assign2.List)} .
     */
    public final void testAddAll() {
        LinkedList src = new LinkedList();
        for (int i = 0; i < 10; i++)
            src.add(new Integer(i));

        LinkedList copy = new LinkedList();
        copy.addAll(src);

        assertEquals(src.size(), copy.size());
        for (int i = 0; i < 10; i++) {
            Object a = src.get(i);
            Object b = copy.get(i);
            assertTrue(a.equals(b));
        }
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#remove(int)}.
     */
    public final void testRemoveInt() {
        LinkedList a = new LinkedList();
        a.add("A");
        a.add("B");
        a.remove(0);
        assertEquals(1, a.size());
        assertEquals("B", a.get(0));
    }

    /**
     * Test method for
     * {@link cse220.assign2.LinkedList#remove(java.lang.Object)}.
     */
    public final void testRemoveObject() {
        LinkedList a = new LinkedList();
        a.add("A");
        a.add("B");
        a.remove("A");
        assertEquals(1, a.size());
        assertEquals("B", a.get(0));
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#clear()}.
     */
    public final void testClear() {
        LinkedList a = new LinkedList();
        a.add("A");
        a.add("B");
        a.clear();
        assertEquals(0, a.size());
        assertFalse(a.contains("A"));
        assertFalse(a.contains("B"));
        a.add("A");
        a.add("B");
        assertEquals(2, a.size());
        assertTrue(a.contains("A"));
        assertTrue(a.contains("B"));
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#get(int)}.
     */
    public final void testGet() {
        LinkedList a = new LinkedList();
        a.add("A");
        a.add("B");
        assertEquals("A", (String) a.get(0));
        assertEquals("B", (String) a.get(1));
        try {
            a.get(2);
            fail("Failed to throw exception");
        } catch (IndexOutOfBoundsException e) {
            ;
        } catch (Exception e) {
            fail("Wrong exception type: " + e);
        }
    }

    /**
     * Test method for
     * {@link cse220.assign2.LinkedList#set(int, java.lang.Object)}.
     */
    public final void testSet() {
        LinkedList a = new LinkedList();
        a.add("A");
        a.add("B");
        assertEquals("A", (String) a.get(0));
        assertEquals("B", (String) a.get(1));
        a.set(0, "C");
        a.set(1, "D");
        assertEquals("C", (String) a.get(0));
        assertEquals("D", (String) a.get(1));
        try {
            a.set(2, "E");
            fail("Failed to throw exception");
        } catch (IndexOutOfBoundsException e) {
            ;
        } catch (Exception e) {
            fail("Wrong exception type: " + e);
        }
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#reverse()}.
     */
    public final void testReverse() {
        // even size test
        int len = 10;
        LinkedList a = new LinkedList();
        Integer[] a1 = new Integer[len];
        Integer[] a2 = new Integer[len];
        for (int i = 0; i < len; i++) {
            a.add(new Integer(i));
            a1[i] = new Integer(i);
            a2[len - i - 1] = new Integer(i);
        }

        a.reverse();
        Object[] aArr = a.toArray();
        assertTrue(java.util.Arrays.equals(aArr, a2));

        a.reverse();
        aArr = a.toArray();
        assertTrue(java.util.Arrays.equals(aArr, a1));

        // odd-size test
        len = 11;
        a = new LinkedList();
        a1 = new Integer[len];
        a2 = new Integer[len];
        for (int i = 0; i < len; i++) {
            a.add(new Integer(i));
            a1[i] = new Integer(i);
            a2[len - i - 1] = new Integer(i);
        }

        a.reverse();
        aArr = a.toArray();
        assertTrue(java.util.Arrays.equals(aArr, a2));

        a.reverse();
        aArr = a.toArray();
        assertTrue(java.util.Arrays.equals(aArr, a1));

    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#shiftRight(int)}.
     */
    public final void testShiftRight() {
        int len = 10;
        LinkedList a = new LinkedList();
        Integer[] a1 = new Integer[len];
        for (int i = 0; i < len; i++) {
            a.add(new Integer(i));
            a1[i] = new Integer(i);
        }

        // test up to len shifts
        for (int k = 0; k < len; k++) {
            LinkedList aCopy = a.copy();
            aCopy.shiftRight(k);
            for (int i = 0; i < len; i++)
                assertEquals(a1[i], aCopy.get(i + k));
        }
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#shiftLeft(int)}.
     */
    public final void testShiftLeft() {
        int len = 10;
        LinkedList a = new LinkedList();
        Integer[] a1 = new Integer[len];
        for (int i = 0; i < len; i++) {
            a.add(new Integer(i));
            a1[i] = new Integer(i);
        }

        // test up to len shifts
        for (int k = 0; k < len; k++) {
            LinkedList aCopy = a.copy();
            aCopy.shiftLeft(k);
            for (int i = 0; i < len - k; i++)
                assertEquals(a1[i + k], aCopy.get(i));
        }

        // Check max shift
        try {
            a.shiftLeft(len + 1);
            fail("Expected RuntimeException for shift > size");
        } catch (RuntimeException ex) {
            ;
        }
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#copy()}.
     */
    public final void testCopy() {
        LinkedList src = new LinkedList();
        for (int i = 0; i < 10; i++)
            src.add(new Integer(i));

        LinkedList copy = src.copy();

        assertEquals(src.size(), copy.size());
        for (int i = 0; i < 10; i++) {
            Object a = src.get(i);
            Object b = copy.get(i);
            assertTrue(a.equals(b));
        }
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#toString()}.
     */
    public final void testToString() {
        LinkedList a = new LinkedList();
        assertEquals("[ ]", a.toString());
        a.add("A");
        a.add("B");
        assertEquals("[ A B ]", a.toString());
    }

    /**
     * Test method for {@link cse220.assign2.LinkedList#toArray()}.
     */
    public final void testToArray() {
        LinkedList a = new LinkedList();
        for (int i = 0; i < 10; i++)
            a.add(new Integer(i));

        Object[] array = a.toArray();
        assertEquals(a.size(), array.length);
        for (int i = 0; i < a.size(); i++)
            assertEquals(a.get(i), array[i]);
    }

    /**
     * Test method for
     * {@link cse220.assign2.LinkedList#equals(java.lang.Object)}.
     */
    public final void testEqualsObject() {
        LinkedList a1 = new LinkedList();
        /* Test trivial inequality (with null). */
        assertFalse(a1.equals(null));

        LinkedList a2 = new LinkedList();
        for (int i = 0; i < 25; i++) {
            a1.add(new Integer(i));
            a2.add(new Integer(i));
        }

        /* Test trivial equality (with self). */
        assertTrue(a1.equals(a1));
        assertTrue(a2.equals(a2));

        assertTrue(a1.equals(a2));
        a1.remove(0);
        assertFalse(a1.equals(a2));
        a2.remove(0);
        assertTrue(a1.equals(a2));

    }

}
