/**
 * Serializes a simple object to a file.
 */

package serialization.exmaples;

import java.io.*;

public class Example1
{
    public static void main(String[] args)
    {
        Student s = new Student("Alice", 22);

        String filename = "resources" + File.separator + "student.ser";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            out.writeObject(s);
            System.out.println("Student object serialized successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }
}