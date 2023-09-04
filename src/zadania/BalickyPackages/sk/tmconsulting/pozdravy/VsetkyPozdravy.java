package zadania.BalickyPackages.sk.tmconsulting.pozdravy;

import zadania.BalickyPackages.sk.tmconsulting.pozdravy.anglicky.Hello;
import zadania.BalickyPackages.sk.tmconsulting.pozdravy.madarsky.Szia;
import zadania.BalickyPackages.sk.tmconsulting.pozdravy.nemecky.Hallo;
import zadania.BalickyPackages.sk.tmconsulting.pozdravy.slovensky.Ahoj;

public class VsetkyPozdravy {
    public static void main(String[] args) {
        Hello.pozdravujem();
        Szia.pozdravujem();
        Hallo.pozdravujem();
        Ahoj.pozdravujem();

        // Dynamicke volanie metod
        // Ak chceme volat nestaticke metody, musime najprv vytvorit objekt alebo instanciu triedy

        Hello helloObjekt=new Hello(); // vytvorili sme objekt/instanciu triedy Hello
        helloObjekt.pozdravujemDynamicky("Peter");

        Szia sziaObjekt=new Szia(); // vytvorili sme objekt/instanciu triedy Szia
        sziaObjekt.pozdravujemDynamicky("Peter");

        Hallo halloObjekt=new Hallo(); // vytvorili sme objekt/instanciu triedy Hallo
        halloObjekt.pozdravujemDynamicky("Peter");

        Ahoj ahojObjekt=new Ahoj(); // vytvorili sme objekt/instanciu triedy Ahoj
        ahojObjekt.pozdravujemDynamicky("Peter");

    }
}
