/**
 * Serializes a simple object to a file.
 */

package serialization.exmaples;

import java.io.*;

class Student implements Serializable
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class Example1
{
    public static void main(String[] args)
    {
        Student s = new Student("Alice", 22);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser")))
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