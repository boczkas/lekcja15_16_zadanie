import klient.Klient;
import klient.TypKlienta;
import sklep.Sklep;

import java.util.ArrayList;
import java.util.List;

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
