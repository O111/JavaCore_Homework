package ru.geekbrains.homework;

public class Competitor {

    protected String name;
    protected int canRun;
    protected float canJump;

    public String getName() {
        return name;
    }

    public int getRun() {
        return canRun;
    }

    public float getJump() {
        return canJump;
    }

    protected void run(boolean bool) {
        if (bool) {
            System.out.printf("%s пробежал.\n", this.getName());
        } else {
            System.out.printf("%s не пробежал.\n", this.getName());
        }
    }

    protected void jump(boolean bool) {
        if (bool) {
            System.out.printf("%s перепрыгнул.\n", this.getName());
        } else {
            System.out.printf("%s не перепрыгнул.\n", this.getName());
        }
    }
}
