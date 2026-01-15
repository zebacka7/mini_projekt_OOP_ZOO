package zoo.domain.animals;

import zoo.domain.*;
import zoo.domain.interfaces.*;

public class Gekko extends Reptile implements Feedable, Exportable, Swimmable {

    public Gekko(String name, int age, String isVenomous) {
        super(name, age, isVenomous, "insects"); 
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eats " + this.dietType);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims quickly across the surface.");
    }


    @Override
    public String sound() {
        return "Click-click";
    }

@Override
    public String toDataFormat() {
        return "TYPE: Gekko | Name: " + getName() + " | Age: " + getAge() + 
               " | Venomous: " + isVenomous + " | Diet: " + dietType;
    }
}