package zadania;
/*
Úloha 1: Základné matematické operácie
        Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.
        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.
*/

public class ZakladneMatematickeOperacie {
    public static void main(String[] args) {
        double cislo1 = 2.3, cislo2 = 4.5;
        double cislo3 = 11, cislo4 = 2;
        double scitanie = cislo1 + cislo2;
        double odcitanie =  cislo1 - cislo2;
        double nasobenie =  cislo1 * cislo2;
        double delenie =  cislo1 / cislo2;
        double modulo =  cislo3 % cislo4;

        System.out.println("Výsledok sčítania hodnôt " + cislo1 + " a " + cislo2 + " je " + (cislo1 + cislo2));
        System.out.printf("Výsledok sčítania hodnôt %.1f a %.1f je %.1f\n", cislo1, cislo2, scitanie);

        System.out.printf("Výsledok odcitania hodnôt %.1f a %.1f je %.1f \n", cislo1, cislo2, odcitanie);
        System.out.printf("Výsledok nasobenia hodnôt %.1f a %.1f je %.1f\n", cislo1, cislo2, nasobenie);
        System.out.printf("Výsledok delenia hodnôt %.1f a %.1f je %.1f\n", cislo1, cislo2, delenie);
        System.out.printf("Výsledok modulo hodnôt %.1f a %.1f je %.1f\n", cislo3, cislo4, modulo);


/*
        String name = "Cameron";
        String site = "TechTarget";
        System.out.printf("I like the stuff %s writes on %S. %n", name, site);*/
        /* Printf output: I like the stuff Cameron writes on TECHTARGET. */

    }
}