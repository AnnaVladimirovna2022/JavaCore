package lesson1.Homework1.team;

import lesson1.Homework1.Status;

public class TeamMember {
    private Status status = Status.NoPassedDistance;
    private final String name;
    private final int power;

    public TeamMember(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public Status getStatus() {
        return status;
    }
    public String getName() {
        return name;
    }

    public void shooting(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " won the shooting");
        } else {
            changeStatus(Status.NoPassedDistance, " lost the shooting");
        }
    }

    public void jumping(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " got the height");
        } else {
            changeStatus(Status.NoPassedDistance, " didn't get the height");
        }
    }

    public void running(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " run the distance");
        } else {
            changeStatus(Status.NoPassedDistance, " didn't run the distance");
        }
    }

    public void swimming(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " swam the distance");
        } else {
            changeStatus(Status.NoPassedDistance, " didn't swim the distance");
        }
    }

    private boolean checkPower(int courseDifficulty) {
        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(name + message);
    }
}