public class Vehicle {
    //variables
    String model;
    int mileage;
    //constructor
    public Vehicle(String Model, int Mileage) {
        this.model=Model;
        this.mileage=Mileage;
    }
    //methods
    void printInformation() {
        System.out.print("\nmodel: "+this.model+", mileage: "+this.mileage);

    }
}
