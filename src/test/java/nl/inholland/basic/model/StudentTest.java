package nl.inholland.basic.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void constructorWithOnlyNameShouldHaveAge20() {
        Student student = new Student("Student");
        Assertions.assertEquals(20, student.age);
    }
}