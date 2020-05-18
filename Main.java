package ru.geekbrains.homework;

public class Main {

    public static void main(String[] args) {

        for (int n = 1; n<3; n++) {
            Human human = new Human();
            human.setName(n);
            human.run();
            human.jump();

            Cat cat = new Cat();
            cat.setName(n);
            cat.run();
            cat.jump();

            Robot robot = new Robot();
            robot.setName(n);
            robot.run();
            robot.jump();
        }
    }
}
