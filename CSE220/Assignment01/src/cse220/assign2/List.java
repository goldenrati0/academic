/**
 * List.java
 */
package cse220.assign2;

/**
 * A List represents an ordered collection (also known as a
 * <i>sequence</i>) of elements in a container, which offers the user
 * precise control over where in this list each element is inserted.
 */
public interface List {
    /**
     * Returns the number of elements in this list.
     * 
     * @return the number of elements in this list
     */
    int size();

    /**
     * Returns <tt>true</tt> if this list is empty.
     * 
     * @return <tt>true</tt> if this list is empty
     */
    boolean isEmpty();

    /**
     * Returns <tt>true</tt> if this list contains the given element.
     * 
     * @param e element to search for
     * @return <tt>true</tt> if this list contains the given element
     */
    boolean contains(Object e);

    /**
     * Returns the index of the <b>first</b> occurrence of the specified
     * element in this list, or <tt>-1</tt> if this list does not contain
     * the element.
     * 
     * @param e element to search for
     * @return the index of the <b>first</b> occurrence of the specified
     *         element in this list, or <tt>-1</tt> if this list does not
     *         contain the element
     */
    int indexOf(Object e);

    /**
     * Returns the index of the <b>last</b> occurrence of the specified
     * element in this list, or <tt>-1</tt> if this list does not contain
     * the element.
     * 
     * @param e element to search for
     * @return the index of the <b>last</b> occurrence of the specified
     *         element in this list, or <tt>-1</tt> if this list does not
     *         contain the element
     */
    int lastIndexOf(Object e);

    /**
     * Appends the specified element to the end of this list.
     * 
     * @param e the element to add to the end of this list.
     */
    void add(Object e);

    /**
     * Inserts the specified element at the specified position in this
     * list.
     * 
     * @param index at which the specified element is to be inserted
     * @param e element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     *             (index &lt; 0 || index &gt; size())
     */
    void add(int index, Object e) throws IndexOutOfBoundsException;

    /**
     * Appends all of the elements in the specified list into this list
     * 
     * @param s list containing elements to append to this list
     */
    void addAll(List s);

    /**
     * Removes the element at the specified position in this list.
     * 
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     *             (index &lt; 0 || index &ge; size())
     */
    Object remove(int index) throws IndexOutOfBoundsException;

    /**
     * Removes the <b>first</b> occurrence of the specified element from
     * this list if it exists.
     * 
     * @param e element to remove from this list
     * @return <tt>true</tt> if the element was removed, <tt>false</tt>
     *         otherwise
     */
    boolean remove(Object e);

    /**
     * Removes all of the elements from this list. The list will be empty
     * after this method returns.
     */
    void clear();

    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index the index of the element to get
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *             (index &lt; 0 || index &ge; size())
     */
    Object get(int index) throws IndexOutOfBoundsException;

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
    Object set(int index, Object e) throws IndexOutOfBoundsException;

    /**
     * Reverses the order of the elements in this list, such that the an
     * element originally at index <tt>i</tt> moves to index
     * <tt>size-i-1</tt> after this operation.
     */
    void reverse();

    /**
     * Shifts the elements in this list right by <tt>k</tt> positions, and
     * fill the newly created <tt>k</tt> slots with <tt>null</tt>. The
     * <tt>size</tt> of this list is increased by <tt>k</tt>, and as such,
     * may need to be resized to accommodate the new slots.
     * 
     * @param k number of positions to shift
     */
    void shiftRight(int k);

    /**
     * Shifts the elements in this list left by <tt>k</tt> positions, and
     * fill the vacated <tt>k</tt> slots at the end with <tt>null</tt>.
     * The <tt>size</tt> of this list is decreased by <tt>k</tt>, and The
     * elements originally in the first <i>k</i> slots are lost.
     * 
     * @param k number of positions to shift
     * @throws RuntimeException if <tt>k &gt; size</tt>
     */
    void shiftLeft(int k);

    /**
     * Returns a new list whose elements references are copies of those in
     * this list.
     * 
     * @return a new list whose elements references are copies of those in
     *         this list
     */
    List copy();

    /**
     * Returns a string representation of this list. The string
     * representation consists of a list of this list's elements in the
     * order they are in this list, enclosed in square brackets ("[]").
     * Adjacent elements are separated by " " (space), and there is a
     * space after the opening '[' and a space before the closing ']'.
     * 
     * @return a string representation of this list.
     */
    String toString();

    /**
     * Returns an array whose elements are the elements of this list. The
     * array representation consists of this list's elements in the order
     * they are in this list.
     * 
     * @return an array representation of this list.
     */
    Object[] toArray();

    /**
     * Compares the specified object with this list for equality.
     * 
     * @param o object to be compared for equality with this list
     * @return <tt>true</tt> if the specified object is equal to this list
     */
    boolean equals(Object o);
}
