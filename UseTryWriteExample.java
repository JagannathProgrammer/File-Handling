import java.io.FileWriter;
import java.io.IOException;

public class UseTryWriteExample {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("Student.txt")){
            writer.write("Hello Java!");
            System.out.println("Data Written Successfully.");
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
