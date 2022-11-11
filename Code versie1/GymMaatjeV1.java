// @author: Julian Weijers
// Versie 1: ruwe schets
// Doel: Doe berekeningen met het aantal gewicht wat de gebruiker kan tillen en geef hierover resultaat
// Side note: dit programma is in heel basis java geschreven, niet eens naar conventie van Object Oriented programming. Dit volgt later.

import java.util.Scanner;

public class GymMaatjeV1 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variabelen en constanten
        double[] gewichtOefening = new double[3];
        int[] herhalingenOefening = new int[3];

        // Introductie met vragen gebruiker
        System.out.println("Welkom bij GymMaatje! Jouw persoonlijke maatje voor in de gym!\n");
        System.out.print("Allereerst, wat is je naam? ");
        String naamGebruiker = input.nextLine(); // slaat gebruikers naam op

        System.out.print("Wat is je lengte in centimeters? ");
        int lengteGebruiker = input.nextInt(); // slaat gebruikers lengte op

        System.out.print("Hoeveel weeg je in kilogram (1 decimaal)? ");
        double gewichtGebruiker = input.nextDouble(); // slaat gebruikers gewicht op

        System.out.print("Wil je de berekeningen in kilogram of in pond? ");
        input.nextLine(); // clear buffer
        String eenheidKeuze = input.nextLine(); // Keuze voor gebruiker om te rekenen met andere eenheid

        // Vraag gegevens over oefening
        System.out.println("\nMet welke oefeningen wil je berekeningen doen?");
        System.out.println("Je kan kiezen uit bankdrukken, squat of deadlift.");
        System.out.print("Voer de oefeningen in die je wil berekenen (met spaties daartussen): ");
        String keuzeOefening = input.nextLine();
        String[] oefening = keuzeOefening.split(" "); // split de spring in losse delen

        for (int i = 0; i < oefening.length; i++) {
            System.out.printf("%nHoeveel gewicht kan je voor %s? ", oefening[i]);
            gewichtOefening[i] = input.nextDouble();

            System.out.printf("Voor hoeveel herhalingen kan je dit gewicht? ");
            herhalingenOefening[i] = input.nextInt();
        }

        // Print resultaten
        System.out.printf("%nBeste %s,%n", naamGebruiker);
        System.out.println("Er volgt nu een overzicht van de gegevens van de oefeningen die je hebt ingevoerd.");
        System.out.println("Let op, het uitgerekende gewicht voor 1 herhaling is gebaseerd op percentages.");
        // print gegevens oefeningen dmv methodes
        for (int i = 0; i < oefening.length; i++) {
            printBerekeningen(oefening[i] , berekenMaximaalGewicht(gewichtOefening[i], herhalingenOefening[i]));
        }







        /* Later doen : zorg voor correcte user input
        while (taalKeuze < 1 || taalKeuze > 2){
            System.out.println("\tOnjuiste invoer / Wrong input");
            System.out.print("\tVoer 1 in voor Nederlands / Enter 2 for English: ");
            taalKeuze = input.nextInt();
        } */

        // User input eenheid gewicht
       /* switch (taalKeuze){
            case 1:
                System.out.println("\nWil je rekenen met kilogram (kg) of met pond (lbs)?");
                System.out.print("Voor kilogram (kg) toets 1 / voor pond (lbs) toets 2: ");
                //eenheidKeuze = input.nextInt();

                while (eenheidKeuze < 1 || eenheidKeuze > 2) {
                    System.out.println("\tOnjuiste invoer, probeer opnieuw.");
                    System.out.print("\tVoor kilogram (kg) toets 1 / voor pond (lbs) toets 2: ");
                    eenheidKeuze = input.nextInt();
                }
                break;
            case 2:
                System.out.println("\nDo you want to calculate with kilograms (kg) or with pounds (lbs)?");
                System.out.print("For kilograms (kg) enter 1 / for pounds (lbs) enter 2: ");
                eenheidKeuze = input.nextInt();

                while (eenheidKeuze < 1 || eenheidKeuze > 2) {
                    System.out.println("\tWrong input, try again.");
                    System.out.print("\tFor kilograms (kg) enter 1 / for pounds (lbs) enter 2: ");
                    eenheidKeuze = input.nextInt();
                }
                break;
        } */


    }

    public static double berekenMaximaalGewicht(double gewichtOefening, int herhalingenOefening) {
        // 1 rep calculated based on Brzycki formula
        double maximaalGewicht = gewichtOefening / (1.0278 - 0.0278 * herhalingenOefening);
        return maximaalGewicht;
    }

    public static void printBerekeningen(String oefening, double maximaalGewicht) {
        System.out.printf("%n%s%n", oefening);
        System.out.printf("Jouw geschatte 1 rep max: %.1f kg%n", maximaalGewicht);

        // print bovenste regel
        System.out.printf("%n%-19s |", "Percentage van 1 rm");
        System.out.printf("%14s |", "Gewicht in kg");
        System.out.printf("%19s ", "Aantal herhalingen");

    }
}

