package lesson1.Homework1.course;

import lesson1.Homework1.team.TeamMember;

public abstract class Obstacle_Course {
    private final int difficulty;

    public Obstacle_Course(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void goMarathon(TeamMember member) {
    }
}

