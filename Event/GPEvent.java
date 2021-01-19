package domaciGrupaIX.event;

public class GPEvent {

    public static void main(String[] args) {

        Dvorana d1 = new Dvorana("Ledena dvorana Pionir", "Beograd", 1200);
        Dvorana d2 = new Dvorana("Arena", "Beograd", 10000);
        Dvorana d3 = new Dvorana("Wembley", "London", 5000);
        Dvorana d4 = new Dvorana("Hala sportova", "Novi Beograd", 3000);

        System.out.println(d4.toString());

        Event e1 = new Event("25.1.2012.", d1, "sport");
        Event e2 = new Event("10.3.2022.", d3, "pop/rock");

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        e2.setMesto(d2);
        e2.setDatum("11.3.2022.");
        System.out.println(e2.toString());

    }

}
