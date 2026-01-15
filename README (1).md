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


