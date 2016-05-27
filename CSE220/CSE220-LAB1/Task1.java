import java.util.Scanner;

public class Task1{
  public static void main(String[] args){
    
    Scanner ana = new Scanner(System.in);
    int[] ar1 = {1,2,6};
    int[] ar2 = {6,1,2,3};
    int[] ar3 = {13, 6, 1, 2, 3};
    
    if(ar1[0]==6 || ar1[ar1.length-1]==6){
      
      System.out.println("true");
    }else{
      
      System.out.println("false");
    }
    
    if(ar2[0]==6 || ar2[ar2.length-1]==6){
      
      System.out.println("true");
    }else{
      
      System.out.println("false");
    }
    
    if(ar3[0]==6 || ar3[ar3.length-1]==6){
      
      System.out.println("true");
    }else{
      
      System.out.println("false");
    }
    
  }
}