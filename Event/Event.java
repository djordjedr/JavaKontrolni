package domaciGrupaIX.event;

/*
Napraviti klasu event koja sadrzi podatke o vremenu, mestu odrzavanja dogadjaja i tip (koncert, utakmica, vencanje…)
Uvezati ove dve klase i u glavnom programu se igrati sa njima.
 */

public class Event {

    private String datum;
    private Dvorana mesto;
    private String tipEventa;

    public Event(String datum, Dvorana mesto, String tipEventa) {
        this.datum = datum;
        this.mesto = mesto;
        this.tipEventa = tipEventa;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public Dvorana getMesto() {
        return mesto;
    }

    public void setMesto(Dvorana mesto) {
        this.mesto = mesto;
    }

    public String getTipEventa() {
        return tipEventa;
    }

    public void setTipEventa(String tipEventa) {
        this.tipEventa = tipEventa;
    }

    @Override
    public String toString() {
        return "Event{" +
                "datum='" + datum + '\'' +
                ", mesto=" + mesto +
                ", tip dogadjaja='" + tipEventa + '\'' +
                '}';
    }
}
