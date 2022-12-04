package week4;

public class Holiday {
    private String name;
    private int day;
    private String month;
    Holiday(String name, int day, String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public boolean isSameMonth(Holiday day1,Holiday day2){
        if(day1.month.toLowerCase()==day2.month.toLowerCase()){
            return true;
        }return false;
    }

    public double avgDate(Holiday[] days){
        double average=0;
        double sum=0;
        for(int i=0;i<days.length;i++){
            sum+=days[i].day;
        }
        average=sum/days.length;
        return average;
    }

    public static void main(String[] args){
        Holiday day1=new Holiday("Independence Day",4,"July");
    }

}
