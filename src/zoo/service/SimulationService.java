package zoo.service;

import java.util.ArrayList;
import java.util.List;
import zoo.domain.Animal;
import zoo.domain.interfaces.*;
public class SimulationService {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal)
    {
        if(animal != null)
        {
            animals.add(animal);
        System.out.println(animal.getName() + " zostal dodany do symulacji");
        }
        else
        {
            System.out.println("zwierze nie moze byc null");
        }
    }
    



    public List<Animal> getAnimals() {
        return animals;
    }

public void runSimulation() {
    for (Animal a : animals) {
        System.out.println("\n--- Aktywność: " + a.getName() + " ---");
        
        System.out.println(a.sound()); 

        if (a instanceof Swimmable) {
            ((Swimmable) a).swim(); 
        }
        
        if (a instanceof Trainable) {
            ((Trainable) a).train();
        }
        
        if (a instanceof Feedable) {
            ((Feedable) a).feed(); 
        }
    }
}
}