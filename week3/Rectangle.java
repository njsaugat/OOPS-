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
        System.out.println("The area is "+ r1.findArea());

       
    }
}
