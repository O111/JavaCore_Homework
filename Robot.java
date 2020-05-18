package ru.geekbrains.homework;

public class Robot extends Competitor {

    private static final int MIN_RUN = 500;
    private static final int MAX_RUN = 2000;
    private static final float MIN_JUMP = 1.f;
    private static final float MAX_JUMP = 3.5f;

    protected Robot() {
        this.canRun = (int) (MIN_RUN + Math.random() * (MAX_RUN - MIN_RUN));
        this.canJump = (float) (MIN_JUMP + Math.random() * (MAX_JUMP - MIN_JUMP));
    }

    protected void setName(int n) {
        this.name = "Робот_" + n;
    }
}
