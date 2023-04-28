package org.example;

import java.util.List;

import static org.example.Teacher.teachers;

public class TeacherView implements View{
    protected static void printTeachersList() {
        for (Teacher teacher: teachers) {
            System.out.println(teacher.toString());
        }
    }

    protected static void printTeacher(Teacher teacher) {
        System.out.println(teacher.toString());
    }
}
