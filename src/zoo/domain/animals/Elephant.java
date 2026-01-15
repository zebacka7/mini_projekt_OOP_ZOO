package zoo.domain.animals;

import zoo.domain.*;
import zoo.domain.interfaces.*;

public class Elephant extends Mammal implements Feedable, Swimmable, Trainable, Exportable {

    public Elephant(String name, int age) {
        super(name, age, "Gray", "Fruits & Branches"); 
    }

    @Override
    public void feed() {
        System.out.println(getName() + " grabs " + this.dietType + " with its trunk.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " loves bathing and spraying water!");
    }

    @Override
    public void train() {
        System.out.println(getName() + " balances on a large ball.");
    }

    @Override
    public String sound() {
        return "Trumpet!";
    }

    @Override
    public String toDataFormat() {
        return "TYPE: Elephant | Name: " + getName() + " | Age: " + getAge() + 
               " | Skin: " + furColor + " | Diet: " + dietType;
    }
}