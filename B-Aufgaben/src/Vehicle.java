public class Vehicle implements Refuelable{
    //variables
    String model;
    int mileage;
    float tank;
    //constructor
    public Vehicle(String Model, int Mileage,float Tank) {
        this.model=Model;
        this.mileage=Mileage;
        this.tank=Tank;
    }
    //methods

    @Override
    public void refuel(float liters) {
        this.tank+=liters;
    }

    @Override
    public String toString() {
        return"\nmodel: "+this.model+", mileage: "+this.mileage;
    }
    //refuel wird als interface implementiert um auch E-Autos abbilden zu können, da diese ja nicht tanken
}
