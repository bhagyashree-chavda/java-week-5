/**
 * Reads a file and prints only lines that contain the word "Java".
*/

package reading.exmaples;
import java.io.*;

public class Example4
{
    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("articles.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                if (line.contains("Java"))
                {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
