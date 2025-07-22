public abstract class Vehicle {
    //variables
    String model;
    int mileage;
    //constructor
    public Vehicle(String Model, int Mileage) {
        this.model=Model;
        this.mileage=Mileage;
    }
    //methods

    @Override
    public String toString() {
        return"\nmodel: "+this.model+", mileage: "+this.mileage;
    }
    public abstract void start();
}
