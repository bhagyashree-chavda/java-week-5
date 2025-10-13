/**
 * TODO:
 * 1. Create a FileReader for a file called "message.txt".
 * 2. Read and print all characters one by one.
 * 3. Use try-with-resources to close automatically.
 */

package introduction.exmaples;

import java.io.*;

public class Example4
{
    public static void main(String[] args)
    {
        String path = "resources" + File.separator + "message.txt";
        try (FileReader reader = new FileReader(path))
        {
            int ch;
            while ((ch = reader.read()) != -1)
            {
                System.out.println((char) ch); // convert int to char
            }
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}