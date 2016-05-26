/**
 * Hackerrank: https://www.hackerrank.com/contests/projecteuler/challenges/euler001
 **/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  static Scanner ana = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    long testCase = ana.nextLong();
    doRun(testCase);
  }
  
  public static void doRun(long testCase){
    
    long sum;
    for(int i=1; i<=testCase; i++){
      
      sum = 0;
      long range = ana.nextLong();
      
      for(long j=1; j<range; j++){
        
        if( (j%3 == 0) || (j%5 == 0) ){
          
          sum = sum + j;
        }
      }
      System.out.println(sum);
    }
  }
}