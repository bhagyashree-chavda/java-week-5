/**
 * Demonstrates automatic resource management using try-with-resources.
 */

package exception.exmaples;
import java.io.*;

public class Example4
{
    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }
}
