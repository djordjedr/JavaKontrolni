package domaciGrupaIX.event;

//Napraviti klasu dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se nalazi i kapacitetu (broju mesta).

public class Dvorana {

    private String naziv;
    private String adresa;
    private int kapacitet;

    public Dvorana(String naziv, String adresa, int kapacitet) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.kapacitet = kapacitet;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(int kapacitet) {
        this.kapacitet = kapacitet;
    }

    @Override
    public String toString() {
        return "Dvorana " + naziv  + ", " + adresa + ", " + "kapacitet mesta: " + kapacitet;
    }
}
