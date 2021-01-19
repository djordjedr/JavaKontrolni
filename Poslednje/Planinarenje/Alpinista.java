package planinarenje;

public class Alpinista extends Planinar {
	
	private Alpinista partner;

	public Alpinista(String ime, String prezime, String zemljaPorekla) {
		super(ime, prezime, zemljaPorekla);
	}
	
	public boolean penjiSe(int visina) {
		boolean popeoSe = false;
		if (visina > 3000 && partner != null)
			popeoSe = true;
		return popeoSe;
	}

	public Alpinista getPartner() {
		return partner;
	}

	public void setPartner(Alpinista buduciPartner) {
		if (this.partner == null && buduciPartner.partner == null) {
			this.partner = buduciPartner;
			buduciPartner.partner = this;
		}
	}
	
	public void ukloniPartnera() {
		partner.partner = null;
		this.partner = null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//sb.append("K_").append(super.toString());
		sb.append("A_").append(getIme()).append("-").append(getZemljaPorekla());
		return sb.toString();
	}
}
