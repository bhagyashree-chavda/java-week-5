/**
 * TODO:
 * 1. Ask the user to enter 3 messages.
 * 2. Write them to "messages.txt", each on a new line.
 * 3. Print "Messages saved!" when done.
 */

package writing.exercises;
import java.io.*;
import java.util.*;

public class Exercise1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("messages.txt"))
        {
            for (int i = 1; i <= 3; i++)
            {
                System.out.print("Enter message " + i + ": ");
                String message = scanner.nextLine();
                writer.write(message + "\n");
            }

            System.out.println("Messages saved!");
        }
        catch (IOException e)
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}