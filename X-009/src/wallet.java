import java.util.Arrays;
import java.util.Scanner;

public class wallet {
    public static EuroCoin[] addToWallet(EuroCoin[] wallet) {
        Scanner input = new Scanner(System.in);
        boolean addInput=true;
        System.out.println("Add Coins to Wallet.Options are:\n 2euro, 1euro,50cent, 20cent, 10cent, 5cent, 2cent, 1cent, show wallet, quit\n");
        while (addInput) {
            wallet= Arrays.copyOf(wallet,wallet.length+1);
            String coin = input.nextLine();
            switch (coin){
                case "2euro":
                    wallet[wallet.length-1]=EuroCoin.twoEuro;
                    break;
                case "1euro":
                    wallet[wallet.length-1]=EuroCoin.oneEuro;
                    break;
                case "50cent":
                    wallet[wallet.length-1]=EuroCoin.fiftyCent;
                    break;
                case "20cent":
                    wallet[wallet.length-1]=EuroCoin.twentyCent;
                    break;
                case "10cent":
                    wallet[wallet.length-1]=EuroCoin.tenCent;
                    break;
                case "5cent":
                    wallet[wallet.length-1]=EuroCoin.fiveCent;
                    break;
                case "2cent":
                    wallet[wallet.length-1]=EuroCoin.twoCent;
                    break;
                case "1cent":
                    wallet[wallet.length-1]=EuroCoin.oneCent;
                    break;
                case "show wallet":
                    System.out.println(Arrays.toString(wallet));
                    wallet=Arrays.copyOf(wallet,wallet.length-1);
                    break;
                case "quit":
                    wallet=Arrays.copyOf(wallet,wallet.length-1);
                    addInput=false;
                    break;
                default:
                    wallet=Arrays.copyOf(wallet,wallet.length-1);
                    System.err.println("input not accepted");
                    break;
            }
        }
        return wallet;
    }

}
