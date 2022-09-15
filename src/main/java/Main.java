import klient.Klient;
import klient.TypKlienta;
import sklep.Sklep;

import java.util.ArrayList;
import java.util.List;

// Na konsoli ma się pojawić:
//  Witaj drogi Przemek
//  Witaj drogi Tomek
//  Otrzymujesz znizke 5%!
//  Zlodziej w sklepie! Ewakuacja!

//  Program ma się zakończyc bez pojawienia sie wyjatku
public class Main {
    public static void main(String[] args) {
        List<Klient> klienci = new ArrayList<>();
        klienci.add(new Klient("Przemek", TypKlienta.ZWYKLY));
        klienci.add(new Klient("Tomek", TypKlienta.STALY));
        klienci.add(new Klient("Kradziej", TypKlienta.ZLODZIEJ));

        Sklep sklep = new Sklep();

//        Napraw!
        sklep.obsluzKlientow(klienci);
    }
}
