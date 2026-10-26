
import java.io.FileWriter;
import java.io.IOException;
public class WriteFileExample {
    public static void main(String[] args) throws IOException {
        FileWriter Writer = new FileWriter("Student.txt");

        Writer.write("Name: Jagannath");
        Writer.write("\n");
        Writer.write("Age: 23");
        Writer.write("\n");
        Writer.write("State: West BEngal");
        Writer.write("\n");

        Writer.close();

        System.out.println("Data Written Successfully.");
    }
    
}
