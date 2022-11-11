package week1;

import java.util.*;
public class Multiplication {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);  
    System.out.print("Enter number to print the multiplication table ");  
  int number= sc.nextInt();  

    for(int i=1;i<=10;i++){
      System.out.println(i+" * "+number +" = "+i*number);
    }
    sc.close();
    }
}
