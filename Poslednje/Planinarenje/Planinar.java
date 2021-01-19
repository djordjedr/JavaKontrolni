package planinarenje;

public class Planinar {
	
	private String ime;
	private String prezime;
	private String zemljaPorekla;
	
	public Planinar(String ime, String prezime, String zemljaPorekla) {
		this.ime = ime;
		this.prezime = prezime;
		this.zemljaPorekla = zemljaPorekla;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getZemljaPorekla() {
		return zemljaPorekla;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append("-").append(zemljaPorekla);
		return sb.toString();
	}
	
	
	
}
