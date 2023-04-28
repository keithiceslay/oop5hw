package org.example;

public abstract class Staff extends User{
    Integer pay;
    Integer experience;

    @Override
    public String toString() {
        return super.toString() + " " + this.pay + " " + this.experience;
    }
}
