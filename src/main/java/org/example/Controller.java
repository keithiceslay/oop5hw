package org.example;

import static org.example.Headmaster.head;
import static org.example.Student.createListStudents;
import static org.example.StudentView.printStudentsList;
import static org.example.Teacher.createListTeachs;
import static org.example.TeacherView.printTeachersList;

public class Controller {
    public User checkAccess(User user){
        if (user instanceof Student) {
            return (Student) user;
        }
        else if (user instanceof Staff) {
            if (user instanceof Teacher){
                return (Teacher) user;
            }
            if (user instanceof Headmaster)
                return (Headmaster) user;
        }
        return user;
    }

    public void addMember(User user, User userToAdd) {
        user = checkAccess(user);
        if (user instanceof Headmaster)
            head.addMember(userToAdd);
        else
            System.out.println("У Вас нет доступа к этой команде");
    }

    public void printUser(User user) {
        user = checkAccess(user);
        if (user instanceof Student)
            System.out.println(((Student) user).toString());
        else if (user instanceof Teacher)
            System.out.println(((Teacher) user).toString());
        else if (user instanceof Headmaster)
            System.out.println(((Headmaster) user).toString());
    }

    public void deleteUser(User user, User delUs){
        user = checkAccess(user);
        if (user instanceof Headmaster)
            head.deleteUser(delUs);
    }

    public void printLists() {
        System.out.println("Ученики: ");
        printStudentsList();
        System.out.println("\nУчителя: ");
        printTeachersList();
        System.out.println();
    }

    public void start() {
        createListStudents();
        createListTeachs();
    }
}
