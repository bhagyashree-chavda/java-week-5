/**
 * Demonstrates catching FileNotFoundException specifically.
 */

package exception.exmaples;

import java.io.*;

public class Example1
{
    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "missing.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            System.out.println(reader.readLine());
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found. Please check the filename.");
        }
        catch (IOException e)
        {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}