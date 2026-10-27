// // 1: Create a file using the File class and its createNewFile() method.

import java.io.File;  // — imports the File class.
import java.io.IOException;  // imports the exception type that may occur during file operations.
public class CreatingFileExample {
    public static void main(String[] args) throws IOException{
        File file = new File("Student.txt");   // — creates a File object representing the path
                                               // student.txt. It does not create the physical file yet.
        if(file.createNewFile()){    // — creates the file if it does not already exist.
            System.err.println("File Created Successfully.");
        } else{
            System.out.println("File Already Exists.");
    }
}
}
