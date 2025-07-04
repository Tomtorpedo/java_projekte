public class BankAccountWithLimit extends BankAccount{
    long limit;
    BankAccountWithLimit(long Limit) {
        super();
        this.limit=Limit;
    }
    BankAccountWithLimit(String AccHolder,long Limit) {
        super(AccHolder);
        this.limit=Limit;
    }
    BankAccountWithLimit(long Balance, long Limit) {
        super(Balance);
        this.limit=Limit;
    }
    //Headconstructor
    BankAccountWithLimit(String AccHolder,long Balance, long Limit) {
        super(AccHolder,Balance);
        this.limit=Limit;
    }
    //Methoden
    @Override
    public void withdraw(long Ammount) {
        if (this.balance+limit-Ammount<0) {
            System.err.println("Du bist zu arm für die Transaktion");
            return;
        }
        this.balance-=Ammount;
    }

}
