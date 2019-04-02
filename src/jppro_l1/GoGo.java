package jppro_l1;



import jppro_l1.Animals.Cat;
import jppro_l1.Animals.Dog;
import jppro_l1.Animals.Human;
import jppro_l1.Animals.Robot;
import jppro_l1.course.Course;
import jppro_l1.course.Cross;
import jppro_l1.course.Wall;
import jppro_l1.course.Water;
import jppro_l1.enums.Color;

public class GoGo {





    public static void main(String[] args){
        Cat cat1 = new Cat("Barisk",4, "White",10,3);
        Dog dog1 = new Dog("Rex",3, "Brown",50,2,100);
        Human hum1 = new Human("Ivan",18,"Red",200,3,150);
        Robot rob1 = new Robot("T100", 100,"Silver",1000,3,25);
        Course c = new Course( new Cross(50), new Wall(3), new Water(40));
        Team team = new Team("Pobeda",cat1,dog1,hum1,rob1);
        team.TeamInfo(team);
        c.doIt(team);
    }
}
