import java.io.*;
public class BufferedWriterExample {
    public static void main(String[] args) throws Exception{
        FileWriter Writer = new FileWriter("Student1.txt");
        BufferedWriter BD = new BufferedWriter(Writer);

        BD.write("Program: Hello Java World");

        BD.close();

        System.out.println("Data Write Successfully.");
    }
}
