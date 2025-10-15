/**
 * TODO:
 * 1. Create a class Book (title, author, price) that implements Serializable.
 * 2. Create a Book object and serialize it to "book.ser".
 * 3. Deserialize it back and print its data.
 */

package serialization.exercises;
import java.io.*;
class  Book implements  Serializable
{
    String title;
    String author;
    int price;

    public Book(String title , String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class Exercise1
{
    public static void main(String[] args)
    {
        // Implement here
        Book book = new Book("book1" , "title1" , 100);
        String fileName = "resources" + File.separator + "book.ser";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            out.writeObject(book);
            System.out.println("Book object serialized successfully");

        } catch (FileNotFoundException e) {

            System.out.println("file not found " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ërror during the serialization" +e.getMessage());
            throw new RuntimeException(e);
        }

    }
}