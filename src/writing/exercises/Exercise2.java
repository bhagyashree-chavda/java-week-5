/**
 * TODO:
 * 1. Append a new line to "daily_log.txt" each time the program runs.
 * 2. The line should contain the current timestamp and a short message.
 */

package writing.exercises;

import java.io.*;
import java.io.*;
import java.time.*;

public class Exercise2
{
    public static void main(String[] args)
    {
        try (FileWriter writer = new FileWriter("daily_log.txt", true))
        {
            String entry = LocalDateTime.now() + " - Log entry created.\n";
            writer.write(entry);
            System.out.println("Log entry added!");
        }
        catch (IOException e)
        {
            System.out.println("Error writing to log: " + e.getMessage());
        }
    }
}
