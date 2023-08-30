package zadania;

import java.util.Scanner;

public class Obdlznik {

    public static int obvod(int a, int b) {
        return 2 * (a + b);
    }
    public static int obsah(int a, int b) {
        return a * b;
    }
public static void main(String[] args) {
        /*int a = 5;
        int b = 10;

        System.out.println("Obvod obdlznika o stranach " + a + " a " + b + " je " + obvod(a, b));
        System.out.println("Obsah obdlznika o stranach " + a + " a " + b + " je " + obsah(a, b));*/

        for (;;){
            int a ;
            int b ;

            Scanner sc = new Scanner(System.in);
            System.out.println("Napis s ak chces zadat strany alebo q ak chces skoncit.");
            String vstup = sc.nextLine();
            if(vstup.equals("q")){
                System.out.println("Koniec programu.");
                break;
            }else if(vstup.equals("s")){
                System.out.println("Zadaj stranu a: ");
                a = sc.nextInt();
                System.out.println("Zadaj stranu b: ");
                b = sc.nextInt();
                System.out.println("Obvod obdlznika o stranach " + a + " a " + b + " je " + obvod(a, b));
                System.out.println("Obsah obdlznika o stranach " + a + " a " + b + " je " + obsah(a, b));


            }
        }


    }

}
