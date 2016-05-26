/*
 * Hackerrank: https://www.hackerrank.com/contests/projecteuler/challenges/euler003
 *
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution{
  public static void main(String[] args){

    Scanner ana = new Scanner(System.in);
    int testCase = ana.nextInt();

    for(int test=1; test<=testCase; test++){

      long x = ana.nextLong();
      long[] numberArray = new long[999999];
      long indexManager = 0;

      for(long i=2; i<=x; i++){  //loop starts: inserts all the factors in the array

        if(x%i == 0){

          numberArray[(int)indexManager] = i;
          indexManager++;
        }
      } //loop ends

      indexManager = 0;
      numberArray = sortMyArray(numberArray);

      long[] primeArray = new long[numberArray.length];

      for(long i=0; i<numberArray.length; i++){ //loop starts: inserts all the prime factors in the array

        if(isItPrime(numberArray[(int)i])){

          primeArray[(int)indexManager] = numberArray[(int)i];
          indexManager++;
        }
      } //loop ends

      primeArray = sortMyArray(primeArray);
      Arrays.sort(primeArray);

      System.out.println(primeArray[primeArray.length-1]);
    }
  }

  public static boolean isItPrime(long number){

    boolean isPrime = true;

    if(number==2){

      isPrime = true;

      return isPrime;
    }else{

      for(long i=2; i<number; i++){

        if(number%i == 0){

          isPrime = false;
          break;
        }
      }

      return isPrime;
    }
  }

  public static long[] sortMyArray(long[] arra){

    long numberCounter = 0;

    for(long i=0; i<arra.length; i++){

      if(arra[(int)i] != 0){

        numberCounter++;
      }
      if(arra[(int)i]==0){

        break;
      }
    }

    long[] sortArray = new long[(int)numberCounter];

    for(long i=0; i<numberCounter; i++){

      sortArray[(int)i] = arra[(int)i];
    }

    Arrays.sort(sortArray);

    return sortArray;
  }
}
