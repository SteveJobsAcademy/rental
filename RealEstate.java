package retail;

import java.util.ArrayList;

public class RealEstate {
    private String name;
    private ArrayList<Flat> flats = new ArrayList<>();

    public RealEstate(String name) {
        this.name = name;
    }

    public Apartment addApartment(String  name, double mq, double distanceFromSea) {
        Apartment a = new Apartment(name, mq, distanceFromSea);
        this.flats.add(a);
        return a;
    }
    public Farm addFarm(String  name, double mq, double distanceFromSea) {
        Farm a = new Farm(name, mq, distanceFromSea);
        this.flats.add(a);
        return a;
    }

    public ArrayList<Flat> getApartments() {
        return this.flats;
    }

    public String toString() {
        return this.name;
    }
}