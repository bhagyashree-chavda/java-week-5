/**
 * Demonstrates the use of 'transient' to skip serialization of sensitive fields.
 */

package serialization.exmaples;
import java.io.*;

class Account implements Serializable
{
    String username;
    transient String password; // not serialized

    Account(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}

public class Example5
{
    public static void main(String[] args)
    {
        Account acc = new Account("user1", "mySecretPassword");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("account.ser")))
        {
            out.writeObject(acc);
            System.out.println("Account serialized!");
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("account.ser")))
        {
            Account restored = (Account) in.readObject();
            System.out.println("Deserialized Account:");
            System.out.println("Username: " + restored.username);
            System.out.println("Password: " + restored.password); // will be null
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}