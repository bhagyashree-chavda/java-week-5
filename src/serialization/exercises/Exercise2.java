/**
 * TODO:
 * 1. Create a Student class (name, grade) that implements Serializable.
 * 2. Create a list of students and serialize it to "students.ser".
 * 3. Deserialize it and print all names and grades.
 */

package serialization.exercises;
//import serialization.exmaples.Student;

import java.io.*;
import java.util.*;

import java.io.Serializable;

class Student1 implements Serializable
{
    String  name;
    String grade;

    public  Student1(String name , String grade)
    {
        this.name = name;
        this.grade = grade;
    }
}



public class Exercise2
{
    public static void main(String[] args) throws FileNotFoundException {
        // Implement here
        List<Student1> students = Arrays.asList(
                new Student1("Shree" ,"A" ),
                new Student1("jigi" , "B")
        );
        String filePath = "resources" +File.separator + "students.ser";
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(students);

        } catch (IOException e) {
            System.out.println("error during serialization" + e.getMessage()) ;
            throw new RuntimeException(e);
        }
         // deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))){
            List<Student1> restoredList = (List<Student1>) in.readObject();
            System.out.println("Deserialized Account:");
            for (Student1 s : restoredList) {  // ✅ FIXED
                System.out.println("Name: " + s.name + ", Grade: " + s.grade);
            }
        }
        catch (IOException e)
        {
            System.out.println("error during deserialization " + e.getMessage());
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("class is not found " +e.getMessage());
            throw new RuntimeException(e);
        }

    }
}