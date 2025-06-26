public class Main {
    public static void main(String[] args) {
        calculator rechnung = new calculator();
        double result=
                rechnung.plus(2)
                        .plus(4)
                        .devide(2)
                        .multiply(17.5)
                        .minus(10.5)
                        .solve();
        System.out.println(result);
    }
}