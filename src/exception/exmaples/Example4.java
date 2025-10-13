/**
 * Demonstrates automatic resource management using try-with-resources.
 */

package exception.exmaples;
import java.io.*;

public class Example4
{
    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
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
