/**
 * TODO:
 * 1. Use the File class to create a new file called "data.txt".
 * 2. Check if the file was created successfully.
 * 3. Print the absolute path.
 */

package introduction.exmaples;

import java.io.*;

public class Example2
{
    public static void main(String[] args)
    {
        File file = new File("data.txt");

        try
        {
            if (file.createNewFile())
            {
                System.out.println("File created: " + file.getAbsolutePath());
            }
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}