package week1;
import java.util.*;
public class Series {
    public static double calculateLogExpanded(double x){
        double lnx=0;
        double num=(x-1)/(x+1);
        for(int i=1;i<=1000;i++){  
          lnx+=(Math.pow(num, 2*i-1))/(2*i-1);
        }
        return 2*lnx;
      }
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);  
      System.out.print("Enter the number ");
      double x= sc.nextDouble();


      System.out.print("Enter the base  ");
      double a= sc.nextDouble();

      double lnx=calculateLogExpanded(x);
      double lna=calculateLogExpanded(a);
      double logax=lnx/lna;
      System.out.println(logax);
      sc.close();
    }
}
