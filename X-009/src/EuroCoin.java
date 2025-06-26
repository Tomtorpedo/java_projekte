public enum EuroCoin {
    //Münzen, anzahl der Münzen
    twoEuro(200),
    oneEuro(100),
    fiftyCent(50),
    twentyCent(20),
    tenCent(10),
    fiveCent(5),
    twoCent(2),
    oneCent(1);

    //initialisierung der konstanten
    final int cents;

    //constructor
     EuroCoin(int Cents) {
         cents=Cents;
     }
    int getCents() {
         return cents;
     }
}
