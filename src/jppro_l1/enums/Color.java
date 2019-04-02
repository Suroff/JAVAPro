package jppro_l1.enums;

public enum Color {
    WHITE("Белый"),
    BLACK("Черный"),
    BROWN("Коричневый"),
    GRAY("Серый"),
    YELLOW("Желтый"),
    RED("Рыжий");

    String name;

    Color(String name){
        this.name = name;
    }

    public String GetName(){
        return name;
    }
}
