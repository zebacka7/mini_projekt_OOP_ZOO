package zoo.domain.animals;

import zoo.domain.*;
import zoo.domain.interfaces.*;

public class Eagle extends Bird implements Feedable, Trainable, Exportable {

    public Eagle(String name, int age, String wingSpan) {
        super(name, age, wingSpan, "Yes", "Meat"); 
    }

    @Override
    public void feed() {
        System.out.println(getName() + " catches fresh " + this.dietType + " in mid-air.");
    }


    @Override
    public void train() {
        System.out.println(getName() + " lands perfectly on the trainer's glove.");
    }

    @Override
    public String sound() {
        return "Screech!";
    }

    @Override
    public String toDataFormat() {
        return "TYPE: Eagle | Name: " + getName() + " | Age: " + getAge() + 
               " | Wings: " + wingSpan + " | Diet: " + dietType;
    }
}