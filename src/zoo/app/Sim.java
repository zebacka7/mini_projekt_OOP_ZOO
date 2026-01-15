package zoo.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zoo.domain.Animal;
import zoo.domain.animals.*; 
import zoo.domain.interfaces.Exportable;
import zoo.service.ReportingService;
import zoo.service.SimulationService;

public class Sim {
    public static void main(String[] args) {
        SimulationService simulationService = new SimulationService();
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Initializing default zoo...");
        simulationService.addAnimal(new Lion("Simba", 5, "Golden"));
        simulationService.addAnimal(new Flamingo("Pinky", 4, "1.5m")); 
        simulationService.addAnimal(new Gekko("Pascal", 2, "No"));
        simulationService.addAnimal(new Snake("Nagini", 8, "Yes"));
        simulationService.addAnimal(new Penguin("Skipper", 3, "60cm"));
        simulationService.addAnimal(new Sheep("Dolly", 4, "White Wool"));

        boolean running = true;
        
        while (running) {
            System.out.println("\n--- ZOO MANAGER MENU ---");
            System.out.println("1. Add Lion");
            System.out.println("2. Add Flamingo");
            System.out.println("3. Add Gekko");
            System.out.println("4. Add Snake");   
            System.out.println("5. Add Penguin"); 
            System.out.println("6. Add Sheep");   
            System.out.println("7. Add Elephant");
            System.out.println("8. Add Eagle");
            System.out.println("9. Add Turtle");
            System.out.println("0. Run Simulation & Exit");          
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": 
                    System.out.print("Name: "); String lName = scanner.nextLine();
                    System.out.print("Age: "); int lAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Fur Color: "); String fur = scanner.nextLine();
                    simulationService.addAnimal(new Lion(lName, lAge, fur));
                    break;

                case "2": 
                    System.out.print("Name: "); String fName = scanner.nextLine();
                    System.out.print("Age: "); int fAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Wingspan (String): "); String wings = scanner.nextLine();
                    simulationService.addAnimal(new Flamingo(fName, fAge, wings));
                    break;

                case "3": 
                    System.out.print("Name: "); String gName = scanner.nextLine();
                    System.out.print("Age: "); int gAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Is Venomous (Yes/No): "); String gVenom = scanner.nextLine();
                    simulationService.addAnimal(new Gekko(gName, gAge, gVenom));
                    break;

                case "4": 
                    System.out.print("Name: "); String sName = scanner.nextLine();
                    System.out.print("Age: "); int sAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Is Venomous (Yes/No): "); String sVenom = scanner.nextLine();
                    simulationService.addAnimal(new Snake(sName, sAge, sVenom));
                    break;

                case "5":
                    System.out.print("Name: "); String pName = scanner.nextLine();
                    System.out.print("Age: "); int pAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Wingspan (String): "); String pWings = scanner.nextLine();
                    simulationService.addAnimal(new Penguin(pName, pAge, pWings));
                    break;

                case "6":
                    System.out.print("Name: "); String shName = scanner.nextLine();
                    System.out.print("Age: "); int shAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Fur Color: "); String sFur = scanner.nextLine();
                    simulationService.addAnimal(new Sheep(shName, shAge, sFur));
                    break;


                case "7": 
                System.out.print("Name: "); String eName = scanner.nextLine();
                System.out.print("Age: "); int eAge = Integer.parseInt(scanner.nextLine());
                simulationService.addAnimal(new Elephant(eName, eAge)); 
                System.out.println("Elephant added!");
                break;

                case "8": 
                System.out.print("Name: "); String eaName = scanner.nextLine();
                System.out.print("Age: "); int eaAge = Integer.parseInt(scanner.nextLine());
                 System.out.print("Wingspan (String): "); String eaWings = scanner.nextLine();
                simulationService.addAnimal(new Eagle(eaName, eaAge, eaWings));
                System.out.println("Eagle added!");
                 break;

                case "9": 
                System.out.print("Name: "); String tName = scanner.nextLine();
                System.out.print("Age: "); int tAge = Integer.parseInt(scanner.nextLine());
                simulationService.addAnimal(new Turtle(tName, tAge));
                System.out.println("Turtle added!");
                break;

                case "0": 
                running = false;
                break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        simulationService.runSimulation();

        ReportingService reportingService = new ReportingService();
        List<Exportable> exportList = new ArrayList<>();
        
        for (Animal a : simulationService.getAnimals()) {
            if (a instanceof Exportable) {
                exportList.add((Exportable) a);
            }
        }
        reportingService.generateReport(exportList);
        
        scanner.close(); 
    }
}