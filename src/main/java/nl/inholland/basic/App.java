package nl.inholland.basic;

import nl.inholland.basic.model.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student student = new Student("Emma");
        System.out.println("Name: " + student.name + ", age: " + student.age);
    }

    public static int calculate(int a, int b) {
        return a - b;
    }


}
