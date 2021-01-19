package planinarenje;

import java.util.List;

public class Planina {
	
	private String ime;
	private int visina;
	private List<Planinar> planinari;
	
	public Planina(String ime, int visina, List<Planinar> planinari) {
		this.ime = ime;
		this.visina = visina;
		this.planinari = planinari;
	}

	public String getIme() {
		return ime;
	}

	public int getVisina() {
		return visina;
	}
	
	public void dodajPlaninara(Planinar p) {
		planinari.add(p);
	}
	
	public int brojPlaninara() {
		return planinari.size();
	}
	
	public void ispisiPlaniare() {
		for(int i = 0; i < planinari.size(); i++) {
			System.out.println(planinari.get(i).toString());
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append("(").append(visina).append(")");
		return sb.toString();
	}
	
}
