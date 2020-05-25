package retail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RealEstate {
    private String name;
    private String path;
    private ArrayList<Flat> flats = new ArrayList<>();

    public RealEstate(String name) {
        this.name = name;
    }

    public RealEstate(String name, String path) throws IOException {
        this.name = name;
        this.path = path;
        FileReader fr = new FileReader(this.path);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null) {
            String[] strings= line.split("#");
            Apartment a = new Apartment(strings[0], Double.valueOf(strings[1]), Double.valueOf(strings[2]));
            this.flats.add(a);
            line = br.readLine();
        }
        br.close();
    }

    public Apartment addApartment(String  name, double mq, double distanceFromSea) throws IOException {
        Apartment a = new Apartment(name, mq, distanceFromSea);
        this.flats.add(a);
        if (this.path != null) {
            FileWriter fr = new FileWriter(this.path, true);
            fr.write("\n"+ name + "#" + mq + "#" + distanceFromSea);
            fr.close();
        }
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