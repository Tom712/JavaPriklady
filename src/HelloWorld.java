// Kazdy program bude zacinat triedou, cize musime pouzit klucove slovo class a obycajne aj v spojenie s public
// Nazov triedy koresponduje s konvenciou Camel, cize budeme pouzivate velke a male pisme a viacere slova oddelime velkymi pismenami
public class HelloWorld {
    public static void main(String[] args) { // Metoda main je dolezita pre spustenie programu
        System.out.println("Hello, World!"); // System.out.println je kombinacia Java prikazov, ktore vypisuju do "konzoly" = Run dialogu a zaroven text potvrdia "Enter-om"
        System.out.println("Ján Žitniak");
        System.out.println("Online kurz Java Developer Junior");
        System.out.print("Nejaky text c.1");
        System.out.print("\nNejaky text c.2");
        System.out.print("Nejaky text c.3");
        System.out.println("\tNejaky text c.4");
        System.out.println("\tNejaky text c.5");
        //TODO vyskusat dalsie escape charaktery


        System.out.println("text pred backspace \btext za backspace ");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa \f Escape character \\f "); // sluzi na tlacenie na novej strane ked sa pouziva tlaciaren
        System.out.println("\'Vzor na jednu uvodzovku");
        System.out.println("\"Vzor na uvodzovky\"");
        System.out.println("Vzor na vlozenie lomitka \\");
        System.out.println("tento text pred \\r neuvidite .....  \rtext za \\r ");
    }
} // AltGr + n  vlozi zlozenu zatvorku, teda }