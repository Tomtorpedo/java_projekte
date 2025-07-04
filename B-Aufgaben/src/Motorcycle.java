public class Motorcycle extends  Vehicle {
    //methods
    boolean isPillionRiderCapable;

    public Motorcycle(String Model, int Mileage, boolean isPillionRiderCapable) {
        super(Model, Mileage);
        this.isPillionRiderCapable=isPillionRiderCapable;
    }

    @Override
    public String toString() {
        return"\nmodel: "+this.model+", mileage: "+this.mileage+", isPillionRiderCapable: "+isPillionRiderCapable;
    }
}
