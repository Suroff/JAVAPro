package jppro_l1.Animals;

import jppro_l1.Participant;


public class Robot implements Participant {

    private boolean isOnDistance;
    private boolean Off;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;
    private String model;
    private String color;
    private int age;

    public Robot (String model, int age, String color, int runDistance, int jumpHeight, int swimDistance){
        this.model = model;
        this.color = color;
        this.age = age;
        isOnDistance = true;
        Off = false;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public String getName() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public void setName(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getParticipantName() {
        return getName();
    }

    public String getParticipantColor() {
        return getColor();
    }

    public int getParticipantAge() {
        return getAge();
    }


    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public boolean Off(){
        return Off;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance){
            return;
        }
        if (distance > runDistance){
            isOnDistance = false;
            Off = true;
            System.out.println(String.format("Робот %s не пробежал кросс длинной %d. И сошел с дистанции.",getName(),distance));
            return;
        }
        System.out.println(String.format("Робот %s пробежал кросс длинной %d",getName(),distance));

    }

    @Override
    public void jump(int height) {
        if (!isOnDistance){
            return;
        }
        if (height > jumpHeight){
            isOnDistance = false;
            Off = true;
            System.out.println(String.format("Робот %s не прыгнул на высоту %d. И сошел с дистанции.",getName(),height));
            return;
        }
        System.out.println(String.format("Робот %s прыгнул на высоту %d",getName(),height));

    }

    @Override
    public void swim(int distance) {

        if (!isOnDistance){
            return;
        }
        if (distance > swimDistance){
            isOnDistance = false;
            Off = true;
            System.out.println(String.format("Робот %s не проплыл %d. И сошел с дистанции.",getName(),distance));
            return;
        }
        System.out.println(String.format("Робот %s проплыл %d",getName(),distance));
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public void setJumpHeight(int jumpHeight){
        this.jumpHeight = jumpHeight;
    }

    }
