/**
 * Serializes multiple objects into one file.
 */

package serialization.exmaples;

import java.io.*;
import java.util.*;

class Employee implements Serializable
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
}

public class Example3
{
    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob", 50000),
                new Employee("Sara", 60000),
                new Employee("Tom", 55000)
        );

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.ser")))
        {
            out.writeObject(employees);
            System.out.println("Employee list serialized successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}