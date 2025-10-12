# ⚙️ Exception Handling in File I/O

When working with files, things can go wrong — files may not exist, paths may be invalid, or permissions may be denied.
That’s why **exception handling** is essential when performing any I/O operations in Java.

This section focuses on how to safely manage file operations, handle errors gracefully, and prevent resource leaks.

---

## 🔑 Key Concepts

### **1. IOException and FileNotFoundException**

| Exception                 | Description                                                                                                             |
|---------------------------|-------------------------------------------------------------------------------------------------------------------------|
| **FileNotFoundException** | Thrown when attempting to open a file that doesn’t exist or cannot be accessed.                                         |
| **IOException**           | A more general exception for input/output errors such as reading/writing failures, permission issues, or device errors. |

---

### **2. Safe Resource Management**

* When working with files, you must **always close your streams**.
* Not closing resources can lead to:

    * **Memory leaks**
    * **Locked files**
    * **Unflushed data**

- The **best practice** is to use `try-with-resources`.

---

### **3. Try-With-Resources**

Introduced in Java 7, this structure automatically closes any resource that implements `AutoCloseable`, such as:

* `FileReader`
* `FileWriter`
* `BufferedReader`
* `BufferedWriter`
* `FileInputStream`
* `FileOutputStream`

📘 **Syntax:**

```java
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) 
{
    // Read file here
} 
catch (IOException e) 
{
    System.out.println("Error: " + e.getMessage());
}
```

No need to call `close()` manually — Java will do it automatically, even if an exception occurs.

---

### **4. Logging Meaningful Error Messages**

Good error messages help users and developers understand what went wrong.
Avoid generic “Something went wrong” messages. Instead, include details:

```java
System.out.println("Cannot open file: " + file.getName());
e.printStackTrace(); // for debugging
```

---

### **5. Chained Exceptions**

Sometimes one error causes another (for example, a `NullPointerException` while reading a missing file).
You can chain exceptions for debugging using `e.initCause()` or handle multiple with `catch` blocks.

---

## 🧠 Summary

- Always handle **IOException** and **FileNotFoundException**
- Use **try-with-resources** to prevent leaks
- Provide **useful error messages**
- Log errors for debugging and user communication
- Avoid crashing the program with unhandled exceptions

---

## 🧩 Learning Outcomes

By completing this section, students will:

- Understand how to handle **IOException** and **FileNotFoundException**
- Use **try-with-resources** to close streams automatically
- Write **clear and meaningful error messages**
- Use **finally blocks** for manual resource cleanup
- Follow **safe and professional file-handling practices**

---


