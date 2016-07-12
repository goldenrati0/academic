package arraystack;

public class StackUnderflowException extends Exception{
    
    /**
     *
     * @param underflow
     */
    public StackUnderflowException(String underflow){
        
        super(underflow);
        System.out.println(underflow);
    }
}