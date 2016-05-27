import java.util.Scanner;

public class Task7{
  public static void main(String[] args){
    
    run();
  }
  
  public static void run(){
    
    Scanner ana = new Scanner(System.in);
    
    int[] x = new int[10];
    
    for(int i=0; i<x.length; i++){
      
      x[i] = ana.nextInt();
    }
    
    int cell = ana.nextInt();
    
    for(int i=0; i<x[cell]; i++){
      
      System.out.print("*");
    }
    System.out.println();
  }
}