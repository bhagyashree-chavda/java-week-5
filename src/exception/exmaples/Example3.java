/**
 * Demonstrates closing resources manually in finally (old approach).
 */

package exception.exmaples;
import java.io.*;

public class Example3
{
    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "text.txt";
        BufferedReader reader = null;

        try
        {
            reader = new BufferedReader(new FileReader(filePath));
            System.out.println(reader.readLine());
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close();
                    System.out.println("Reader closed safely.");
                }
            }
            catch (IOException e)
            {
                System.out.println("Error closing file.");
            }
        }
    }
}