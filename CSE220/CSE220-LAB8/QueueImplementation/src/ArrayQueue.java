
public class ArrayQueue implements Queue {

    int size;
    int front;
    int rear;
    Object[] data;

    public ArrayQueue() {
        
        size = 0;
        front = -1;
        rear = -1;
        data = new Object[10];
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
        
        if (size == data.length) {
            
            throw new QueueOverflowException("Queue Overflow");
        }else{
            
            if (size == 0) {
                
                rear++;
                
                data[rear] = o;
                size++;
                front++;
            } else {
                
                rear++;
                
                if(rear == data.length){
                    
                    rear = 0;
                }
                
                data[rear] = o;
                size++;
            }
        }
    }

    public Object dequeue() throws QueueUnderflowException {
        
        if (size == 0) {
            
            throw new QueueUnderflowException("Queue Underflow");
        }
        
        Object val = data[front];
        data[front] = null;
        front++;
        size--;
        
        return val;
    }

    public Object peek() throws QueueUnderflowException {
        if (size == 0) {
            throw new QueueUnderflowException("Queue Underflow");
        } else {
            return data[front];
        }
    }

    public String toString() {
        
        String s = "";
        int indexManager = front-1;
        
        for (int i = 0; i < size; i++) {
            
            indexManager++;
            
            if(indexManager == data.length){
                
                indexManager=0;
            }
            
            s = s + " " + data[indexManager];
        }
        
        return "[" + s + " ]";
    }

    public Object[] toArray() {
        
        Object[] array = new Object[size];
        int arrayIndexManager = 0;
        int indexM = front-1;
        
        for (int j = 0; j < size; j++) {
            
            indexM++;
            if(indexM == data.length){
                
                indexM=0;
            }
            
            array[arrayIndexManager] = data[indexM];
            arrayIndexManager++;
        }
        
        return array;
    }

    public int search(Object o) {
        
        int offset = 0;
        int indexM = front-1;
        
        for (int i = 0; i < size; i++) {
            
            indexM++;
            if(indexM == data.length)
                indexM=0;
            
            
            if (data[indexM].equals(o)) {
                
                return offset;
            }else{
                
                offset++;
            }
        }

        return -1;
    }
}