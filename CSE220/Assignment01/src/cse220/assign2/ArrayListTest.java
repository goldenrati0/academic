/**
 * ArrayListTest.java
 */
package cse220.assign2;

import cse220.assign2.ArrayList;
import junit.framework.TestCase;

/**
 * Testcases for cse220.assign2.ArrayList class.
 */
public class ArrayListTest extends TestCase {

    /**
     * @param name
     */
    public ArrayListTest(String name) {
        super(name);
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#ArrayList()}.
     */
    public final void testArrayList() {
        ArrayList a = new ArrayList();
        assertEquals(0, a.size());
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#ArrayList(int)}.
     */
    public final void testArrayIntList() {
        ArrayList a = new ArrayList(10);
        assertEquals(0, a.size());
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#size()}.
     */
    public final void testSize() {
        ArrayList a = new ArrayList();
        assertEquals(0, a.size());
        a.add("A");
        assertEquals(1, a.size());
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#isEmpty()}.
     */
    public final void testIsEmpty() {
        ArrayList a = new ArrayList();
        assertTrue(a.isEmpty());
    }

    /**
     * Test method for
     * {@link cse220.assign2.ArrayList#contains(java.lang.Object)}.
     */
    public final void testContains() {
        ArrayList a = new ArrayList();
        a.add("A");
        assertTrue(a.contains("A"));
        assertFalse(a.contains("B"));
    }

    /**
     * Test method for
     * {@link cse220.assign2.ArrayList#indexOf(java.lang.Object)}.
     */
    public final void testIndexOf() {
        ArrayList a = new ArrayList();
        a.add("A");
        a.add("B");
        assertEquals(0, a.indexOf("A"));
        assertEquals(1, a.indexOf("B"));
        assertEquals(-1, a.indexOf("C"));
    }

    /**
     * Test method for
     * {@link cse220.assign2.ArrayList#lastIndexOf(java.lang.Object)} .
     */
    public final void testLastIndexOf() {
        ArrayList a = new ArrayList();
        a.add("A");
        a.add("A");
        a.add("B");
        a.add("A");
        assertEquals(3, a.lastIndexOf("A"));
        assertEquals(2, a.lastIndexOf("B"));
        assertEquals(-1, a.lastIndexOf("C"));
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#add(java.lang.Object)}
     * .
     */
    public final void testAddObject() {
        ArrayList a = new ArrayList();
        a.add("A");
        a.add("B");
        assertEquals("A", a.get(0));
        assertEquals("B", a.get(1));

        // Now test if resizing works!
        a = new ArrayList(1);
        a.add("A");
        a.add("B");
        assertEquals("A", a.get(0));
        assertEquals("B", a.get(1));
    }

    /**
     * Test method for
     * {@link cse220.assign2.ArrayList#add(int, java.lang.Object)}.
     */
    public final void testAddIntObject() {
        ArrayList a = new ArrayList();
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
     * {@link cse220.assign2.ArrayList#addAll(cse220.assign2.List)} .
     */
    public final void testAddAll() {
        ArrayList src = new ArrayList();
        for (int i = 0; i < 10; i++)
            src.add(new Integer(i));

        ArrayList copy = new ArrayList();
        copy.addAll(src);

        assertEquals(src.size(), copy.size());
        for (int i = 0; i < 10; i++) {
            Object a = src.get(i);
            Object b = copy.get(i);
            assertTrue(a.equals(b));
        }
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#remove(int)}.
     */
    public final void testRemoveInt() {
        ArrayList a = new ArrayList();
        a.add("A");
        a.add("B");
        a.remove(0);
        assertEquals(1, a.size());
        assertEquals("B", a.get(0));
    }

    /**
     * Test method for
     * {@link cse220.assign2.ArrayList#remove(java.lang.Object)}.
     */
    public final void testRemoveObject() {
        ArrayList a = new ArrayList();
        a.add("A");
        a.add("B");
        a.remove("A");
        assertEquals(1, a.size());
        assertEquals("B", a.get(0));
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#clear()}.
     */
    public final void testClear() {
        ArrayList a = new ArrayList();
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
     * Test method for {@link cse220.assign2.ArrayList#get(int)}.
     */
    public final void testGet() {
        ArrayList a = new ArrayList();
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
     * {@link cse220.assign2.ArrayList#set(int, java.lang.Object)}.
     */
    public final void testSet() {
        ArrayList a = new ArrayList();
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
     * Test method for {@link cse220.assign2.ArrayList#reverse()}.
     */
    public final void testReverse() {
        // even size test
        int len = 10;
        ArrayList a = new ArrayList();
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
        a = new ArrayList();
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
     * Test method for {@link cse220.assign2.ArrayList#shiftRight(int)}.
     */
    public final void testShiftRight() {
        int len = 10;
        ArrayList a = new ArrayList();
        Integer[] a1 = new Integer[len];
        for (int i = 0; i < len; i++) {
            a.add(new Integer(i));
            a1[i] = new Integer(i);
        }

        // test up to len shifts
        for (int k = 0; k < len; k++) {
            ArrayList aCopy = a.copy();
            aCopy.shiftRight(k);
            for (int i = 0; i < len; i++)
                assertEquals(a1[i], aCopy.get(i + k));
        }
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#shiftLeft(int)}.
     */
    public final void testShiftLeft() {
        int len = 10;
        ArrayList a = new ArrayList();
        Integer[] a1 = new Integer[len];
        for (int i = 0; i < len; i++) {
            a.add(new Integer(i));
            a1[i] = new Integer(i);
        }

        // test up to len shifts
        for (int k = 0; k < len; k++) {
            ArrayList aCopy = a.copy();
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
     * Test method for {@link cse220.assign2.ArrayList#copy()}.
     */
    public final void testCopy() {
        ArrayList src = new ArrayList();
        for (int i = 0; i < 10; i++)
            src.add(new Integer(i));

        ArrayList copy = src.copy();

        assertEquals(src.size(), copy.size());
        for (int i = 0; i < 10; i++) {
            Object a = src.get(i);
            Object b = copy.get(i);
            assertTrue(a.equals(b));
        }
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#toString()}.
     */
    public final void testToString() {
        ArrayList a = new ArrayList();
        assertEquals("[ ]", a.toString());
        a.add("A");
        a.add("B");
        assertEquals("[ A B ]", a.toString());
    }

    /**
     * Test method for {@link cse220.assign2.ArrayList#toArray()}.
     */
    public final void testToArray() {
        ArrayList a = new ArrayList();
        for (int i = 0; i < 10; i++)
            a.add(new Integer(i));

        Object[] array = a.toArray();
        assertEquals(a.size(), array.length);
        for (int i = 0; i < a.size(); i++)
            assertEquals(a.get(i), array[i]);
    }

    /**
     * Test method for
     * {@link cse220.assign2.ArrayList#equals(java.lang.Object)}.
     */
    public final void testEqualsObject() {
        ArrayList a1 = new ArrayList();
        /* Test trivial inequality (with null). */
        assertFalse(a1.equals(null));

        ArrayList a2 = new ArrayList();
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
