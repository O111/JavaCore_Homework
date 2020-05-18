package ru.geekbrains.homework;

public class Main {

    public static void main(String[] args) {

        Track track = new Track();
        Wall wall = new Wall();

        for (int n = 1; n<3; n++) {
            Human human = new Human();
            human.setName(n);
            human.run(track.isSuccess(human));
            human.jump(wall.isSuccess(human));

            Cat cat = new Cat();
            cat.setName(n);
            cat.run(track.isSuccess(cat));
            cat.jump(wall.isSuccess(cat));

            Robot robot = new Robot();
            robot.setName(n);
            robot.run(track.isSuccess(robot));
            robot.jump(wall.isSuccess(robot));
        }
    }
}
