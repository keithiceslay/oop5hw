package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    Double grades;
    Integer grade;

    public Student(String firstName, String lastName, Double grades, Integer grade) {
        super.firstName = firstName;
        super.lastName = lastName;
        this.grades = grades;
        this.grade = grade;
    }

    protected static List<Student> students = new ArrayList<Student>();

    protected static void createListStudents() {
        students.add(new Student("Danya", "Zelepukin", 3.4, 10));
        students.add(new Student("Augustina", "Omorivna", 3.7, 8));
        students.add(new Student("Natalia", "Dushko", 4.9, 11));
        students.add(new Student("Konstantin", "Cherpushevsky", 5.0, 10));
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.grades + " " + this.grade;
    }

    protected Student findStudent(Object parameter) {
        if (parameter instanceof Number) {
            if (parameter instanceof Double)
                return findGrades((Double) parameter);
            if (parameter instanceof Integer)
                return findGrade((Integer) parameter);
        }
        if (parameter instanceof String)
            return findNameStudent((String) parameter);
        return null;
    }

    private Student findNameStudent(String parameter) {
        for (Student student: students){
            if (student.firstName.equals(parameter))
                return student;
            else if (student.lastName.equals(parameter))
                return student;
        }
        return null;
    }

    private Student findGrade(Integer parameter) {
        for (Student student: students)
            if (student.grade.equals(parameter))
                return student;
        return null;
    }

    private Student findGrades(Double parameter) {
        for (Student student: students)
            if (student.grades.equals(parameter))
                return student;
        return null;
    }
}
