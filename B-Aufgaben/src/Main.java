public class Main {
    public static void main(String[] args) {
        Car car = new Car("VW Golf",42617);
        Motorcycle motorcycle = new Motorcycle("Simson Schwalbe",9876,true);
        System.out.println(car.toString());
        System.out.println(motorcycle.toString());
//        car.start();
//        motorcycle.start();
    }
}