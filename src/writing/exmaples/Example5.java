/**
 * Demonstrates flushing a stream manually before closing.
 */
package writing.exmaples;
import java.io.*;

public class Example5
{
    public static void main(String[] args)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("flush_example.txt")))
        {
            writer.write("This text is written and flushed.");
            writer.flush(); // ensure it's written even before closing
            System.out.println("File flushed and closed successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
