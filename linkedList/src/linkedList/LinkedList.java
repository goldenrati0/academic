/**
 * 
 */
package linkedList;

/**
 * @author tahmid
 *
 */
public class LinkedList {

	public Node head;
	private int nodeCount = 0;

	/*
	 * First Constructor: Creates a linked list using the values from the given
	 * array. head will refer to the Node that contains the element from a[0]
	 */
	public LinkedList(Object[] a) {

		this.head = new Node(a[0], null);
		Node temp = this.head;
		this.nodeCount++;

		for (int i = 1; i < a.length; i++) {

			temp.next = new Node(a[i], null);
			temp = temp.next;
			
			this.nodeCount++;
		}
	}

	/*
	 * Second Constructor: Sets the value of head. head will refer to the given
	 * LinkedList
	 */
	public LinkedList(Node h) {
		
		
		this.head = h;
	}

	/* Counts the number of Nodes in the list */
	public int countNode() {
		// TO DO
		return this.nodeCount; // please remove this line!
	}

	/* prints the elements in the list */
	public void printList() {

		for (Node n = head; n != null; n = n.next) {

			System.out.print(n.element + ",");
		}

		System.out.println();
	}

	// returns the reference of the Node at the given index. For invalid index
	// return null.
	public Node nodeAt(int idx) {

		int indexmanager = 0;

		if (idx > this.nodeCount || idx < 0) {

			return null;
		} else {

			for (Node n = head; n != null; n = n.next) {

				if (indexmanager == idx) {

					return n;
				} else {

					indexmanager++;
				}
			}

			return null;
		}
	}

	// returns the element of the Node at the given index. For invalid idx
	// return null.
	public Object get(int idx) {

		int indexmanager = 0;

		if (idx > this.nodeCount || idx < 0) {

			return null;
		} else {

			for (Node n = head; n != null; n = n.next) {

				if (indexmanager == idx) {

					return n.element;
				} else {

					indexmanager++;
				}
			}

			return null;
		}
	}

	/*
	 * updates the element of the Node at the given index. Returns the old
	 * element that was replaced. For invalid index return null. parameter:
	 * index, new element
	 */
	public Object set(int idx, Object elem) {
		
		int indexmanager = 0;
		
		if(idx > this.nodeCount || idx < 0){
			
			return null;
		}else{
			
			for(Node n=head; n!=null; n=n.next){
				
				if(indexmanager == idx){
					
					Object temp = n.element;
					n.element = elem;
					
					return temp;
				}else{
					
					indexmanager++;
				}
			}
			
			return null;
		}
	}

	/*
	 * returns the index of the Node containing the given element. if the
	 * element does not exist in the List, return -1.
	 */
	public int indexOf(Object elem) {
		
		int indexManager = 0;
		
		for(Node n=head; n!=null; n=n.next){
			
			if(n.element.equals(elem)){
				
				return indexManager;
			}else{
				
				indexManager++;
			}
		}
		
		return -1;
	}

	// returns true if the element exists in the List, return false otherwise.
	public boolean contains(Object elem) {

		boolean isPresent = false;

		for (Node n = head; n != null; n = n.next) {

			if (n.element.equals(elem)) {

				return true;
			}
		}
		
		return isPresent;// please remove this line!
	}

	// Makes a duplicate copy of the given List. Returns the reference of the
	// duplicate list.
	public Node copyList() {
		
		Node copyHead = null;
		Node copyTail = null;
		
		for(Node n=this.head; n!=null; n=n.next){
			
			Node newNode = new Node(n.element, null);
			
			if(copyHead == null){
				
				copyHead = newNode;
				copyTail = copyHead;
			}else{
				
				copyTail.next = newNode;
				copyTail = copyTail.next;
			}
		}
		
		return copyHead;
	}

	// Makes a reversed copy of the given List. Returns the head reference of
	// the reversed list.
	public Node reverseList() {
		
		Node newHead = null;
		
		for(Node n=this.head; n!=null; n=n.next){
			
			Node newNode = new Node(n.element, null);
			
			newNode.next = newHead;
			newHead = newNode;
		}
		
		return newHead;
	}

	/*
	 * inserts Node containing the given element at the given index Check
	 * validity of index.
	 */
	public void insert(Object elem, int idx) {
		
		if(idx == 0){
			
			Node newNode = new Node(elem, null);
			
			newNode.next = this.head;
			this.head = newNode;
			
			this.nodeCount++;
		}else if(idx>0 && idx<this.nodeCount){
			
			Node pred;
			Node newNode;
			int indexManager = 1;
			
			for(Node n=this.head; n!=null; n=n.next){
				
				if(indexManager == idx){
					
					pred = nodeAt(indexManager-1);
					newNode = new Node(elem, null);
					
					newNode.next = pred.next;
					pred.next = newNode;
					this.nodeCount++;
					break;
				}else{
					
					indexManager++;
				}
				
			}
		}else if(idx == this.nodeCount){
			
			Node pred = nodeAt(idx-1);
			Node newNode = new Node(elem, null);
			
			pred.next = newNode;
			this.nodeCount++;
		}
	}

	/*
	 * removes Node at the given index. returns element of the removed node.
	 * Check validity of index. return null if index is invalid.
	 */
	public Object remove(int index) {
		
		if(index<0 || index>this.nodeCount){
			
			return null;
		}else{
			
			if(index == 0){
				
				Node removeNode = this.head;
				
				this.head = removeNode.next;
				
				Object elem = removeNode.element;
				
				removeNode.element = null;
				removeNode.next = null;
				removeNode = null;
				
				this.nodeCount--;
				
				return elem;
			}else{
				
				int indexManager = 1;
				
				for(Node n=this.head; n!=null; n=n.next){
					
					if(indexManager == index){
						
						Node pred = nodeAt(index-1);
						Node removeNode = nodeAt(index);
						
						pred.next = removeNode.next;
						
						Object elem = removeNode.element;
						
						removeNode.element = null;
						removeNode.next = null;
						removeNode = null;
						
						this.nodeCount--;
						
						return elem;
					}else{
						
						indexManager++;
					}
				}
			}
		}
		
		return null; // please remove this line!
	}

	// Rotates the list to the left by 1 position.
	public void rotateLeft() {
		
		Node firstNode = this.head;;
		Node succNode = this.head.next;
		Node lastNode = null;
		
		for(Node n=head; n!=null; n=n.next){
			
			if( n.next == null ){
				
				lastNode = n;
			}
		}
		
		firstNode.next = null;
		lastNode.next = firstNode;
		this.head = succNode;
		
	}

	// Rotates the list to the right by 1 position.
	public void rotateRight() {
		
		Node lastNode = null;
		Node predNode = null;
		
		int indexManager = 0;
		
		for(Node n=head; n!=null; n=n.next){
			
			if( n.next == null ){
				
				lastNode = n;
				predNode = nodeAt(indexManager - 1);
			}else{
				
				indexManager++;
			}
		}
		
		lastNode.next = this.head;
		this.head = lastNode;
		predNode.next = null;
		
	}

}