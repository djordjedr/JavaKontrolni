package planinarenje;

public class KlasicniPlaninar extends Planinar{

	public KlasicniPlaninar(String ime, String prezime, String zemljaPorekla) {
		super(ime, prezime, zemljaPorekla);
	}
	
	public boolean penjiSe(int visina) {
		boolean popeoSe = false;
		if (visina <= 2000)
			popeoSe = true;
		return popeoSe;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//sb.append("K_").append(super.toString());
		sb.append("K_").append(getIme()).append("-").append(getZemljaPorekla());
		return sb.toString();
	}
	
	
	
}
