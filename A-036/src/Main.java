public class Main {
    public static void main(String[] args) {
        double result1=
                new calculator(2)
                        .plus(4)
                        .devide(2)
                        .multiply(17.5)
                        .minus(10.5)
                        .solve();
        double result2=
                new calculator()
                        .minus(4)
                        .multiply(3)
                        .plus(46)
                        .devide(2)
                        .solve();
        System.out.println(result1);
        System.out.println(result2);

    }
}