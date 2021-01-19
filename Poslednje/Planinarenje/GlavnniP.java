package planinarenje;

import java.util.ArrayList;
import java.util.List;

public class GlavnniP {

	public static void main(String[] args) {
		
		List<Planinar> planinari = new ArrayList<Planinar>();
		
		Planinar p1=new KlasicniPlaninar("Petar", "Petrovic", "Srbija");
		Planina planina= new Planina("Avala", 511, planinari);
		Alpinista a1=new Alpinista("Mira", "Miric", "BiH");
		Alpinista a2= new Alpinista("Jovan","Jovanovic", "Crna Gora");
		
		planina.dodajPlaninara(p1);
		planina.ispisiPlaniare();
		System.out.println(planina);
		System.out.println(a1);
		
		a1.setPartner(a2);

	}

}
