package zoo.domain.animals;

import zoo.domain.*;
import zoo.domain.interfaces.*;

public class Flamingo extends Bird implements Feedable, Swimmable, Exportable {

    public Flamingo(String name, int age, String wingSpan) {
        super(name, age, wingSpan, "yes", "worms and algae"); 
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eats " + this.dietType);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " wades through the water on long legs.");
    }


    @Override
    public String sound() {
        return "Honk-honk!";
    }

@Override
    public String toDataFormat() {
        return "TYPE: Flamingo | Name: " + getName() + " | Age: " + getAge() + 
               " | Wingspan: " + wingSpan + " | Diet: " + dietType;
    }
}