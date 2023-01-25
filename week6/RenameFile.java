package week6;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        // current file path
        File oldFile = new File("ab.txt");
        // new file path
        File newFile = new File("xyz.txt");
 
        // rename file
        boolean success = oldFile.renameTo(newFile);

        if (success) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("File rename failed");
        }
    }
}
