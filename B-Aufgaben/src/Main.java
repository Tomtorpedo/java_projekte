public class Main {
    public static void main(String[] args) throws GarageException {
        Car car = new Car("VW Golf",42617,13.4F);
        Motorcycle motorcycle = new Motorcycle("Simson Schwalbe",9876, 2.5F,true);
        car.setModel("Fiat Multipla");
        car.setMileage(5);
        Garage g1=new Garage();
        g1.replaceEngine(car,"porsche cayman s",0);
        System.out.println(car);
        System.out.println(motorcycle);
    }
}