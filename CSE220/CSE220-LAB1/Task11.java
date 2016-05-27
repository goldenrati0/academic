public class Task11{
  public static void main(String[] args) {


    System.out.println(allDigitsOdd(135319));
    System.out.println(allDigitsOdd(9145293));

  }

  public static boolean allDigitsOdd(int x){

    boolean isAllOdd = true;

    String str = "" + x;

    for(int i=0; i<str.length(); i++){

      if( (Integer.parseInt(String.valueOf(str.charAt(i))))%2 == 0) {

        isAllOdd = false;
        break;
      }
    }

    return isAllOdd;
  }
}
