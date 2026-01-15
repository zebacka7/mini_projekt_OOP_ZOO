package zoo.domain.animals;

import zoo.domain.*;
import zoo.domain.interfaces.*;

public class Lion extends Mammal implements Feedable, Exportable, Trainable, Swimmable {

    public Lion(String name, int age, String furColor) {
        super(name, age, furColor, "meat"); 
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eats " + this.dietType);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims 10m (hates water).");
    }

    @Override
    public void train() {
        System.out.println(getName() + " does a mighty jump through the ring!");
    }

    @Override
    public String sound() {
        return "Roar";
    }

@Override
    public String toDataFormat() { 
        return "TYPE: Lion | Name: " + getName() + " | Age: " + getAge() + 
               " | Fur Color: " + furColor + " | Diet: " + dietType;
    }
}