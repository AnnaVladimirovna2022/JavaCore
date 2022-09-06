package lesson1.Homework1.course;

import lesson1.Homework1.team.TeamMember;

public class Jumping extends Obstacle_Course {
    public Jumping(int difficulty) {
        super(difficulty);
    }
    @Override
    public void goMarathon(TeamMember member) {
        member.jumping(super.getDifficulty());
    }
}
