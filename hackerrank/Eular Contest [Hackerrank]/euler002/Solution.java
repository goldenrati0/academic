/*
 * Hackerrank: https://www.hackerrank.com/contests/projecteuler/challenges/euler002
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {

    Scanner ana = new Scanner(System.in);
    int testCase = ana.nextInt();

    for(int i=1; i<=testCase; i++){

      long x = ana.nextLong();
      long[] fibonacci = generateFibonacci(500);
      long sum = 0;

      for(int j=0; j<fibonacci.length; j++){

        if(fibonacci[j] <= x){

          if(fibonacci[j]%2 == 0){

            sum += fibonacci[j];
          }
        }else{

          break;
        }
      }

      System.out.println(sum);
    }
  }

  
  public static long[] generateFibonacci(int length){

    long[] fiboArray = new long[length];

    fiboArray[0] = 1;
    fiboArray[1] = 2;

    for(int i=2; i<fiboArray.length; i++){

      fiboArray[i] = fiboArray[i-1] + fiboArray[i-2];
    }

    return fiboArray;
  }
}
