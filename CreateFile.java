import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        String filePath = "myFile.txt"; // Path to the file you want to create
        String content = "This is the text to be written in the file.";

        try {
            // Create a File object
            File file = new File(filePath);

            // Create a FileWriter object
            FileWriter writer = new FileWriter(file);

            // Write the content to the file
            writer.write(content);

            // Close the FileWriter
            writer.close();

            System.out.println("File created and content written successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred while creating or writing to the file: " + e.getMessage());
        }
    }
}