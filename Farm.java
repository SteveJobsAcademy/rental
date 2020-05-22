package retail;

public class Farm extends Flat {
    public Farm(String name, double mq, double distanceFromSea) {
        super(name, mq, distanceFromSea);
    }

    @Override
    public double getPrice() {
        return this.getMq() * 100;
    }

    public String toDo() {
        return "Ciao";
    }
}