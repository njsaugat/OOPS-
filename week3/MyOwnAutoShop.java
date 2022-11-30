package week3;

public class MyOwnAutoShop{
    public static void main(String[] args){
        Sedan s1=new Sedan(45, 42000, "grey", 20);
        Ford f1=new Ford(50,45000,"red",2019,500);
        Ford f2=new Ford(30,30000,"black",2017,200);
    } 
}


 class Car {
    private int speed;
    protected double regularPrice;//only its subclass/derived  can use regularPrice after using protected
    private String color;
    public double getSalePrice(){
        return regularPrice*0.95;
    }
    Car(int speed, double regularPrice, String color){
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }
}
class Ford extends Car{
    // private int speed;
    // private double regularPrice;
    // private String color;
    private int year;
    private int manufacturerDicount;
    Ford(int speed,double  regularPrice,String color, int year, int manufacturerDicount ){
        super(speed, regularPrice, color);
        this.year=year;
        this.manufacturerDicount=manufacturerDicount;
    }
    public double getSalePrice(){
        return super.regularPrice-this.manufacturerDicount;
    }
}

class Sedan extends Car{
    private int length;
    Sedan(int speed, double regularPrice, String color,int length){
        super(speed, regularPrice, color);
        this.length=length;
        
    }
}
