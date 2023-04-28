package org.example;

import java.util.ArrayList;
import java.util.List;

public  class Teacher extends Staff{
    String subject;

    public Teacher(String firstName, String lastName, String subject, Integer pay, Integer experience) {
        super.firstName = firstName;
        super.lastName = lastName;
        this.subject = subject;
        super.pay = pay;
        super.experience = experience;
    }

    protected static List<Teacher> teachers = new ArrayList<Teacher>();

    protected static void createListTeachs() {
        teachers.add(new Teacher("Elena", "Yurievna", "Chemistry", 45000, 10));
        teachers.add(new Teacher("Ivan", "Mudryenov", "History", 20000, 1));
        teachers.add(new Teacher("Andrew", "Moskow", "Mathematics", 30000, 5));
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.subject;
    }

    protected Teacher findTeacher(Object parameter) {
        if (parameter instanceof Number)
            if (parameter instanceof Integer)
                return findTeacherInt((Integer) parameter);
        else if (parameter instanceof String)
            return findTeacherString((String) parameter);
        return null;
    }

    private Teacher findTeacherString(String parameter) {
        for (Teacher teacher: teachers){
            if (teacher.firstName.equals(parameter))
                return teacher;
            else if (teacher.lastName.equals(parameter))
                return teacher;
            else if (teacher.subject.equals(parameter))
                return teacher;
        }
        return null;
    }

    private Teacher findTeacherInt(Integer parameter) {
        for (Teacher teacher: teachers){
            if (teacher.pay.equals(parameter))
                return teacher;
            else if (teacher.experience.equals(parameter))
                return teacher;
        }
        return null;
    }
}
