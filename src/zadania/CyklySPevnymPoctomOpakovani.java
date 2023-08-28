package zadania;

public class CyklySPevnymPoctomOpakovani {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println(); // Prazdny riadok
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println(); // Prazdny riadok
        // Vypis parne cisla. Mozeme pouzit zapis scitania i=i+2, resp. i+=2
        for (int i = 2; i <= 10; i=i+2) {
            System.out.print(i);
        }
        System.out.println(); // Prazdny riadok
        // Vypis parne cisla odzadu
        for (int i = 10; i > 2; i=i-2) {
            System.out.print(i + "\t"); // Pouzil som \t ako tabulator, aby som odsadil vypis hodnoty
        }System.out.println(); // Prazdny riadok
        // Vnaranie cyklov
        // TODO Ako vypisat hodnoty od 1 do 100, aby v prvom riadku vypisalo od 1 do 10, v druhom od 11 do 20, v tretom od 21 do 30, atd.
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) System.out.println();
        }
    }
}