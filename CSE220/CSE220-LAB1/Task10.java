import java.util.Scanner;

public class Task10{

  public static String season(int month, int day){

    String date = month + "." + day;
    Double dateDouble = Double.parseDouble(date);
    String season = "";

    if( dateDouble>=3.16 && dateDouble<=6.15 ){

      season = "Spring";
    }else if( dateDouble>=6.16 && dateDouble<=9.15 ){

      season = "Summer";
    }else if( dateDouble>=9.16 && dateDouble<=12.15 ){

      season = "Fall";
    }else if( ( dateDouble>=12.16 && dateDouble<=12.31 ) || ( dateDouble>=01.01 && dateDouble<=3.15 ) ){

      season = "Winter";
    }else{

      season = "Month-Date Format Invalid";
    }



    return season;
  }

  public static void main(String[] args) {

    Scanner ana = new Scanner(System.in);

    int month = ana.nextInt();
    int day = ana.nextInt();

    System.out.println(season(month, day));
  }
}
