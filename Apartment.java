package retail;

public class Apartment extends Flat{
  
    
    public Apartment(String name, double mq, double distanceFromSea) {
        super(name, mq, distanceFromSea);
    }

    @Override
    public double getPrice() {
        if (super.getDistance() <= 200) {
            return 2000 * super.getMq();
        } else if (super.getDistance() <= 1000) {
            return 1500 * super.getMq();
        } else {
            return 1000 *super.getMq();
        }
    }

    
}