package zoo.domain.animals;

import zoo.domain.*;
import zoo.domain.interfaces.*;

public class Snake extends Reptile implements Feedable, Swimmable, Exportable {

    public Snake(String name, int age, String isVenomous) {
        super(name, age, isVenomous, "Mice"); 
    }

    @Override
    public void feed() {
        System.out.println(getName() + " swallows the prey whole (" + this.dietType + ").");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " slithers smoothly through the water.");
    }


    @Override
    public String sound() {
        return "Ssssss!";
    }

    @Override
    public String toDataFormat() {
        return "TYPE: Snake | Name: " + getName() + " | Age: " + getAge() + 
               " | Venomous: " + isVenomous + " | Diet: " + dietType;
    }
}