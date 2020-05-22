package retail;

public abstract class Flat {
    private String name;
    private double mq;
    private double distanceFromSea;
    // NON METTO VOLONTARIAMENTE PRICE
    // price dipendente mq distanceFromSea
    public Flat(String name, double mq, double distanceFromSea) {
        this.name = name;
        this.mq = mq;
        this.distanceFromSea= distanceFromSea;
    }

    public void setMq(double newMq) {
        this.mq = newMq;
    }

    public double getMq() {
        return this.mq;
    }

    public abstract double getPrice(); // {}

    public void setDistance(double distance) {
        this.distanceFromSea = distance;
    }
    public double getDistance() {
        return this.distanceFromSea;
    }

    public String toString() {
        return this.name + " " + this.mq + " " + this.distanceFromSea;
    }
}