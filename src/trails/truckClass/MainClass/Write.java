package trails.truckClass.MainClass;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Write {

    public static void main(String[] args) {
        String fileName = "example.txt";

        // Writing to a file
        try {
            File file = new File(fileName);

            // Create the file if it does not exist
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + fileName);
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a test file.\n");
            writer.write("This is the second line.\n");
            writer.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;

            System.out.println("Reading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
