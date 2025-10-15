/**
 * TODO:
 * 1. Create a Settings class (theme, volume, language).
 * 2. Serialize the Settings object to "settings.ser".
 * 3. Change the object values in code.
 * 4. Deserialize the old version from file and display both.
 */

package serialization.exercises;

import java.io.*;
class  Setting implements  Serializable
{
    String theme ;
    String volume ;
    String language ;

    public Setting(String theme , String volume , String  language)
    {
        this.theme = theme ;
        this.volume = volume ;
        this.language = language ;
    }

    @Override
    public String toString() {
        return "Settings [theme=" + theme + ", volume=" + volume + ", language=" + language + "]";
    }
}

public class Exercise5
{
    public static void main(String[] args) throws IOException {
        // Implement here
        Setting setting = new Setting("Theme1" , "high" , "English");
        String filePath = "resources" +File.separator+ "settings.ser";
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath)))
        {
           out.writeObject(setting);
            System.out.println("Settings serialized to the file " +filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Change the object values in code.
        setting.theme = "Theme2";
        setting.volume = "low";
        setting.language = "Dutch";
        System.out.println("Updated Settings in the code " +setting);
        //deserializaton after updating the code values

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {

            Setting oldSetting = (Setting) in.readObject();
            System.out.println("\nDeserialized Settings (Old Version from File): " + oldSetting);
            System.out.println("Current Settings (Modified in Code): " + setting);


        } catch (ClassNotFoundException e) {
            System.out.println("Error during the deserialization");
            throw new RuntimeException(e);
        }

    }

}
