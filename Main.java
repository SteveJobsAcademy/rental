package retail;

public class Main {
    public static void main(String args[]) {
        RealEstate r = new RealEstate("Pippo");
        r.addApartment("Camilla", 500, 200);
        Apartment m = r.addApartment("Casa di Montalbano", 400, 2);

        r.addApartment("Casa di Berlusoni", 5000, 4000);

        for (Flat a: r.getApartments()) {
            System.out.println(a);
        }

        m.setMq(800);

        for (Flat a: r.getApartments()) {
            System.out.println(a);
        }

        

        // Flat f = new Flat();
    }
}