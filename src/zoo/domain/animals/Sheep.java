package zoo.domain.animals;

import zoo.domain.*;
import zoo.domain.interfaces.*;

public class Sheep extends Mammal implements Feedable, Exportable, Swimmable {

    public Sheep(String name, int age, String furColor) {
        super(name, age, furColor, "Grass"); 
    }

    @Override
    public void feed() {
        System.out.println(getName() + " grazes on fresh " + this.dietType + ".");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " paddles awkwardly in the water.");
    }



    @Override
    public String sound() {
        return "Baaaa!";
    }

    @Override
    public String toDataFormat() {
        return "TYPE: Sheep | Name: " + getName() + " | Age: " + getAge() + 
               " | Fur: " + furColor + " | Diet: " + dietType;
    }
}