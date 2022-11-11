package week1;
import java.util.*;
import java.lang.Math;
public class Square {
    public static void main(String[] args){  
        Scanner sc= new Scanner(System.in);
       System.out.print("Enter number to print the next perfect square ");  
       int number= sc.nextInt(); 
   
       boolean perfectSqaureFound=false;
       int nextNum=number+1;
       double squareRoot;
       while(!perfectSqaureFound){
            
            squareRoot=Math.sqrt(nextNum);
            int checkNum=(int)squareRoot;

            if(checkNum==squareRoot){
                perfectSqaureFound=true;
                System.out.println("The next square is "+nextNum);
            }
            nextNum++;
       }
       sc.close();
    }
}
