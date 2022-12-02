package week3;

public class DateTest {
    public static void main(String[] args){
        Date d1=new Date(7,11,2018);
        System.out.println(d1.toString());
        System.out.println(d1.getMonth());
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getDate());

    }
}
class Date{
    private int month;
    private int day;
    private int year;

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Date(int month, int day, int year){
        this.month=month;
        this.day=day;
        this.year=year;
    }
    public String getDate(){
        return this.month+"/"+this.day+"/"+this.year;
    }
}

