package week1;
import java.util.*;
public class Circle {
    public static void main(String[] args){
           Scanner sc= new Scanner(System.in);  
    System.out.print("Enter the radius of the circle  ");  
  int radius= sc.nextInt();  

   double perimeter=2*(Math.PI)*(radius);
    System.out.println("The perimeter of the circle is "+perimeter);

      double area=(Math.PI)*(radius*radius);
      System.out.println("The area of the circle is "+area);

      sc.close();
    }
}
