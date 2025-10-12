/**
 * Demonstrates appending new data to an existing file.
 */

package writing.exmaples;
import java.io.*;

public class Example3
{
    public static void main(String[] args)
    {
        try (FileWriter writer = new FileWriter("log.txt", true))
        {
            writer.write("New log entry: Application started.\n");
            System.out.println("Data appended successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error appending data: " + e.getMessage());
        }
    }
}
