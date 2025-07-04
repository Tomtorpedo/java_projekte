import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount test= new BankAccount("test",100000);
        test.deposit(new Scanner(System.in).nextLong());
        test.withdraw(new Scanner(System.in).nextLong());
        System.out.println(test.getInfo());
    }
}