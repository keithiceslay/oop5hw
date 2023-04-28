package org.example;

import java.util.List;

import static org.example.Student.students;

public class StudentView implements View{
    protected static void printStudent(Student student) {
        System.out.println(student.toString());
    }

    protected static void printStudentsList() {
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
