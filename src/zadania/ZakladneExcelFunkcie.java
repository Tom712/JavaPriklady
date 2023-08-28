package zadania;

public class ZakladneExcelFunkcie {
    public static int scitanie(int cislo1, int cislo2) {

        return  cislo1 + cislo2;
    }

    public static int priemeruj(int cislo1, int cislo2) {

        return  cislo1 / cislo2;
    }

    public static void pocet(int []array) {

        System.out.println("Dlzka pola: "+ array.length);

    }

    public static void min(int [] array) {
        int min=array[0];
        for (int i = 0 ; i<array.length; i++){
            if(array[i]<min){
                min=array[1];
            }
        }

        System.out.println("najmensie cislo: "+ min);
    }

    public static void max(int [] array) {

        int max=array[0];

        for (int i = 0 ;i< array.length; i++){
            if(array[i]>max){
                max=array[1];
            }
        }

        System.out.println("najvacsie cislo: "+ max);

    }


    public static void main(String[] args) {

        int[] cisla = {2, 5, 4, 3, 1};
        int vysledok=0;

        /* pred robenim bonusu

        for (int i=0; i < cisla.length ;i++ ){
            vysledok += cisla[i];
            System.out.println(vysledok);
        }*/


        ////bonus 1
        for (int i=0; i < cisla.length ;i++ ){
            vysledok =scitanie(vysledok,cisla[i]);

        }
        System.out.println("Vysledok scitania: "+vysledok);

        ///bonus 2

        System.out.println("Vysledok priemeru: "+priemeruj(vysledok,cisla.length));


        //bonus 3
        pocet(cisla);
        min(cisla);
        max(cisla);


    }
}
