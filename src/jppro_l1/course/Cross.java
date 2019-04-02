package jppro_l1.course;

import jppro_l1.Participant;

public class Cross extends Obstacle {

    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(this.distance);
    }
}
