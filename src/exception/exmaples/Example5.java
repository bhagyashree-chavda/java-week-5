/**
 * Demonstrates meaningful error messages and logging stack trace.
 */

package exception.exmaples;

import java.io.*;

public class Example5
{
    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "data.txt";
        File file = new File(filePath);

        try (FileReader reader = new FileReader(file))
        {
            System.out.println("File opened successfully!");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Cannot open file: " + file.getAbsolutePath());
            e.printStackTrace(); // useful for debugging
        }
        catch (IOException e)
        {
            System.out.println("I/O Error occurred: " + e.getMessage());
        }
    }
}
