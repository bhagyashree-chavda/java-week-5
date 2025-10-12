/**
 * TODO:
 * 1. Read all lines from "input.txt".
 * 2. Write them into "copy_output.txt" using BufferedWriter.
 * 3. Add a header line: "Copied File Content:" at the top.
 */

package writing.exercises;

import java.io.*;

public class Exercise5
{
    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("copy_output.txt")))
        {
            writer.write("Copied File Content:");
            writer.newLine();

            String line;
            while ((line = reader.readLine()) != null)
            {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
