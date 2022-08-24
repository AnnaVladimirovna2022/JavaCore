package lesson1.Homework1.course;

import lesson1.Homework1.Status;
import lesson1.Homework1.team.Team;
import lesson1.Homework1.team.TeamMember;

public class Course {
    private Obstacle_Course[] obstacles;

    public Course(Obstacle_Course... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member : team.getMembers()) {
            for (Obstacle_Course obs : obstacles) {
                obs.goMarathon(member);
                if (member.getStatus() == Status.NoPassedDistance) {
                    break;
                }
            }
        }
    }
}

