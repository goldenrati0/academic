import java.util.Scanner;

public class Task8{
  public static void main(String[] args){
    
    run();
  }
  
  public static void run(){
    
    Scanner ana = new Scanner(System.in);
    
    int size = ana.nextInt();
    
    int[] x = new int[size];
    int[] y = new int[size];
    
    for(int i=0; i<x.length; i++){
      
      x[i] = ana.nextInt();
    }
    
    for(int i=0; i<x.length; i++){
      
      y[i] = ana.nextInt();
    }
    
    for(int i=0; i<x.length; i++){
      
      System.out.print(((x[i]*5) - y[i]) + " ");
    }
  }
}
  