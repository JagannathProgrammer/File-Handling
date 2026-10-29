import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args) throws Exception{
        FileInputStream FIS = new FileInputStream("Student2.txt");

        int Data = FIS.read();
        while (Data !=-1) {
            System.out.print((char)Data);
            Data=FIS.read();
        }
        FIS.close();
    }
}
