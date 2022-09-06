package lesson1.Homework1.course;

import lesson1.Homework1.team.TeamMember;

public class Shooting extends Obstacle_Course {
    public Shooting(int difficulty) {
        super(difficulty);
    }
    @Override
    public void goMarathon(TeamMember member) {
        member.shooting(super.getDifficulty());
    }
}

