/*
* Hackerrank: https://www.hackerrank.com/contests/projecteuler/challenges/euler013/
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
  public static void main(String[] args) {

    Scanner ana = new Scanner(System.in);
    long testCase = ana.nextLong();
    ana.nextLine();

    BigInteger sum = new BigInteger("0");
    BigInteger x = new BigInteger("0");
    String temp = "";
    for(long i=1; i<=testCase; i++){

      temp = ana.nextLine();
      x = new BigInteger(temp);

      sum = sum.add(x);
    }

    String s = String.valueOf(sum);

    for(int i=0; i<10; i++){

      System.out.print(s.charAt(i));
    }
  }
}
