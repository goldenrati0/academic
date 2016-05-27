import java.util.Scanner;

public class Task4{  
  public static void main(String[] args){
    
    run();
  }
  
  public static void run(){
    
    Scanner ana = new Scanner(System.in);
    
    int[] x = new int[10];
    
    for(int i=0; i<x.length; i++){
      
      x[i] = ana.nextInt();
      
      for(int j=0; j<=i-1; j++){
        
        if(x[i] == x[j]){
          
          System.out.println("This number already exits");
          i--;
          break;
        }
      }
    }
  }
}