package ru.geekbrains.homework;

public class Main {

    private static final int TEAM_NUMBER = 11;  // число участников забега > 0; чтобы не увеличивать код, не пишу валидацию
    private static final int TASKS_NUMBER = 5;  // число препятствий > 0; чтобы не увеличивать код, не пишу валидацию

    public static void main(String[] args) {

        Task[] tasks = new Task[TASKS_NUMBER];  // создаю массив препятствий поочередно, а не рандомно
        for (int i=0; i < tasks.length; i++) {
            int n = i % 2;
            switch (n) {
                case 0:
                    tasks[i] = new Track();
                    break;
                case 1:
                    tasks[i] = new Wall();
                    break;
            }
        }

        Competitor[] team = new Competitor[TEAM_NUMBER];
        for (int i=0; i < team.length; i++) {  // создаю массив участников поочередно, а не рандомно
            int n = i % 3;
            switch (n) {
                case 0:
                    team[i] = new Human();
                    ((Human)team[i]).setName(i / 3 + 1);
                    break;
                case 1:
                    team[i] = new Cat();
                    ((Cat)team[i]).setName(i / 3 + 1);
                    break;
                case 2:
                    team[i] = new Robot();
                    ((Robot)team[i]).setName(i / 3 + 1);
                    break;
                }
        }

        for (Competitor competitor : team) {
            competitor.run(tasks);
        }
    }
}
