package ru.geekbrains.homework;

public class Wall extends Task {

    private static final float MIN_HEIGHT = 0.5f;
    private static final float MAX_HEIGHT = 3.0f;

    private float height;

    protected Wall() {
        this.height = (float) (MIN_HEIGHT + Math.random() * (MAX_HEIGHT - MIN_HEIGHT));
    }

    public float getHeight() {
        return height;
    }

    @Override
    public boolean isSuccess(Competitor competitor) {
        return (competitor.canJump >= this.getHeight());
    }
}
