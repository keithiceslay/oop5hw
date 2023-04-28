package org.example;

public class Main {
    public static void main(String[] args) {
        Controller cont = new Controller();
        cont.start();
        Student user1 = new Student("Sergey", "Sergeyin", 3.0, 7);
        cont.printLists();
        cont.addMember(user1, user1);
        cont.printUser(user1);
    }
}
