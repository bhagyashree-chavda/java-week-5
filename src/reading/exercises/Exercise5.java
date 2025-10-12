/**
 * TODO:
 * 1. Read "quotes.txt" line by line.
 * 2. Find and print the longest line in the file.
 * 3. Print its length as well.
 */

package reading.exercises;
import java.io.*;

public class Exercise5
{
    public static void main(String[] args)
    {
        String longest = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("quotes.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                if (line.length() > longest.length())
                {
                    longest = line;
                }
            }

            System.out.println("Longest line: " + longest);
            System.out.println("Length: " + longest.length());
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
