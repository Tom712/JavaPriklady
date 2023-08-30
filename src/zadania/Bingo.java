package zadania;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj meno: ");
        String meno = sc.nextLine();
        System.out.println("Ahoj " + meno + " vitaj v hre Bingo, tvojou ulohou je uhadnut cislo od 1 do 100.");

        Random r = new Random();
        int myRandomNumber  = r.nextInt(100 + 1);

        for(;;){

            System.out.println("Zadaj cislo: ");
            int cislo = sc.nextInt();

            if (cislo == myRandomNumber){
                System.out.println("BINGO! Uhádol si!");
                break;
            } else if (cislo > myRandomNumber){
                System.out.println("Neuhádol si, moje číslo je menšie");
            } else {
                System.out.println("Neuhádol si, moje číslo je väčšie");
            }

        }

    }
}
