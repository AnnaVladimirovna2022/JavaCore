package lesson1.Homework1.course;

import lesson1.Homework1.team.TeamMember;

public class Running extends Obstacle_Course {
    public Running(int difficulty) {
        super(difficulty);
    }
    @Override
    public void goMarathon(TeamMember member) {
        member.running(super.getDifficulty());
    }
}

