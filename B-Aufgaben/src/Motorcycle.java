public class Motorcycle extends  Vehicle {
    //methods
    boolean isPillionRiderCapable;

    public Motorcycle(String Model, int Mileage, boolean isPillionRiderCapable) {
        super(Model, Mileage);
        this.isPillionRiderCapable=isPillionRiderCapable;
    }

    @Override
    void printInformation() {
        super.printInformation();
        System.out.print(", isPillionRiderCapable: "+isPillionRiderCapable);
    }
}
