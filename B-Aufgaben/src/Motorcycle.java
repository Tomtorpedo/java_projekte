public class Motorcycle extends  Vehicle {
    //methods
    boolean isPillionRiderCapable;

    public Motorcycle(String Model, int Mileage, boolean isPillionRiderCapable) {
        super(Model, Mileage);
        this.isPillionRiderCapable=isPillionRiderCapable;
    }

    @Override
    public String toString() {
        return super.toString()+", isPillionRiderCapable: "+isPillionRiderCapable;
    }

    @Override
    public void start() {
        System.out.println("prött prött prött");
    }
}
