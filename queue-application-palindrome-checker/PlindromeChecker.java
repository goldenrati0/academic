import java.util.Scanner;

public class PlindromeChecker{
  public static void main(String[] args){
    
    Scanner katniss = new Scanner(System.in);
    
    ArrayQueue aq = new ArrayQueue(1000);
    ArrayStack as = new ArrayStack(1000);
    
    String x = katniss.nextLine();
    
    char[] xArray = x.toCharArray();
    
    try{
      
      boolean isPalindrome = true;
      
      for(int i=0; i<xArray.length; i++){
        
        if( (x.codePointAt(i) >=65 && x.codePointAt(i) <=90) || (x.codePointAt(i) >=97 && x.codePointAt(i) <=122)){
          
          if( x.codePointAt(i) >=65 && x.codePointAt(i) <=90 ){
            
            int ascii = x.codePointAt(i) + 32;
            xArray[i] = (char) ascii;
            
            as.push(xArray[i]);
            aq.enqueue(xArray[i]);
          }else if( x.codePointAt(i) >=97 && x.codePointAt(i) <=122 ){
            
            as.push(xArray[i]);
            aq.enqueue(xArray[i]);            
          }              
        }
      }
      
      while(!aq.isEmpty()){
        
        char c1 = (char)aq.dequeue();
        char c2 = (char)as.pop();
        
        if( c1 != c2){
          
          isPalindrome = false;
          break;
        }
      }
      
      if(isPalindrome){
        System.out.println("This is a Palindrome");
      }else if(!isPalindrome){
        
        System.out.println("This is NOT a Palindrome");
      }
    }catch(Exception e){
      
      System.err.println(e);
//      e.printStackTrace();
    }
  }
}