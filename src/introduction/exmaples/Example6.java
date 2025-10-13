/**
 * TODO:
 * 1. Write a program that reads a file and creates a copy of it.
 * 2. Use FileInputStream and FileOutputStream (byte streams).
 * 3. Print a message once the copy is complete.
 */

package introduction.exmaples;

import java.io.*;

public class Example6
{
    public static void main(String[] args)
    {
        String dir = "resources" + File.separator;
        try (FileInputStream input = new FileInputStream(dir + "cat.jpg");
             FileOutputStream output = new FileOutputStream(dir + "copy.jpg"))
        {
            int byteData;
            while ((byteData = input.read()) != -1)
            {
                output.write(byteData);
            }
            System.out.println("File copied successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}