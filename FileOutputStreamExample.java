import java.io.*;
public class FileOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream FOS = new FileOutputStream("Student2.txt");

        String Data = "Hello World";

        FOS.write(Data.getBytes());

        FOS.close();
        System.out.println("Data Written Successfully");
        
    }
}
