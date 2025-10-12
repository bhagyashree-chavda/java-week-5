/**
 * Demonstrates IOException during writing.
 */

package exception.exmaples;

import java.io.*;

public class Example2
{
    public static void main(String[] args)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")))
        {
            writer.write("Learning exception handling in Java I/O!");
            System.out.println("File written successfully.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}