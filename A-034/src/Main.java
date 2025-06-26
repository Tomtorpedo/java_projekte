public class Main {
    public static void main(String[] args) {
        calculator rechnung= new calculator();
        rechnung.intermediateResult=2;
        rechnung.plus(4);
        rechnung.devide(2);
        rechnung.multiply(17.5);
        rechnung.minus(10.5);
        System.out.println(rechnung.solve());
    }
}