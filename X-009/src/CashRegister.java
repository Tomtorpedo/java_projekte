public class CashRegister {
    public static boolean isBuyable(int amountInCents, EuroCoin[] coins){
        return amountInCents <= getBalance(coins);
    }
    static int getBalance(EuroCoin[] coins) {
        int balance=0;
        for (EuroCoin coin:coins) {
            balance+=coin.getCents();
        }
        return balance;
    }
}
