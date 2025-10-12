/**
 * TODO:
 * 1. Create a file named "even_numbers.txt".
 * 2. Write all even numbers between 1 and 50, each on a new line.
 * 3. Print "File created with even numbers!" when done.
 */

package writing.exercises;

import java.io.*;

public class Exercise4
{
    public static void main(String[] args)
    {
        try (FileWriter writer = new FileWriter("even_numbers.txt"))
        {
            for (int i = 2; i <= 50; i += 2)
            {
                writer.write(i + "\n");
            }

            System.out.println("File created with even numbers!");
        }
        catch (IOException e)
        {
            System.out.println("Error writing numbers: " + e.getMessage());
        }
    }
}
