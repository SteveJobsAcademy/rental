package retail;

public abstract class Ville extends Flat {

    public Ville(String name, double mq, double distanceFromSea) {
        super(name, mq, distanceFromSea);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public abstract String toDo();
    
}