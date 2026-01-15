# System Symulacji ZOO

Prosta aplikacja konsolowa napisana w języku Java, służąca do symulacji zarządzania ogrodem zoologicznym i aktywności zwierząt. Projekt został stworzony w ramach zaliczenia przedmiotu "Programowanie Obiektowe".
##  Opis projektu

Celem projektu jest symulacja działania małego ekosystemu. Aplikacja pozwala na zarządzanie różnymi gatunkami zwierząt (ssaki, ptaki, gady), interaktywne dodawanie nowych zwierząt oraz symulowanie ich codziennych zachowań (jedzenie, pływanie, trening).

Głównym naciskiem w projekcie jest praktyczne zastosowanie paradygmatów programowania obiektowego (OOP).

##  Technologie i koncepcje

* **Java 17**

### Zastosowane koncepcje OOP:
Dziedziczenie: Klasa abstrakcyjna Animal, klasy pośrednie (Mammal, Bird, Reptile) i konkretne gatunki (Lion, Snake, Penguin itd.).

Interfejsy:
Swimmable, Feedable, Trainable - kontrakty określające unikalne zdolności zwierząt (segregacja interfejsów).

Exportable - kontrakt pozwalający na eksport danych zwierzęcia do raportu.

Polimorfizm: Traktowanie różnych gatunków jako ogólny typ Animal w symulacji oraz jako Exportable w serwisie raportowym.

Kapsułkowanie: Chronione pola (protected), gettery, walidacja danych w konstruktorach (np. limit wieku).

##  Funkcjonalności

Zarządzanie zwierzętami: Interaktywne dodawanie zwierząt z konsoli (określanie imienia, wieku, cech specjalnych).

Symulacja zachowań: Inteligentne wywoływanie akcji (np. pływanie tylko dla zwierząt wodnych).

Raportowanie: Generowanie raportów tekstowych w formacie "Key-Value" (czytelniejsza alternatywa dla CSV).

Logika gatunkowa: Obsługa specyficznych cech biologicznych (np. jadowitość węży, rozpiętość skrzydeł).

##  Struktura projektu

zoo.app - Klasa uruchomieniowa Sim (Menu główne i pętla programu).

zoo.domain - Klasy modelu (Animal i dziedziczące) oraz pakiet interfaces.

zoo.service - Logika biznesowa (SimulationService - symulacja, ReportingService - raporty).

##  Przykładowe działanie (Konsola)

```text
--- ZOO MANAGER MENU ---
1. Add Lion
2. Add Flamingo
3. Add Gekko
4. Add Snake
5. Add Penguin
6. Add Sheep
7. Add Elephant
8. Add Eagle
9. Add Turtle
0. Run Simulation & Exit
Choose an option: 0

--- Activity: Simba ---
Roar
Simba swims 10m (hates water).
Simba does a mighty jump through the ring!
Simba eats Meat

--- Activity: Pinky ---
Honk-honk!
Pinky wades through the water on long legs.
Pinky eats Worms and algae

--- Activity: Pascal ---
Click-click
Pascal swims quickly across the surface.
Pascal eats Insects

--- Activity: Nagini ---
Ssssss!
Nagini slithers smoothly through the water.
Nagini swallows the prey whole (Mice).

--- Activity: Skipper ---
Squawk!
Skipper swims like a torpedo!
Skipper slides on its belly.
Skipper catches Fish underwater.

--- Activity: Dolly ---
Baaaa!
Dolly paddles awkwardly in the water.
Dolly grazes on fresh Grass.

=== Generating report ===
--- CSV REPORT ---
TYPE: Lion | Name: Simba | Age: 5 | Fur Color: Golden | Diet: Meat
TYPE: Flamingo | Name: Pinky | Age: 4 | Wingspan: 1.5m | Diet: Worms and algae
TYPE: Gekko | Name: Pascal | Age: 2 | Venomous: No | Diet: Insects
TYPE: Snake | Name: Nagini | Age: 8 | Venomous: Yes | Diet: Mice
TYPE: Penguin | Name: Skipper | Age: 3 | Wings: 60cm | Diet: Fish
TYPE: Sheep | Name: Dolly | Age: 4 | Fur: White Wool | Diet: Grass
--- End of report ---


