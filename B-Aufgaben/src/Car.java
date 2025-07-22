public class Car extends Vehicle implements Startable {
    public Car(String Model, int Mileage) {
        super(Model, Mileage);
    }

    @Override
    public String start() {
        return "wroom";
    }
}
