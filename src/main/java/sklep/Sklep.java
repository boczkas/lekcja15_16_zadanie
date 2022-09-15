package sklep;

import klient.Klient;
import klient.TypKlienta;

import java.util.List;

public class Sklep {

    public void obsluzKlientow(List<Klient> klienci) throws ZlodziejWSklepieException {
        for (Klient klient : klienci) {
            if (klient.getTypKlienta() != TypKlienta.ZLODZIEJ) {
                System.out.println("Witaj drogi " + klient.getImie());
                if (klient.getTypKlienta().equals(TypKlienta.STALY)) {
                    System.out.println("Otrzymujesz znizke 5%!");
                }
            } else {
                throw new ZlodziejWSklepieException();
            }
        }
    }
}
