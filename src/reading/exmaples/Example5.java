/**
 * Reads all lines from "students.txt" into a List<String>.
*/

package reading.exmaples;
import java.io.*;
import java.util.*;

public class Example5
{
    public static void main(String[] args)
    {
        List<String> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                students.add(line);
            }

            System.out.println("Students:");
            students.forEach(System.out::println);
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
