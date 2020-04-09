package ba.unsa.etf.rpr;
import java.lang.*;


public class Artikl {
    String naziv;
    int cijena;
    String kod;

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    public Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public Artikl(Artikl biciklo) {
        this.naziv = biciklo.naziv;
        this.cijena = biciklo.cijena;
        this.kod = biciklo.kod;
    }
}
