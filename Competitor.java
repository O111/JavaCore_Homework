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

    protected void run(Task[] tasks) {
        for (int j=0; j < tasks.length; j++) {
            if (!tasks[j].isSuccess(this)) {
                System.out.printf("%s выбыл из соревнования на %d препятствии.\n", this.getName(),j+1);
                return;
            }
        }
        System.out.printf("%s финишировал. Ура!!!\n", this.getName());
    }
}
