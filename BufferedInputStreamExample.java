import java.io.*;
public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception{
        FileInputStream File = new FileInputStream("Student3.txt");
        BufferedInputStream BIS = new BufferedInputStream(File);

        int Data = BIS.read();
        while (Data !=-1) {
            System.out.print((char)Data);
            Data = BIS.read();
        }
        BIS.close();
    }
}
