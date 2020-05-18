package ru.geekbrains.homework;

public class Human implements Move {

    private String name;

    protected void setName(int n) {
        this.name = "Человек_" + n;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        System.out.printf("%s пробежал.\n", this.getName());
    }

    @Override
    public void jump() {
        System.out.printf("%s прыгнул.\n", this.getName());
    }
}
