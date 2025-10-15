/**
 * TODO:
 * 1. Create a User class (username, password).
 * 2. Mark password as transient.
 * 3. Serialize and deserialize a User object.
 * 4. Show that the password field is null after deserialization.
 */

package serialization.exercises;
import java.io.*;

class User implements Serializable
{
    String username ;
     transient String password;

    public  User(String username , String password)
    {
        this.username = username ;
        this.password = password;
    }
}

public class Exercise3
{
    public static void main(String[] args)
    {
        // Implement here
        String filePath = "resources" +File.separator + "user.ser";
        User user = new User("Bhagyashree " , "password");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))){

            out.writeObject(user);
            System.out.println("User list serialized successfully");

        } catch (IOException e) {
            System.out.println("error during serialization" +e.getMessage());
            throw new RuntimeException(e);
        }

        //deserialization
    }
}
