package ru.geekbrains.homework;

public class Human extends Competitor {

    private static final int MIN_RUN = 200;
    private static final int MAX_RUN = 1200;
    private static final float MIN_JUMP = 0.3f;
    private static final float MAX_JUMP = 2.5f;

    protected Human() {
        this.canRun = (int) (MIN_RUN + Math.random() * (MAX_RUN - MIN_RUN));  // индивидуальный разброс показателя
        this.canJump = (float) (MIN_JUMP + Math.random() * (MAX_JUMP - MIN_JUMP));
    }

    protected void setName(int n) {
        this.name = "Человек_" + n;
    }
}
