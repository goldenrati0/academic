import java.util.Scanner;

public class Task9{
  public static void main(String[] args){

      Scanner ana = new Scanner(System.in);

      int[] x = new int[10];

      for(int i=0; i<x.length; i++){

        x[i] = ana.nextInt();
      }

      printArray(x, x.length);
      int[] square = squareMe(x, x.length);
      printArray(square, square.length);

  }

  public static int[] squareMe(int[] x, int size){

    int[] arr = new int[size];

    for(int i=0; i<x.length; i++){

      arr[i] = (int) Math.pow(x[i], 2);
    }

    return arr;
  }

  public static void printArray(int[] x, int size){

    for(int i=0; i<size; i++){

      System.err.println("x[" + i + "]" + " = " + x[i]);
    }
  }
}
