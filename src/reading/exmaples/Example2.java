/**
 * Reads lines from "message.txt" using BufferedReader for efficiency.
 */

package reading.exmaples;
import java.io.*;

public class Example2
{
    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("message.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
