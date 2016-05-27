import java.util.*;

public class Task6{
  public static void main(String[] args){
    
    run();
  }
  
  public static void run(){
    
    Scanner ana = new Scanner(System.in);
    System.out.println("Array size");
    int size = ana.nextInt();
    int[] x = new int[size];
    
    for(int i=0; i<x.length; i++){
      
      x[i] = ana.nextInt();
    }
    
    if(isPalindrome(x)){
      
      System.out.println("Array is a Palindrome");
    }else{
      
      System.out.println("Array is NOT a Palindrome");
    }
    
  }
  
  public static boolean isPalindrome(int[] arr){
    
    String x = "";
    String reverse = "";
    
    for(int i=0; i<arr.length; i++){
      
      x += arr[i];
    }
    
    for(int i=arr.length-1; i>=0; i--){
      
      reverse += arr[i];
    }
    
    if(x.equals(reverse)){
      
      return true;
    }else{
      
      return false;
    }
  }
}