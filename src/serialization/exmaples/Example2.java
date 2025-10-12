/**
 * Reads a serialized Student object from a file.
*/

package serialization.exmaples;
import java.io.*;

public class Example2
{
    public static void main(String[] args)
    {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser")))
        {
            Student s = (Student) in.readObject();
            System.out.println("Deserialized Student:");
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}