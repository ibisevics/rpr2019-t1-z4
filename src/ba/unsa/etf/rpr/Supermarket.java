package ba.unsa.etf.rpr;

import java.util.*;
import ba.unsa.etf.rpr.Korpa;

public class Supermarket {
    private Artikl[] artikli;
    private int brojArtikala;

    public Supermarket(Artikl[] artikli) {
        this.artikli = artikli;
        this.brojArtikala = 0;
    }

    public Supermarket() {
        this.artikli = new Artikl[1000];
        this.brojArtikala = 0;
    }


    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
        this.brojArtikala = artikli.length;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl biciklo) {
        if (this.brojArtikala < 1000) {
            artikli[brojArtikala] = biciklo;
            this.brojArtikala++;
            return true;
        }
        return false;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < brojArtikala; i++) {
            if (this.artikli[i].kod.equals(kod)) {
                Artikl izbaceni = artikli[i];
                artikli[i] = artikli[brojArtikala-1];
                artikli[brojArtikala-1] = null;
                brojArtikala--;
                return izbaceni;
            }
        }
        return null;
    }
}
