public class Motorcycle extends  Vehicle implements Startable {
    //methods
    boolean isPillionRiderCapable;

    public Motorcycle(String Model, int Mileage,float Tank, boolean isPillionRiderCapable) {
        super(Model, Mileage, Tank);
        this.isPillionRiderCapable=isPillionRiderCapable;
    }

    @Override
    public String toString() {
        return super.toString()+", isPillionRiderCapable: "+isPillionRiderCapable;
    }

    @Override
    public String start() {
        return "prött prött prött";
    }
}
