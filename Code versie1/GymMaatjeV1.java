// @author: Julian Weijers
// Doel: Doe berekeningen met het aantal gewicht wat de gebruiker kan tillen en geef hierover resultaat

import java.util.Scanner;

public class GymMaatjeV1 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variabelen
        int eenheidKeuze = 0;

        // Introductie
        System.out.println("Kies uw taal / Choose your language");
        System.out.print("Voer 1 in voor Nederlands / Enter 2 for English: ");
        int taalKeuze = input.nextInt(); // Mag later verwijderd worden, was alleen voor checken

        // Zorg voor juist input
        while (taalKeuze < 1 || taalKeuze > 2){
            System.out.println("\tOnjuiste invoer / Wrong input");
            System.out.print("\tVoer 1 in voor Nederlands / Enter 2 for English: ");
            taalKeuze = input.nextInt();
        }

        // User input eenheid gewicht
        switch (taalKeuze){
            case 1:
                System.out.println("\nWil je rekenen met kilogram (kg) of met pond (lbs)?");
                System.out.print("Voor kilogram (kg) toets 1 / voor pond (lbs) toets 2: ");
                eenheidKeuze = input.nextInt();

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
        }


    }
}
