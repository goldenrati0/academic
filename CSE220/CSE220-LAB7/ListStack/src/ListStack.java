public class ListStack implements Stack{
    int size;
    Node top = null;
//    Node head;
    int maxSize;
  
    
    public ListStack(){
        size = 0;
        top = null;
        maxSize = 10;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     *
     * @param e
     * @throws StackOverflowException
     */
    @Override
    public void push(Object e) throws StackOverflowException {
        if (size == maxSize) {
            throw new StackOverflowException("overflow");
        } else {
            
            if(size==0){
                
                Node in = new Node(e, null);
                size++;
                top = in;
                
            }else{
                
                Node in = new Node(e, null);
                size++;
                in.next = top;
                top = in;
            }          
        }
    }
    
    @Override
    public Object pop() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException("underflow");
        } else {
            
            Object val = top.val;
            Node rn = top;
            
            top = top.next;
            
            rn.next = null;
            rn.val=null;
            rn=null;
            
            size--;
            
            return val;
        }
    }
    
    /**
     *
     * @return
     * @throws StackUnderflowException
     */
    @Override
    public Object peek() throws StackUnderflowException {
        if (size != 0) {
            Object val = top.val;
            return val;
        } else {
            throw new StackUnderflowException("underflow");
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String s = "";
        for (Node n=top; n!=null; n=n.next) {
            s = s + n.val + " ";
        }
        return "[ " + s + " ]";
    }
    
    @Override
    public Object[] toArray() {
        Object[] a = new Object[size];
        int c = 0;
        for (Node n=top; n!=null; n=n.next) {
            a[c] = n.val;
            c++;
        }
        return a;
    }
    
    /**
     *
     * @param e
     * @return
     */
    @Override
    public int search(Object e) {
        
        int i=0;
        
        for(Node n=top; n!=null; n=n.next){
            
            if(n.val.equals(e)){
                return i;
            }else{
                
                i++;
            }
        }
        
        return -1;
    }

}