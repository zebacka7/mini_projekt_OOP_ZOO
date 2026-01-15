package zoo.domain.animals;

import zoo.domain.*;
import zoo.domain.interfaces.*;

public class Turtle extends Reptile implements Feedable, Swimmable, Exportable {

    public Turtle(String name, int age) {
        super(name, age, "No", "Lettuce"); 
    }

    @Override
    public void feed() {
        System.out.println(getName() + " slowly munches on " + this.dietType + ".");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " dives deep with its shell.");
    }



    @Override
    public String sound() {
        return "Hiss...";
    }

    @Override
    public String toDataFormat() {
        return "TYPE: Turtle | Name: " + getName() + " | Age: " + getAge() + 
               " | Venomous: " + isVenomous + " | Diet: " + dietType;
    }
}