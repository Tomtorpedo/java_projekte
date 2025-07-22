public class Car extends Vehicle {
    public Car(String Model, int Mileage) {
        super(Model, Mileage);
    }

    @Override
    public void start() {
        System.out.println("wroom");
    }
}
