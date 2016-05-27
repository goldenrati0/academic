public class Date{

    private int month, day, year;

    Date(int month, int day, int year){

        this.month = month;
        this.day = day;
        this.year = year;
    }

    Date(){
    }

    public void setMonth(int month){

        this.month = month;
    }

    public int getMontht(){

        return month;
    }

    public void setDay(int day){

        this.day = day;
    }

    public int getDay(){

        return day;
    }

    public void setYear(int year){

        this.year = year;
    }

    public int getYear(){

        return year;
    }

    public String displayDate(){

        String date = month + "/" + day + "/" + year;

        return date;
    }
}
