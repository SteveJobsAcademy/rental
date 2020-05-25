package retail;
import java.io.IOException;

public class MainIO {
    public static void main(String args[]) throws IOException {
        RealEstate r = new RealEstate
            ("Agenzia di case", "/Users/carloleonardi/Documents/workspace/JavaProjects/TestVSCode/retail/houses.txt");
        r.addApartment("Quarto Appartamento", 200, 100);
        for (Flat a: r.getApartments()) {
            System.out.println(a);
        }

    }
    
}