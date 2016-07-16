
public class ListQueue implements Queue {

    int size;
    Node front;
    Node rear;

    public ListQueue() {
        
        size = 0;
        front = null;
        rear = null;
    }

//TO DO
    public int size() {
        
        return size;
    }

    public boolean isEmpty() {

        if (size == 0) {
            return true;
        }
        
        return false;
    }

    public void enqueue(Object o) throws QueueOverflowException {
        
        Node add = new Node(o, null);

        if (front == null) {
            front = add;
            rear = front;
            size++;
        }else{
            rear.next = add;
            rear = add;
            size++;
        }
    }

    public Object dequeue() throws QueueUnderflowException {
        
        Object output = null;
        
        if (size == 0) {
            
            throw new QueueUnderflowException("Queue Underflow");
        }else{
            
            Node n = front;

            output = n.val;
            front = front.next;
            
            n.val = null;
            n.next = null;
            n = null;
            
            size--;
        }
        return output;
    }

    public Object peek() throws QueueUnderflowException {
        
        Object output = null;
        
        output = front.val;
        
        return output;
    }

    public String toString() {
        
        String s = "";
        
        for (Node n = front; n != null; n = n.next) {
            s = s + " " + n.val;
        }
        
        return "[" + s + " ]";
    }

    public Object[] toArray() {
        
        Object[] array = new Object[size];
        
        Node temp = front;
        
        for (int i = 0; i < size; i++) {
            array[i] = temp.val;
            temp = temp.next;
        }
        
        return array;
    }

    public int search(Object o) {
        
        int i = 0;
        
        for (Node n = front; n != null; n = n.next) {
            if (n.val.equals(o)) {
                return i;
            }
            i++;
        }
        
        return -1;
    }
}