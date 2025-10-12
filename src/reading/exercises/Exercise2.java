/**
 * TODO:
 * 1. Read a file named "paragraph.txt".
 * 2. Count how many words are in the file.
 * 3. Print the total word count.
 * (Hint: use line.split(" ") to split by spaces)
 */

package reading.exercises;
import java.io.*;

public class Exercise2
{
    public static void main(String[] args)
    {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("paragraph.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                wordCount += line.split("\\s+").length;
            }
            System.out.println("Total words: " + wordCount);
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
