package zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PriradenieZnamky {

    public static void main(String[] args) {
        int percenta = 0;
        Scanner skener = new Scanner(System.in);

        for (;;) {
            System.out.println("Zadaj percenta: ");
            try {
                percenta = skener.nextInt();
                if (percenta > 90) {
                    System.out.println("A");
                } else if (percenta > 75) {
                    System.out.println("B");
                } else if (percenta > 65) {
                    System.out.println("C");
                } else if (percenta == -1) {
                    break;
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
