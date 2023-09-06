package zadania;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;

public class ZadavanieKnih {

    public static void main(String[] args) {
        ArrayList<String> knihy = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Napis knihy, napis koniec na ukoncenie: ");

        while (true){


            String input = sc.nextLine();

            String normalizedString = Normalizer.normalize(input,Normalizer.Form.NFKD).replaceAll("[^\\p{ASCII}]", "").toLowerCase().replaceAll("\\s{2,}", " ").trim();

            if (normalizedString.equals("koniec")){
                for (int i = 0; i < knihy.size(); i++) {
                    System.out.println(i+1 +": "+ knihy.get(i));
                }
                System.out.println("Koniec programu.");
                sc.close();
                break;
            } else{
                knihy.add(input);
            }


        }
    }


}
