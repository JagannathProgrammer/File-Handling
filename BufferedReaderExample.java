import java.io.*;
public class BufferedReaderExample {
    public static void main(String[] args) throws Exception{
        FileReader Read = new FileReader("Student1.txt");
        BufferedReader BR = new BufferedReader(Read);

        int Data = BR.read();
        while (Data!=-1) {
            System.out.print((char)Data);
            Data= BR.read();
        }
        BR.close();
    }
}
