package week5;

 interface Shape {
    double getArea();
    double getPerimeter();
 }
 
class Circle implements Shape {
    private double radius;
 
    public Circle(double radius) {
       this.radius = radius;
    }
 
    public double getArea() {
       return Math.PI * radius * radius;
    }
 
    public double getPerimeter() {
       return 2 * Math.PI * radius;
    }
 }
 
  class Rectangle implements Shape {
    private double width;
    private double height;
 
    public Rectangle(double width, double height) {
       this.width = width;
       this.height = height;
    }
 
    public double getArea() {
       return width * height;
    }
 
    public double getPerimeter() {
       return 2 * (width + height);
    }
 }
 
 public class Main {
    public static void main(String[] args) {
       Shape[] shapes = new Shape[2];
       shapes[0] = new Circle(5);
       shapes[1] = new Rectangle(4, 6);
 
       for (Shape shape : shapes) {
          System.out.println("Area: " + shape.getArea());
          System.out.println("Perimeter: " + shape.getPerimete());
       }
    }
 }
 