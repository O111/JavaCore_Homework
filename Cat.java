package ru.geekbrains.homework;

public class Cat extends Competitor {

    private static final int MIN_RUN = 300;
    private static final int MAX_RUN = 700;
    private static final float MIN_JUMP = 0.6f;
    private static final float MAX_JUMP = 2.5f;

    protected Cat() {
        this.canRun = (int) (MIN_RUN + Math.random() * (MAX_RUN - MIN_RUN));
        this.canJump = (float) (MIN_JUMP + Math.random() * (MAX_JUMP - MIN_JUMP));
    }

    protected void setName(int n) {
        this.name = "Кот_" + n;
    }
}
