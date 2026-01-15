package zoo.domain.animals;

import zoo.domain.*;
import zoo.domain.interfaces.*;

public class Penguin extends Bird implements Feedable, Swimmable, Trainable, Exportable {

    public Penguin(String name, int age, String wingSpan) {
        super(name, age, wingSpan, "No", "Fish"); 
    }

    @Override
    public void feed() {
        System.out.println(getName() + " catches " + this.dietType + " underwater.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims like a torpedo!");
    }

    @Override
    public void train() {
        System.out.println(getName() + " slides on its belly.");
    }

    @Override
    public String sound() {
        return "Squawk!";
    }

    @Override
    public String toDataFormat() {
        return "TYPE: Penguin | Name: " + getName() + " | Age: " + getAge() + 
               " | Wings: " + wingSpan + " | Diet: " + dietType;
    }
}