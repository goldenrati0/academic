import java.util.*;

public class Task2{
  public static void main(String[] args){
    
    Scanner ana = new Scanner(System.in);
    
    int[] x = new int[10];
    
    for(int i=0; i<x.length; i++){
      
      x[i] = ana.nextInt();
    }
    
    int[] newX = copyArray(x);
    Arrays.sort(newX);
    
    System.out.println("Maximum Value: " + newX[newX.length-1]);
    System.out.println("Minimum Value: " + newX[0]);
    
    int maxIndex = maxIndex(x);
    int minIndex = minIndex(x);
    
    int temp = x[maxIndex];
    x[maxIndex] = x[minIndex];
    x[minIndex] = temp;
    
    for(int i=0; i<x.length; i++){
      
      System.out.print(x[i] + ",");
    }
  }
  
  public static int[] copyArray(int[] arr){
    
    int[] newX = new int[arr.length];
    
    for(int i=0; i<newX.length; i++){
      
      newX[i] = arr[i];
    }
    
    return newX;
  }
  
  public static int maxIndex(int[] arr){
    
    int[] newX = copyArray(arr);
    Arrays.sort(newX);
    
    int index = 0;
    
    for(int i=0; i<arr.length; i++){
      
      if(newX[newX.length-1] == arr[i]){
        
        index = i;
      }
    }
    
    return index;
  }
  
  public static int minIndex(int[] arr){
    
    int[] newX = copyArray(arr);
    Arrays.sort(newX);
    
    int index = 0;
    
    for(int i=0; i<arr.length; i++){
      
      if(newX[0] == arr[i]){
        
        index = i;
      }
    }
    
    return index;
  }
}