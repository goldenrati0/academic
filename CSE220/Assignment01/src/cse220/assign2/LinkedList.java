/**
 * LinkedList.java
 */
package cse220.assign2;

/**
 * Implementation of a List using a dummy head-referenced doubly-linked
 * circular list.
 */
public class LinkedList implements List {
    // Reference to the dummy head node of this circular linked list
    private Node header;

    // The number of elements in this list
    private int  size;

    /**
     * Creates an empty LinkedList.
     */
    public LinkedList() {
	// TODO
	// 1. Create a dummy head node with null element and null
	//    next/prev links
	// 2. Make it circular by making it's next and prev links
	//    pointing to itself
        // 3. Set size to 0
    }

    /**
     * Returns the number of elements in this list.
     * 
     * @return the number of elements in this list
     */
    @Override
    public int size() {
	// TODO
	return 0;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Returns <tt>true</tt> if this list is empty.
     * 
     * @return <tt>true</tt> if this list is empty
     */
    @Override
    public boolean isEmpty() {
	// TODO
	return true;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or <tt>-1</tt> if this list does not contain the
     * element.
     * 
     * @param e element to search for
     * @return the index of the first occurrence of the specified element
     *         in this list, or <tt>-1</tt> if this list does not contain
     *         the element
     */
    public int indexOf(Object e) {
	// TODO
	// 1. Scan the list (starting from after the dummy list) and
	//    and check if the element exists in this list. Keep a 
	//    counter, initialized to 0, that counts the current
	//    position of the node being examined.
	// 2. Return the position if found; otherwise, return -1
	return -1;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Returns the index of the last occurrence of the specified element
     * in this list, or <tt>-1</tt> if this list does not contain the
     * element.
     * 
     * @param e element to search for
     * @return the index of the last occurrence of the specified element
     *         in this list, or <tt>-1</tt> if this list does not contain
     *         the element
     */
    public int lastIndexOf(Object e) {
	// TODO
        // Instead of scanning from the front, we scan from the back
        // (thanks to this being a doubly-linked list). Just make sure
	// you return the correct position if found!
	return -1;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Returns <tt>true</tt> if this list contains the given element.
     * 
     * @param e element to search for
     * @return <tt>true</tt> if this list contains the given element
     */
    public boolean contains(Object e) {
	// TODO
	// Hint: use indexOf to see if the element is in this list or
	// not.
	return false;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Appends the specified element to the end of this list.
     * 
     * @param e the element to add to the end of this list.
     */
    public void add(Object e) {
	// TODO
        // Since we're appending to this list, the tail node is the
        // predecessor. The tail is of course header.prev. The easiest 
	// way is to add a new node containing the given element after
	// the tail node, which is header.prev. 
    }

    /**
     * Inserts the specified element at the specified position in this
     * list.
     * 
     * @param index at which the specified element is to be inserted
     * @param e element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     *             (index &lt; 0 || index &gt; size())
     */
    public void add(int index, Object e) throws IndexOutOfBoundsException {
	// TODO
	// Check for valid range for the index - the upper bound is
	// size, not size-1, since we can add a new element after the last 
	// element.
	// The simplest way is to find the predecessor node, and add a new
	// node containing the given element after the predecessor node.
	// 1. If index == 0, we're prepending to the list, in which case
	//    the dummy head is the predecessor of this new node.
	// 2. Otherwise, the predecessor is the node *currently* at the 
	//    position "index-1", so scan the list to find the predecessor..
	// 3. Now that you have the predecessor., add a new node containing
	//    the given element after this predecessor node.
    }

    /**
     * Appends all of the elements in the specified list into this list
     * 
     * @param s list containing elements to append to this list
     */
    public void addAll(List s) {
	// TODO
        // Since we don't know what kind of List s is (may be an
        // LinkedList, but may also be of other kinds such as an ArrayList), 
	// we can't "look" inside its private data. So we use the public 
	// method to extract the elements into an array, and then append 
	// those elements to this list.
	// 1. Extract the elements of "s" into an array of objects
	// 2. Iterate over the elements in the returned array, adding 
	//    each to the end of this list using it's add() method.
    }

    /**
     * Removes the element at the specified position in this list.
     * 
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     *             (index &lt; 0 || index &ge; size())
     */
    public Object remove(int index) throws IndexOutOfBoundsException {
	// TODO
	// 1. Check that index is within bounds, or else throw
	//    exception.
        // 2. Find the node at the given index (by scanning the list), 
	//    save the reference to the element within, and remove the
	//    the node. Return the reference to the element. 
	return null;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Removes the first occurrence of the specified element from this
     * list if it exists.
     * 
     * @param e element to remove from this list
     * @return <tt>true</tt> if the element was removed, <tt>false</tt>
     *         otherwise
     */
    public boolean remove(Object e) {
	// TODO
        // We first find the element's position (the first occurrence),
        // and then remove it. Of course, the element may not exist in
        // this list, and which case, we simply return false.
	// 1. Scan through the list, looking for a node that contains
	//    the given element.
	// 2. If found, then remove the node found, and return true.
	// 3. If not found, return false.
	return false;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Removes all of the elements from this list. The list will be empty
     * after this method returns.
     */
    public void clear() {
	// TODO
	// Two ways of doing this:
	// 1. Easy, but ok for cse220, way: set header's next and prev
	//    links to be header (that is, make it circular), and set 
	//    the size to be 0. The GC will
	//    take care of the orphaned nodes.
	// 2. Hard, but proper way: we iterate over the nodes and remove 
	//    each node, except for the dummy head. Finally we make the 
	//    resulting empty list circular, and set size to 0.
    }

    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index the index of the element to get
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *             (index &lt; 0 || index &ge; size())
     */
    public Object get(int index) throws IndexOutOfBoundsException {
	// TODO
	// 1. Check if index is within bounds, or else throw exception.
	// 2. Scan the list and get the node at the given position,
	//    and return the element within.
	return null;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     * 
     * @param index the index of the element to replace
     * @param e the element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     *             (index &lt; 0 || index &ge; size())
     */
    public Object set(int index, Object e)
            throws IndexOutOfBoundsException {

	// TODO
	// 1. Check if index is within bounds, or else throw exception.
	// 2. Scan the list and get the node at the given position.
	// 3. Save a reference to the current element within the node.
	// 4. Replace the node's element with the given one.
	// 5. Return the reference to the old element.
	return null;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Reverses the order of the elements in this list, such that the an
     * element originally at index <tt>i</tt> moves to index
     * <tt>size-i-1</tt> after this operation.
     */
    public void reverse() {
        // TODO
	// 1. Use two references, a starting at first node (header.next, and
	//    moving forward), and b starting at tail node (header.prev, 
	//    and moving backwards)
	// 2. Swap the elements until you have swapped size/2 elements
    }

    /**
     * Shifts the elements in this list right by <tt>k</tt> positions, and
     * fill the newly created <tt>k</tt> slots with <tt>null</tt>. The
     * <tt>size</tt> of this list is increased by <tt>k</tt>, and as such,
     * may need to be resized to accommodate the new slots.
     * 
     * @param k number of positions to shift
     */
    public void shiftRight(int k) {
        // TODO
	// Add k elements (with null value) to the beginning of this
	// list using one of the add methods.
    }

    /**
     * Shifts the elements in this list left by <tt>k</tt> positions, and
     * fill the vacated <tt>k</tt> slots at the end with <tt>null</tt>.
     * The <tt>size</tt> of this list is decreased by <tt>k</tt>, and The
     * elements originally in the first <i>k</i> slots are lost.
     * 
     * @param k number of positions to shift
     * @throws RuntimeException if <tt>k &gt; size</tt>
     */
    public void shiftLeft(int k) {
        // TODO
	// Remove k elements from the beginning of this list.
    }

    /**
     * Returns a new list whose elements references are copies of those in
     * this list.
     * 
     * @return a new list whose elements references are copies of those in
     *         this list
     */
    public LinkedList copy() {
	// TODO
        // We create a empty new LinkedList as the copy, and add all 
	// this list's elements to it, and return the copy. Hint: use 
	// the addAll method of the newly created list, passing "this"
	// as the parameter.
	return null;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Returns a string representation of this list. The string
     * representation consists of a list of the list's elements in the
     * order they are in this list, enclosed in square brackets ("[]").
     * Adjacent elements are separated by " " (space), and there is a
     * space after the opening '[' and a space before the closing ']'.
     * 
     * @return a string representation of this list.
     */
    public String toString() {
	// TODO
        // Start by creating an empty StringBuffer, and slowly build it up
        // element by element.
	// 
        // If the list contains elements "help" and "me", this method
	// will return the String "[ help me ]". Note the space after 
	// the opening "[" and one before the closing "]". If you
	// look at assignment 1, you'll know how to do this.
	// The StringBuffer class is really the correct way to "build up"
	// a string element at a time, but I'll accept any correct answer.
	return null;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Returns an array whose elements are the elements of this list. The
     * array representation consists of the list's elements in the order
     * they are in this list.
     * 
     * @return an array representation of this list.
     */
    public Object[] toArray() {
	// TODO
        // If this list contains elements "help" and "me", this method
	// will return an array containing the two elements. Create an 
	// array of "size" capacity, and iterate over the elements of this 
	// list, adding each to the output array.
	return null;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Compares the specified object with this list for equality.
     * 
     * @param o object to be compared for equality with this list
     * @return <tt>true</tt> if the specified object is equal to this list
     */
    public boolean equals(Object o) {
	// TODO
	// Same as ArrayList#equals(Object) method.
        // 1. Basic checks first: check for reference equality, then check if
        // the other object is null, or if it's not a List at all.
	// 2. Cast "o" to a reference to a List object
	// 3. Check that the sizes match
	// 4. Now check if all elements of the other list matches this
	//    one: extract the other list's elements using toArray, and
	//    check against this one's.
	return false;			// TODO: REMOVE THIS LINE!
    }

    /**
     * Represents a node in the doubly linked list.
     */
    private class Node {
        /** The element within this node */
        public Object element;
        /** Reference to the next node in the list */
        public Node   next;
        /** Reference to the previous node in the list */
        public Node   prev;

        /**
         * Creates a new node with specified object and next/previous
         * nodes.
         * 
         * @param e the element within this node
         * @param n the next node in the list
         * @param p the previous node in the list
         */
        public Node(Object e, Node n, Node p) {
            element = e;
            next = n;
            prev = p;
        }

        /**
         * Creates a new <b>detached</b> node with specified object.
         * 
         * @param e the element within this node
         */
        public Node(Object e) {
            this(e, null, null);
        }
    }

    /**
     * Tests this LinkedList class.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("help");
        list.add("me");
        System.out.println(list); // print out [ "help" "me" ]

        List copy = list.copy();
        System.out.println("equal = " + list.equals(copy));
        copy.remove(0);
        System.out.println("equal = " + list.equals(copy));
        list.remove("help");
        System.out.println("equal = " + list.equals(copy));

        // Basic test
        LinkedList a = new LinkedList();
        for (int i = 0; i < 5; i++)
            a.add(new Integer(i));

        for (int i = 0; i < a.size(); i++)
            System.out.println("a[" + i + "] = " + a.get(i));

        System.out.println("List a = " + a.toString());

        // Testing set
        a.set(0, new Integer(199));
        a.set(1, new Integer(133));
        System.out.println("List a = " + a.toString());

        // Test add(int, Object)
        a.add(0, new Integer(-17));
        a.add(2, new Integer(-13));
        System.out.println("List a = " + a.toString());

        // Test remove(int)
        a.remove(2);
        System.out.println("List a = " + a.toString());

        // Test remove(Object)
        a.remove(new Integer(2));
        System.out.println("List a = " + a.toString());

        a.remove(new Integer(-13)); // No such value in array
        System.out.println("List a = " + a.toString());

        /* Test contains, indexOf, lastIndexOf, etc. */
        if (a.contains(new Integer(133)))
            System.out.println("List a contains 133.");
        else
            System.out.println("List a DOES not contain 133. (ERROR)");

        System.out.println("Index of 133 = "
                + a.indexOf(new Integer(133)));
        System.out.println("Last index of 133 = "
                + a.lastIndexOf(new Integer(133)));

        /* Test toArray. */
        Object[] a1 = a.toArray();
        System.out.println("Array returned from List a = "
                + java.util.Arrays.toString(a1));

        // Test clear, save it first in b
        LinkedList b = (LinkedList) a.copy();
        a.clear();
        System.out.println("List a = " + a.toString());

        try {
            // Trying to remove element at non-existent position.
            a.remove(2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }

        try {
            // Trying to add at non-existent position.
            a.add(1, new Integer(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }

        System.out.println("b = " + b);
        b.reverse();
        System.out.println("reverse(b) = " + b);
        b.shiftRight(1);
        System.out.println("shiftRight(b, 1) = " + b);
        b.shiftLeft(1);
        System.out.println("shiftLeft(b, 1) = " + b);

        b.shiftRight(4);
        System.out.println("shiftRight(b, 4) = " + b);
        b.shiftLeft(4);
        System.out.println("shiftLeft(b, 4) = " + b);
    }
}
