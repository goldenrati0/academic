import java.util.Scanner;

public class Task5{
  public static void main(String[] args){
    
    run();
  }
  
  public static void run(){
    
    Scanner ana = new Scanner(System.in);
    
    int[] z = {0,1,2,3,4,5,6,7,8,9};
    int[] counter = new int[z.length];
    int[] x = new int[15];
    
    for(int i=0; i<x.length; i++){
      
      x[i] = ana.nextInt();
    }
    
    for(int i=0; i<x.length; i++){
      
      for(int j=0; j<z.length; j++){
        
        if(x[i] == z[j]){
          
          counter[j]++;
        }
      }
    }
    
    for(int i=0; i<counter.length; i++){
      
      System.out.println(z[i] + " was found " + counter[i] + " times");
    }
  }
}