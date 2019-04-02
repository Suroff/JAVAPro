package jppro_l1.Animals;

import jppro_l1.Participant;
import jppro_l1.enums.Color;

public class Dog extends Animals implements Participant {

    private boolean isOnDistance;
    private boolean Off;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public Dog(String name, int age, String color, int runDistance, int jumpHeight, int swimDistance) {
        super(name, age, color);
        isOnDistance = true;
        Off = false;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public Dog(String name, String color) {
        super(name, color);
    }


    @Override
    public void voice() {
        System.out.println("Гав");
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
            System.out.println(String.format("Собака %s не смогла пробежать кросс длинной %d. И сошла с дистанции.",getName(),distance));

            return;
        }
        System.out.println(String.format("Собака %s пробежала кросс длинной %d",getName(),distance));

    }

    @Override
    public void jump(int height) {

        if (!isOnDistance){
            return;
        }
        if (height > jumpHeight){
            isOnDistance = false;
            Off = true;
            System.out.println(String.format("Собака %s не прыгнула на высоту %d. И сошла с дистанции.",getName(),height));
            return;
        }
        System.out.println(String.format("Собака %s прыгнула на высоту %d",getName(),height));

    }

    @Override
    public void swim(int distance) {
        if (!isOnDistance){
            return;
        }
        if (distance > runDistance){
            isOnDistance = false;
            Off = true;
            System.out.println(String.format("Собака %s не проплыла %d. И сошла с дистанции.",getName(),distance));
            return;
        }
        System.out.println(String.format("Собака %s проплыла %d",getName(),distance));
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
