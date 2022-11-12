package week1;

public class Swap { 
    public static void main(String[] args) {

        int num1=40;
        int num2=20;
        
        //approach 1st
        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("The swapped numbers after 1st approach are  : "+num1+"  ,  "+num2);

        //approach 2nd
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("The swapped numbers after 2nd approach are  : "+num1+"  ,  "+num2);
  }
}
