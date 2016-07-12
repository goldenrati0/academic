public class StackUnderflowException extends Exception{
    
    public StackUnderflowException(String underflow){  
        super(underflow);
        System.out.println(underflow);
    }
}