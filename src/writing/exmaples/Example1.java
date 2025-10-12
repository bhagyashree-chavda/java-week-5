/**
 * Writes simple text to a file using FileWriter.
*/

package writing.exmaples;
import java.io.*;

public class Example1
{
    public static void main(String[] args)
    {
        try (FileWriter writer = new FileWriter("hello.txt"))
        {
            writer.write("Hello, Java!\n");
            writer.write("Writing to files is fun!");
            System.out.println("File created and data written successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}