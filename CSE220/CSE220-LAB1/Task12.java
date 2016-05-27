import java.util.Scanner;

public class Task12{

  public static boolean before(double first, double second){

    boolean isFirst = true;

    if( first> second ){

      isFirst = true;
    }else{

      isFirst = false;
    }

    return isFirst;
  }

  public static void main(String[] args) {

    Scanner ana = new Scanner(System.in);

    int firstMonth = ana.nextInt();
    int firstDay = ana.nextInt();
    String firstString = firstMonth + "." + firstDay;
    double first = Double.parseDouble(firstString);

    int secondMonth = ana.nextInt();
    int secondDay = ana.nextInt();
    String secondString = secondMonth + "." + secondDay;
    double second = Double.parseDouble(secondString);

    System.out.println(before(first, second));
  }

}
