/**
 * Demonstrates writing multiple lines using BufferedWriter.
 */

package writing.exmaples;
import java.io.*;

public class Example2
{
    public static void main(String[] args)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("lines.txt")))
        {
            writer.write("First line of text");
            writer.newLine();
            writer.write("Second line of text");
            writer.newLine();
            writer.write("Third line of text");
            System.out.println("All lines written successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}