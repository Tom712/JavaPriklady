package zadania;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Zadanie1datum {
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    public static void main(String[] args) {
        String ANSI_RED = "\u001B[31m";


        LocalDate lc = LocalDate.now(); // Aktualny datum
        LocalDate lc1 = LocalDate.of(2023, 6, 20); // Konkretny datum
        //System.out.println(lc);
        //System.out.println(lc1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = lc1.format(dtf);
        //System.out.println(formattedDate);

        LocalDate birth = LocalDate.of(2000, 4, 3);
        LocalDate datumKedy = LocalDate.of(2022, 6, 18);
        float znamka = 1.5f;
        int rok = 2022;

        String birthFormatted = birth.format(dtf);
        String datumKedyFormatted = lc.format(dtf);

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(2);

        System.out.printf(  ANSI_RED + "Študent Jozef Mrkvička sa narodil "  + birthFormatted  + ANSI_YELLOW +", z maturitnej skúšky má známku " + ANSI_RED + decimalFormat.format( znamka) + ANSI_GREEN +" a od septembra "  + rok  + ANSI_BLUE  +" nastúpi do nového zamestnania ako Java programátor.\nV Bratislave dňa " + datumKedyFormatted +ANSI_RESET );






    }


}
