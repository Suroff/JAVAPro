package jppro_l1;

public interface Participant {
    boolean isOnDistance();

    String getParticipantName();

    int getParticipantAge();

    String getParticipantColor();

    void run(int distance);

    void jump(int height);

    void swim(int distance);


}

