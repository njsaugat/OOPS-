package week3;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);  
        System.out.println("Enter the word");
        String word=sc.next();
        System.out.print(word.toUpperCase());
        System.out.print(word.toLowerCase());
        sc.close();

    }    
}
