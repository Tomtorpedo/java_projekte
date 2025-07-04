import java.util.UUID;
public class BankAccount {
    String accID;
    String accHolder;
    long balance;
    BankAccount(){
        this("n.n.",0); //calls Superconstructer
    }
    BankAccount(String accHolder){
        this(accHolder,0);  //calls Superconstructer
    }
    BankAccount(long balance) {
        this("n.n.",balance);   //calls Superconstructer
    }

    //Superconstructor
    BankAccount(String accHolder,long balance) {
        this.accID=UUID.randomUUID().toString();
        this.accHolder=accHolder;
        this.balance=balance;
        System.out.println(this.getInfo());
    }
    String getInfo(){
        return "Konto "+accID+" wurde für "+accHolder+" angelegt: "+(balance/100.0)+" EUR";
    }

}
