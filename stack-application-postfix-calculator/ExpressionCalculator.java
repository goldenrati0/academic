import java.util.*;

public class ExpressionCalculator{
  public static void main(String[] args){
    
    Scanner katniss = new Scanner(System.in);
    
    ArrayStack a = new ArrayStack(1000);
    
    String x = katniss.nextLine();
    
    char[] xArray = x.toCharArray();
    
//    String[] xStrArray = new String[xArray.length];
    
//    for(int i=0; i<xStrArray.length; i++){
//      
//      String temp = "";
//      temp = temp + xArray[i];
//      xStrArray[i] = temp;
//    }
    
    try{
      for(int i=0; i<x.length(); i++){
        
        if( xArray[i] == '0' || xArray[i] == '1' || xArray[i] == '2' || xArray[i] == '3' || xArray[i] == '4' || xArray[i] == '5' || xArray[i] == '6' || xArray[i] == '7' || xArray[i] == '8' || xArray[i] == '9'){
          
          a.push(xArray[i]);
        }else if( xArray[i] == '+' || xArray[i] == '-' || xArray[i] == '*' || xArray[i] == '/' ){
          
          switch(xArray[i]){
            
            case '+':
              
              int c = Integer.parseInt(String.valueOf(a.pop()));
              int d = Integer.parseInt(String.valueOf(a.pop()));
              
              int sum = d + c;
              
              a.push(sum);
              
//              System.out.println(a.peek());
              continue;
              
            case '-':
              
              int e = Integer.parseInt(String.valueOf(a.pop()));
              int f = Integer.parseInt(String.valueOf(a.pop()));
              
              int sum2 = f - e;
              
              a.push(sum2);
              
//              System.out.println(a.peek());
              continue;
              
            case '*':
              
              int g = Integer.parseInt(String.valueOf(a.pop()));
              int h = Integer.parseInt(String.valueOf(a.pop()));
              
              int sum3 = h * g;;
              
              a.push(sum3);
              
//              System.out.println(a.peek());
              continue;
              
            case '/':
              
              int k = Integer.parseInt(String.valueOf(a.pop()));
              int l = Integer.parseInt(String.valueOf(a.pop()));
              
              int sum4 = l - k;
              
              a.push(sum4);
              
//              System.out.println(a.peek()); 
              continue;
          }
        }
      }
      
      System.out.println(a.peek());
    }catch(Exception e){
      
//      e.printStackTrace();
      System.err.println(e);
    }
  }
}