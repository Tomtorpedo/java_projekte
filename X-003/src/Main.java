//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        long microsPerDay = 24 * 60 * 60 * 1000 * 1000;
        long millisPerDay = 24 * 60 * 60 * 1000;
        System.out.println(microsPerDay / millisPerDay);
    }
}