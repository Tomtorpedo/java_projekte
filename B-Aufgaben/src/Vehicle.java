public class Vehicle implements Refuelable{
    //variables
    private String model;
    private int mileage;
    private float tank;
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

    public String getModel(){
        return this.model;
    }

    public int getMileage(){
        return this.mileage;
    }

    public void setMileage(int Mileage){
        if (Mileage<0)
            throw new IllegalArgumentException("Invalid milage: "+Mileage);
        this.mileage=Mileage;
    }

    public void setModel(String Model){
        if (Model==null || Model.isEmpty())
            throw new IllegalArgumentException("Invalid model: "+Model);
        this.model=Model;
    }


}
