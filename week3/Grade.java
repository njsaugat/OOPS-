package week3;

import java.util.Scanner;

public class Grade {
    public static double average(int grades[]){
        double sum=0;
        for(int i=0;i<grades.length;i++){
            sum+=grades[i];
        }
        double average=sum/grades.length;
        return average;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] grades=new int[20];
        for(int i=0;i<20;i++){
            System.out.println("Enter the grade");
            // String word=sc.next();
            grades[i]=sc.nextInt();
        }  
        System.out.println(average(grades));
        

        sc.close();

    }    
}
