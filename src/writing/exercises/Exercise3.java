/**
 * TODO:
 * 1. Ask the user for 5 grocery items.
 * 2. Write them to "shopping_list.txt", each item on a new line.
 * 3. After saving, print "Shopping list saved successfully!".
 */

package writing.exercises;

import java.io.*;
import java.util.*;

public class Exercise3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("shopping_list.txt")))
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.print("Enter item " + i + ": ");
                String item = input.nextLine();
                writer.write(item);
                writer.newLine();
            }

            System.out.println("Shopping list saved successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error saving shopping list: " + e.getMessage());
        }
    }
}
