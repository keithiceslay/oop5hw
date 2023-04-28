package org.example;

import static org.example.Student.students;
import static org.example.Teacher.teachers;

public class Headmaster extends Staff{

    public Headmaster(String firstName, String lastName, Integer pay, Integer experience) {
        super.firstName = firstName;
        super.lastName = lastName;
        super.pay = pay;
        super.experience = experience;
    }

    protected void addMember(User user) {
        try {
            students.add((Student) user);
        }
        catch (Exception e) {
            teachers.add((Teacher) user);
        }
    }

    static Headmaster head = new Headmaster("Keith", "Macburry", 100000, 25);

    protected void deleteUser(User user) {
        if (user instanceof Teacher) {
            try {teachers.remove((Teacher) user);}
            catch (Exception e) {
                System.out.println("Нет такого учителя");
            }
        }
        else  if (user instanceof Student) {
            try {students.remove((Student) user);}
            catch (Exception e) {
                System.out.println("Нет такого ученика");
            }
        }
    }
}
