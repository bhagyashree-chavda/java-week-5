

/**
 * TODO:
 * 1. Create a Company class that holds a list of Employees.
 * 2. Each Employee has a name and position.
 * 3. Serialize the Company object into "company.ser".
 * 4. Deserialize and display all employee details.
 */

package serialization.exercises;

import java.io.*;
import java.util.Arrays;
import java.util.List;

class  Employee implements  Serializable
{
    String name ;
    String position ;

    public Employee(String name , String position)
    {
        this.name = name;
        this.position = position ;
    }
}

class  Company implements  Serializable
{
    String comanyName;
    List<Employee> employees;

    public Company(String comanyName , List<Employee> employees)
    {
        this.comanyName = comanyName ;
        this.employees = employees ;
    }
}
public class Exercise4
{
    public static void main(String[] args)
    {
        // Implement here
        List<Employee> employeeList = Arrays.asList(
                new Employee( "Shree " ,"Java developer"),
                new Employee("Jigi " , "QA test Engineer "),
                new Employee("Harsh " , " Team Lead"));


        Company company = new Company("Shree sol" , employeeList);

        String filePath = "resources" +File.separator+ "company.ser";

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {

            out.writeObject(company);
            System.out.println("Company object serialized uccessfully to" +filePath);


        } catch (IOException e) {
            System.out.println("Error During Serialization" +e.getMessage());
            throw new RuntimeException(e);
        }

        // deserialization
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Company restoredCompany = (Company) in.readObject();
            System.out.println("Company Name: " + restoredCompany.comanyName);
            System.out.println("Employees:");
            for(Employee emp : restoredCompany.employees)
            {
                System.out.println(" Name " +emp.name + " , Position" + emp.position);
            }


        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occured during the deserialization");
            throw new RuntimeException(e);
        }


    }
}