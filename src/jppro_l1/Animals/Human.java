package jppro_l1.Animals;

import jppro_l1.Participant;
import jppro_l1.enums.Color;

public class Human extends Animals implements Participant {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public Human(String name, int age, String color, int runDistance, int jumpHeight, int swimDistance) {
        super(name, age, color);
        isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public Human(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Ну пиздец");
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance){
            return;
        }
        if (distance > runDistance){
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s пробежал кросс длинной %d",getName(),distance));

    }

    @Override
    public void jump(int height) {
        if (!isOnDistance){
            return;
        }
        if (height > jumpHeight){
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s прыгнул на высоту %d",getName(),height));
    }

    @Override
    public void swim(int distance) {

        if (!isOnDistance){
            return;
        }
        if (distance > swimDistance){
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s проплыл %d",getName(),distance));

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
