public class Car extends Vehicle implements Startable {
    public Car(String Model, int Mileage, float Tank) {
        super(Model, Mileage, Tank);
    }

    @Override
    public String start() {
        return "wroom";
    }
}
