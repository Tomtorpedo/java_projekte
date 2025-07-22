public class Vehicle implements Refuelable{
    //variables
    String model;
    int mileage;
    float liters;
    //constructor
    public Vehicle(String Model, int Mileage) {
        this.model=Model;
        this.mileage=Mileage;
    }
    //methods

    @Override
    public void refuel(float liters) {
        this.liters=liters;
    }

    @Override
    public String toString() {
        return"\nmodel: "+this.model+", mileage: "+this.mileage;
    }
    //refuel wird als interface implementiert um auch E-Autos abbilden zu können, da diese ja nicht tanken
}
