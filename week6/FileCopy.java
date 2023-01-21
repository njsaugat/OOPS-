package week6;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        File A = new File("fileA.txt");
        File B = new File("fileB.txt");

        InputStream in = new FileInputStream(A);
        OutputStream out = new FileOutputStream(B);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }

        in.close();
        out.close();
    }
}