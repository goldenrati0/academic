public class ArrayStack implements Stack{
  int size;
  int top;
  Object [] data;
  
  public ArrayStack(int x){
    size=0;
    top =-1;
    data = new Object[x];
  }
  
  public ArrayStack(){
    size=0;
    top =-1;
    data = new Object[500];
  }
  public int size()
  {
    return size ;
  }
  public boolean isEmpty()
  {
    if(size==0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public void push(Object e) throws StackOverflowException
  {
    if(size==data.length)
    {
      throw new StackOverflowException();
    }
    else
    {
      top ++;
      data[top]=e;
      size++;
    }
  }
  
  public Object pop() throws StackUnderflowException
  {
    if(size==0)
    {
      throw new  StackUnderflowException();
    }
    else
    {
      Object val = data[top];
      data[top]=null;
      top--;
      size--;
      return val;
    }
  }
  public Object peek() throws StackUnderflowException
  {
    if(top>=0)
    {
      Object val = data[top];
      return val;
    }
    else
    {
      throw new  StackUnderflowException();
    }
  }
  public String toString()
  {
    String s="";
    for(int i=size-1;i>=0;i--)
    {
      s= " "+s+data[i]+" ";
    }
    return s;
  }
  public Object[] toArray()
  {
    Object[] a=new Object[size];
    int c=0;
    for(int i=size-1;i>=0;i--)
    {
      a[c]=data[i];
    }
    return a;
  }
  public int search(Object e)
  {
    for(int i=size-1;i>=0;i--)
    {
      if(data[i].equals(e))
      {
        return top; 
      }
    }
    
    return -1;
    
    
  }
  
}
