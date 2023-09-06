package zadania;

import java.util.ArrayList;
import java.util.Scanner;

public class ScitanieVstupHodnotArrayList {
    public static double zaokruhlenie(double cislo){
        System.out.println("Pred zaokruhlenim: "+cislo);
        return Math.round(cislo * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        ArrayList<Double> cisla = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Napis cisla, napis minusove cislo na ukoncenie: ");

        while (true){
            String input = sc.nextLine();
            try
            {
                String replace = input.replace(',', '.');
                double cislo = Double.parseDouble(replace);
                if (cislo < 0){
                    System.out.println(cisla);
                    //System.out.println("Suma je: " + cisla.stream().mapToDouble(Double::doubleValue).sum());
                    System.out.println("Po zaoukruhleni na 2 desatinne miesta je suma: " + zaokruhlenie(cisla.stream().mapToDouble(Double::doubleValue).sum()));
                    System.out.println("Koniec programu.");
                    sc.close();
                    break;
                } else {
                    cisla.add(cislo);
                }
            }
            catch (NumberFormatException e)
                {
                    System.out.println(input + " neni cislo");
                }
        }
    }
}




