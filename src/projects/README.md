# 🧩 Week 5 Projects – Java I/O, File Handling & Serialization

This week’s projects help you apply everything you learned about **reading, writing, and managing files in Java**,
as well as **saving and restoring object data** through **serialization**.
Each project builds practical backend engineering skills essential for real-world Java development.

---

## 1. 📝 **Note Writer App**

**Concepts:** FileWriter, BufferedWriter, try-with-resources

* Create a small console app where users can type notes.
* Each note is saved to a file (`notes.txt`), with a timestamp before each entry.
* Use `BufferedWriter` for efficient writing.
* Handle exceptions gracefully (e.g., when the file can’t be written).

**Bonus:** Add a feature to read and display all saved notes.

---

## 2. 📖 **Word Counter Tool**

**Concepts:** FileReader, BufferedReader, Exception Handling

* Read a text file (`article.txt`) and count:

    * Total lines
    * Total words
    * Total characters
* Display the statistics in the console.
* Handle missing file scenarios using `FileNotFoundException`.

---

## 3. 🧾 **Log Analyzer**

**Concepts:** BufferedReader, filtering data, I/O exceptions

* Read a file called `app.log`.
* Count how many lines contain the words “ERROR”, “WARNING”, and “INFO”.
* Print a summary report:

  ```bash
  Errors: 3
  Warnings: 5
  Info: 12
  ```
* Use exception handling to handle missing or corrupt files.

---

## 4. 🛒 **Shopping List Manager**

**Concepts:** FileWriter, BufferedReader, append mode, try-with-resources

* Allow the user to:

    1. Add items to a file (`shopping.txt`)
    2. View all items
    3. Clear the list (overwrite file)
* Use `FileWriter("shopping.txt", true)` to append.
* Use `BufferedReader` to display the current list.

---

## 5. 🎵 **Playlist Saver**

**Concepts:** Object Serialization, Deserialization, ArrayList

* Create a `Song` class with `title`, `artist`, and `duration`.
* Allow the user to add multiple songs to a playlist (`ArrayList<Song>`).
* Serialize the playlist into `playlist.ser`.
* On program start, deserialize and show the last saved playlist.

---

## 6. 👩‍🎓 **Student Database (Serialization)**

**Concepts:** Serializable, ObjectOutputStream, ObjectInputStream

* Define a `Student` class with fields `name`, `id`, `grade`.
* Save all students to a file (`students.ser`) using `ObjectOutputStream`.
* Allow reloading them using `ObjectInputStream`.
* Add exception handling for corrupted files or class mismatch.

**Bonus:** Add a menu system (Add / View / Exit).

---

## 7. 🧠 **Quiz Result Saver**

**Concepts:** Writing & Reading, Exception Handling

* Create a quiz program that:

    * Asks 5 multiple-choice questions.
    * Saves results to a file (`results.txt`) like:

      ```txt
      User: Sam
      Score: 4/5
      ```
* Handle all file I/O exceptions gracefully.
* Use try-with-resources for writing the results file.

---

## 8. 🏢 **Employee Payroll System**

**Concepts:** Serialization, Deserialization, Exception Handling

* Create a class `Employee` with `name`, `position`, and `salary`.
* Store multiple employees in a `List<Employee>`.
* Serialize the list to a file (`employees.ser`).
* Deserialize it later to display all employee records.
* Handle all I/O and `ClassNotFoundException` properly.

---

## 9. 💬 **Chat Logger**

**Concepts:** FileWriter, append mode, Exception Handling

* Simulate a chat between two users.
* Each message should be written into `chat_log.txt`:

  ```txt
  [User1]: Hi!
  [User2]: Hello, how are you?
  ```
* Allow continuous message input until “exit” is typed.
* Handle I/O errors using `try-with-resources`.

**Bonus:** Add a timestamp before each message.

---

## 10. ⚙️ **Configuration Manager**

**Concepts:** Serialization, Deserialization, Exception Handling

* Create a `Settings` class with fields like `theme`, `language`, `volume`.
* On first run:

    * Create a default settings object and serialize it to `config.ser`.
* On next runs:

    * Deserialize the existing config and allow the user to modify it.
    * Save updated settings back to file.

**Bonus:** Display a message if the config file is missing and recreate it automatically.

---

