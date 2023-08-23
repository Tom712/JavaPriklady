package zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class PridanieZnamkyUkoncenieCezPrikazQ {
    public static void main(String[] args) {
        while (true) { // Nekonecny cyklus
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj počet bodov:");
            String pocetBodov = skener.nextLine();
            if (pocetBodov.equals("q")|| isLetter(pocetBodov.charAt(0))) {
                break;
            }
            try {
                if (Integer.parseInt(pocetBodov) > 90) {
                    System.out.println("A");
                } else if (Integer.parseInt(pocetBodov) > 75) {
                    System.out.println("B");
                } else if (Integer.parseInt(pocetBodov)> 65) {
                    System.out.println("C");
                } else {
                    System.out.println("Znamka je nizsia ako C");
                }
            } catch (InputMismatchException e) {
                System.out.println("Zadal si neakceptovatelny formát čísla!");
                System.exit(1); // "Nasilne" ukoncenie programu
            } finally {
            }

        }


    }
}
