// // 1: Create a file using the File class and its createNewFile() method.

import java.io.*;  // — imports the File class.

public class FileCreatingExample {
    public static void main(String[] args) throws Exception{
        File file = new File("Student.txt");   // — creates a File object representing the path
                                               // student.txt. It does not create the physical file yet.
        file.createNewFile();{    // — creates the file if it does not already exist.
            System.err.println("File Created Successfully.");
        }
}
}                                       
