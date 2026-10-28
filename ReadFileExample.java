

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("Student.txt");
        // Opens the file for reading.

        BufferedReader reader = new BufferedReader(file);
        // Helps us read the file line by line.

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
        // Closes the reader.

    }
}