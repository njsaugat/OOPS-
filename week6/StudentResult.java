package week6;

import java.io.*;

public class StudentResult {
    public static void main(String[] args) throws IOException {
        String studentId = "12345";
        String fullName = "John Doe";
        double marks = 89.5;

        File resultFile = new File("result.txt");
        PrintWriter writer = new PrintWriter(resultFile);

        writer.println("Student ID: " + studentId);
        writer.println("Full Name: " + fullName);
        writer.println("Marks: " + marks);

        writer.close();
    }
}