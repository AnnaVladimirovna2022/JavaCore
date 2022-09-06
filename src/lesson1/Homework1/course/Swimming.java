package lesson1.Homework1.course;

import lesson1.Homework1.team.TeamMember;

public class Swimming extends Obstacle_Course {
    public Swimming(int difficulty) {
        super(difficulty);
    }
    @Override
    public void goMarathon(TeamMember member) {
        member.swimming(super.getDifficulty());
    }
}
