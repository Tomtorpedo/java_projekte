import java.util.Scanner;
import java.util.UUID;
public class BankAccount {
    String accID;
    String accHolder;
    long balance;
    BankAccount(){
        this("n.n.",0); //calls Headconstructer
    }
    BankAccount(String accHolder){
        this(accHolder,0);  //calls Headconstructer
    }
    BankAccount(long balance) {
        this("n.n.",balance);   //calls Headconstructer
    }

    //Headconstructor
    BankAccount(String accHolder,long balance) {
        this.accID=UUID.randomUUID().toString();
        this.accHolder=accHolder;
        this.balance=balance;
        System.out.println(this.getInfo(true));
    }
    //Methods
    String getInfo(boolean init){
        return "Konto "+accID+" wurde für "+accHolder+" angelegt: "+(balance/100.0)+" EUR";
    }

    String getInfo() {
        return "Konto "+accID+" von "+accHolder+" : "+(balance/100.0)+" EUR";
    }
    public void deposit(long Ammount) {
        this.balance+=Ammount;
    }

    public void withdraw(long Ammount) {
        this.balance-=Ammount;
    }

}
