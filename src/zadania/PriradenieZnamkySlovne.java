package zadania;

import java.text.Normalizer;
import java.util.Scanner;

public class PriradenieZnamkySlovne {

    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);

        for (;;) {

            System.out.println("Zadaj znamku slovne: ");
            String odpoved = skener.next();

            String normalizedString = Normalizer.normalize(odpoved,Normalizer.Form.NFKD).replaceAll("[^\\p{ASCII}]", "").toLowerCase().replaceAll("\\s{2,}", " ").trim();

            //System.out.println("Normalized: "+normalizedString );

            if(normalizedString.equals("vyborny")){
                System.out.println("1");
            } else if (normalizedString.equals("chvalitebny")) {
                System.out.println("2");
            } else if (normalizedString.equals("dobry")) {
                System.out.println("3");
            } else if (normalizedString.equals("dostatocny")) {
                System.out.println("4");
            } else if (normalizedString.equals("nedostatocny")) {
                System.out.println("5");
            } else if (normalizedString.equals("koniec")) {
                break;
            } else {
                System.out.println("Nespravny text");
            }
        }
    }
}
