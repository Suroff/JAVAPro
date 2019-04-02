package jppro_l1.Animals;


import jppro_l1.Participant;

public abstract class Animals implements Participant {

    private String name;
    private int age;
    private String color;

    public Animals(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
//
    //overload
    public Animals(String name, String color) {
        this(name, 0, color);
//        this.name = name;
//        this.color = color;
//        this.age = 0;
    }

    public abstract void voice();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
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

}
