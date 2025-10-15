package serialization.exmaples;

import java.io.Serializable;

public class Student implements Serializable
{
    public String name;
    public String grade;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
