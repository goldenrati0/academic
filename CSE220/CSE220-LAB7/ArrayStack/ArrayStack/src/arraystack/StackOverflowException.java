package arraystack;

public class StackOverflowException extends Exception{
    
    public StackOverflowException(String overflow){
        
        super(overflow);
        System.out.println(overflow);
    }
}