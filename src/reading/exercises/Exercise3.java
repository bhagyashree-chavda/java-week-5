/**
 * TODO:
 * 1. Read "log.txt" line by line.
 * 2. Print all lines containing the keyword "ERROR".
 * 3. Count and print how many error lines were found.
 */

package reading.exercises;
import java.io.*;

public class Exercise3
{
    public static void main(String[] args)
    {
        int errorCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("log.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                if (line.contains("ERROR"))
                {
                    System.out.println(line);
                    errorCount++;
                }
            }

            System.out.println("Total ERROR lines: " + errorCount);
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}