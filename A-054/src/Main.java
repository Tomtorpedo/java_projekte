import de.hsbund.dacs.oop.a056.bank.BankAccountWithLimit;

public class Main {
    public static void main(String[] args) {
        BankAccountWithLimit test= new BankAccountWithLimit(100000,20000);
        test.deposit(50000);
        test.withdraw(175000);
        System.out.println(test.getInfo());
    }
}