package ru.geekbrains.homework;

public class Track extends Task {

    private static final int MIN_DIST = 300;
    private static final int MAX_DIST = 1500;

    private int distance;

    protected Track() {
        this.distance = (int) (MIN_DIST + Math.random() * (MAX_DIST - MIN_DIST));  // разброс длины дорожек
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean isSuccess(Competitor competitor) {
        return (competitor.canRun >= this.getDistance());
    }
}
