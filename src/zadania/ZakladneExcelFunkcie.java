package zadania;

public class ZakladneExcelFunkcie {
    public static int scitanie(int [] array) {
        int vysledok=0;


        for (int j : array) {
            vysledok = vysledok + j;

        }
        return vysledok;
    }

    public static int priemeruj(int []array) {
        ///vyuzijeme taky isty vypocet ako v scitani
        int vysledok=0;
        for (int j : array) {
            vysledok = vysledok + j;
        }

        return vysledok/array.length;
    }

    public static int pocet(int []array) {
        return array.length;
    }

    public static int min(int [] array) {
        int min=array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }

    public static int max(int [] array) {

        int max=array[0];

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        return max;

    }


    public static void main(String[] args) {

        int[] cisla = {2, 5, 4, 3, 1};
        //int vysledok=0;

        /* pred robenim bonusu

        for (int i=0; i < cisla.length ;i++ ){
            vysledok += cisla[i];
            System.out.println(vysledok);
        }*/


        ////bonus 1
       /* for (int i=0; i < cisla.length ;i++ ){
            vysledok =scitanie(vysledok,cisla[i]);

        }
        System.out.println("Vysledok scitania: "+vysledok);*/

        System.out.println("Vysledok scitania: "+scitanie(cisla));

        ///bonus 2

        System.out.println("Vysledok priemeru: "+priemeruj(cisla));


        //bonus 3
        System.out.println("Pocet cisel: "+pocet(cisla));
        System.out.println("Najmensie cislo: "+min(cisla));
        System.out.println("Najvacsie cislo: "+max(cisla));


    }
}
