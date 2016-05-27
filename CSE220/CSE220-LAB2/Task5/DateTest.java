public class DateTest{
    public static void main(String[] args){

        Date date = new Date(5, 16, 2016);
        Date birthday = new Date();

        birthday.setMonth(10);
        birthday.setDay(13);
        birthday.setYear(1996);

        System.out.println("Today: " + date.displayDate());
        System.out.println("Birthday: " + birthday.displayDate());
    }
  }
