/**
 * TODO:
 * 1. Read all lines from "data.txt" into a List<String>.
 * 2. Print the lines in reverse order.
 */

package reading.exercises;
import java.io.*;
import java.util.*;

public class Exercise4
{
    public static void main(String[] args)
    {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                lines.add(line);
            }

            Collections.reverse(lines);

            for (String l : lines)
            {
                System.out.println(l);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}