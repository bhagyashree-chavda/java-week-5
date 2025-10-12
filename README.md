# Week 5: Java I/O & File Handling

This week introduces how Java interacts with files and external data sources.
Students will learn how to read, write, and manage files, and how to save and restore objects through **serialization**.

---

## Topics Covered

### **1. Introduction to Java I/O**

* Understanding **I/O Streams** in Java

    * Input (reading data) and Output (writing data)
* Difference between:

    * **Byte Streams** – `InputStream` and `OutputStream`
    * **Character Streams** – `Reader` and `Writer`
* Working with the `File` class to check paths, existence, and file properties
* Importance of closing resources and using **try-with-resources**

---

### **2. Reading Files in Java**

* Reading text data from files using:

    * `FileReader` and `BufferedReader`
* Understanding buffering for efficiency
* Handling exceptions such as `FileNotFoundException` and `IOException`
* Reading files line by line and processing text data

---

### **3. Writing Files in Java**

* Writing data using:

    * `FileWriter` and `BufferedWriter`
* Creating and appending to files
* Managing file output safely and efficiently
* Using `flush()` and `close()` properly to avoid data loss

---

### **4. Serialization & Deserialization**

* Concept of **serialization** – converting objects into a stream of bytes
* **Deserialization** – reconstructing objects from saved data
* Implementing the `Serializable` interface
* Using `ObjectOutputStream` and `ObjectInputStream`
* Saving and restoring Java objects to/from files

---

### **5. Exception Handling in File I/O**

* Handling `IOException` and `FileNotFoundException`
* Ensuring safe resource management
* Using **try-with-resources** to automatically close streams
* Logging or displaying meaningful error messages to users

---

## Activities

* Read data from a file and process it line by line
* Write text input from the console to a file
* Append new data to an existing file
* Create a simple program to save and load objects using serialization
* Build a basic file copy tool using Java I/O streams

---

## Learning Outcomes

By the end of Week 5, students will:

- Understand how **Java I/O streams** work for reading and writing data
- Be able to handle text files using **FileReader** and **FileWriter**
- Use **buffered streams** for better performance
- Implement **serialization** and **deserialization** for object persistence
- Handle **file-related exceptions** and use **try-with-resources** safely

---

