public class ArrayQueue implements Queue{
  int size;
  int front;
  int rear;
  Object [] data;
  
  public ArrayQueue(int x){
    size=0;
    front = -1;
    rear = -1;
    data = new Object[x];
  }
  
//TO DO
  public int size(){
    return size;
  }
  
  public boolean isEmpty(){
    
    if (size==0){
      return true;
    }
    return false;
  }
  
  public void enqueue(Object o) throws QueueOverflowException{
    if (size == data.length){
      throw new QueueOverflowException();
    }else{
      if(size==0){
        data[size] = o;
        size++;
        front++;
        rear++;
      }else{
        data[size]=o;
        size++;
        rear++;
      }
    }
  }
  
  public Object dequeue() throws QueueUnderflowException{
    if (size==0){
      throw new QueueUnderflowException();
    }
    Object output=data[front];
    for(int n=0;n<size;n++){
      if(n!=size-1){
        data[n]=data[n+1];
      }
    }
    data[rear]=null;
    rear--;
    size--;
    return output;
  }
  
  public Object peek() throws QueueUnderflowException{
    if (size == 0){
      throw new QueueUnderflowException();
    }else{
      return data[front];
    }
  }
  public String toString(){
    String s="[";
    for(int i=0;i<size;i++){
      s=s+" "+data[i];
    }
    return s+']';
  }
  
  public Object[] toArray(){
    Object[] array=new Object[size];
    for(int j=0;j<size;j++){
      array[j]=data[j];
    }
    return array;
  }
  
  public int search(Object o){
    //System.out.println(top);
    for(int i=0;i<size;i++){
      if(data[i].equals(o)){
        return i; 
      }
    }
    
    return -1;
  }
}