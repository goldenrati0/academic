import java.util.*;

public class Task3{
  public static void main(String[] args){
    
    Scanner ana = new Scanner(System.in);
    int[] x = new int[5];
    
    for(int i=0; i<x.length; i++){
      
      x[i] = ana.nextInt();
    }
    
    Arrays.sort(x);
    
    for(int i=x.length-1; i>=0; i--){
      
      System.out.print(x[i] + ",");
    }
    
    for(int i=x.length-1; i>=0; i--){
      
      if(x[i]%2==0){
        
        System.out.print(x[i] + ",");
      }
    }
  }
}