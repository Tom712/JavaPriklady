package zadania;

import java.util.Scanner;
public class Obdlznik {
    public static double obvod(double a, double b) {
        return 2 * (a + b);
    }
    public static double obsah(double a, double b) { return a * b; }
public static void main(String[] args) {
        for (;;){
            double a ;
            double b ;

            Scanner sc = new Scanner(System.in);
            System.out.println("Napis s ak chces zadat strany alebo q ak chces skoncit.");
            String vstup = sc.nextLine();
            if(vstup.equals("q")){
                System.out.println("Koniec programu.");
                break;
            }else if(vstup.equals("s")){
                System.out.println("Zadaj stranu a: ");
                a = sc.nextDouble();
                System.out.println("Zadaj stranu b: ");
                b = sc.nextDouble();
                System.out.println("Obvod obdlznika o stranach " + a + " a " + b + " je " + obvod(a, b));
                System.out.println("Obsah obdlznika o stranach " + a + " a " + b + " je " + obsah(a, b));
            }
        }
    }
}
