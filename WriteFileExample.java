
import java.io.FileWriter;
import java.io.IOException;
public class WriteFileExample {
    public static void main(String[] args) throws IOException {
        FileWriter Writer = new FileWriter("Student.txt");  // opens the file for writing and creates it if necessary.

        Writer.write("Name: Jagannath");  // writer.write() writes the supplied characters.
        Writer.write("\n");   // \n adds a line break on common platforms.
        Writer.write("Age: 23");
        Writer.write("\n");
        Writer.write("State: West BEngal");
        Writer.write("\n");

        Writer.close();    // writer.close() closes the writer and ensures buffered data is flushed.

        System.out.println("Data Written Successfully.");
    }
    
}
