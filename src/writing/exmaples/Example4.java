/**
 * Writes a list of names into a file, one per line.
*/

package writing.exmaples;
import java.io.*;
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "names.txt";
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
        {
            for (String name : names)
            {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Names written successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}