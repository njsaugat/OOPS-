package week3;
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
public class DateTest {
    public static void main(String[] args){
        
    }
}
