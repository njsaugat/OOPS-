package week6;

import java.io.*;
import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) throws IOException {
        File resultFile = new File("result.txt");
        PrintWriter writer = new PrintWriter(resultFile);

        Scanner scanner = new Scanner(System.in);
        boolean moreStudents = true;
        while (moreStudents) {
            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter full name: ");
            String fullName = scanner.nextLine();
            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();  // consume the remaining newline character

            writer.println("Student ID: " + studentId);
            writer.println("Full Name: " + fullName);
            writer.println("Marks: " + marks);
            writer.println();  // add a newline between students

            System.out.print("Enter more students (yes/no)? ");
            String answer = scanner.nextLine();
            moreStudents = answer.equalsIgnoreCase("yes");
        }

        writer.close();
        scanner.close();
    }
}