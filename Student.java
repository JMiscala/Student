import java.util.*;

public class Student {
    private String name;
    private int age;

    public Student() {
        name = "No Name yet.";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name + " " + student.age);

        Student student2 = new Student("John Lerry R. Miscala", 20);
        System.out.println("I am " + student2.name + ". I am " + student2.age + " years old");
    }
}