package ba.unsa.etf.rpr;

import java.util.ArrayList;
import ba.unsa.etf.rpr.Supermarket;

public class Korpa {
    private Artikl[] artikli;
    private int brojArtikala;

    public Korpa(Artikl[] artikli) {
        this.artikli = artikli;
        this.brojArtikala = artikli.length;
    }
    public Korpa() {
        this.artikli = new Artikl[50];
        this.brojArtikala = 0;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
        this.brojArtikala = artikli.length;
    }

    public boolean dodajArtikl(Artikl a) {
        if (brojArtikala < 50) {
            artikli[brojArtikala] = a;
            brojArtikala++;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i =  0; i < brojArtikala; i++ ) {
            if (artikli[i].kod.equals(kod)) {
                Artikl izbaceni = artikli[i];
                artikli[i] = artikli[brojArtikala-1];
                artikli[brojArtikala-1] = null;
                brojArtikala--;
                return izbaceni;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for(int i = 0; i < brojArtikala; i++) {
            ukupnaCijena += this.artikli[i].cijena;
        }
         return ukupnaCijena;
    }
}
