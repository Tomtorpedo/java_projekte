import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EuroCoin[] euroWallet=new EuroCoin[0];
        euroWallet= wallet.addToWallet(euroWallet);
        System.out.println("wie viele cents sollen es sein?");
        Scanner input = new Scanner(System.in);
        int cents=input.nextInt();
        if (CashRegister.isBuyable(cents,euroWallet))
            System.out.println("you're rich enough");
        else
            System.err.println("you're broke AF");
    }

}