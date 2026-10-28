

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) throws Exception {

        FileReader Read = new FileReader("Student.txt");
        // Opens the file for reading.
        int Data = Read.read();

        while (Data !=-1) {
            System.out.print((char)Data);
            Data=Read.read();
        }

        Read.close();
        // Closes the reader.

    }
}