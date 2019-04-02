package jppro_l1.Animals;

import jppro_l1.Participant;
import jppro_l1.enums.Color;

public class Cat extends Animals implements Participant {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;


    public Cat(String name, int age, String color, int runDistance,int jumpHeight) {
        super(name, age, color);
        isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = 0;
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public boolean isOnDistance(){
        return isOnDistance;
    }

    @Override
    public void voice() {
    System.out.println("Мяу");
    }

    @Override
    public void run(int distance) {
//    System.out.println("Кошка бежит");
        if (!isOnDistance){
            return;
        }
        if (distance > runDistance){
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Кошка %s пробежала кросс длинной %d",getName(),distance));
    }

    @Override
    public void jump(int height) {
//        System.out.println("Кошка прыгает");
        if (!isOnDistance){
            return;
        }
        if (height > jumpHeight){
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Кошка %s прыгнула на высоту %d",getName(),height));

    }

    @Override
    public void swim(int distance) {
        isOnDistance = false;
        System.out.println("Кошка утонула");
//        throw new UnsupportedOperationException("Кошка утонула");
    }


    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }
}
