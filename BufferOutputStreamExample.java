import java.io.*;
public class BufferOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream FOS = new FileOutputStream("Student3.txt");
        BufferedOutputStream BOS = new BufferedOutputStream(FOS);
        
        String Data = "Java Full Satck Development";

        BOS.write(Data.getBytes());

        BOS.close();
        System.out.println("Data Write Successfully.");
    }
}
