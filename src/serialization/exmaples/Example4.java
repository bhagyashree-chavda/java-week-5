/**
 * Reads a list of Employee objects from a file.
*/

package serialization.exmaples;
import java.io.*;
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "employees.ser";
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath)))
        {
            List<Employee> list = (List<Employee>) in.readObject();

            System.out.println("Deserialized Employee List:");
            for (Employee e : list)
            {
                System.out.println(e.name + " earns $" + e.salary);
            }
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
