/**
 * Reads all characters from a file called "example.txt" one by one.
 * Demonstrates simple use of FileReader.
 */

package reading.exmaples;
import java.io.*;

public class Example1
{
    public static void main(String[] args)
    {
        try (FileReader reader = new FileReader("example.txt"))
        {
            int character;
            while ((character = reader.read()) != -1)
            {
                System.out.print((char) character);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}