package week3;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;

    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public double findArea(){
        return length*breadth;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the length of rectangle ");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth of rectangle ");
        double breadth=sc.nextDouble();
        Rectangle r1=new Rectangle(length, breadth);
        System.out.println(r1.findArea());


        // Rectangle r1=new Rectangle(4, 5);
        // Rectangle r2=new Rectangle(5, 8);
        // System.out.println(r1.perimeter());
        // System.out.println(r1.findArea());
        // System.out.println(r2.perimeter());
        // System.out.println(r2.findArea());

    }
}
