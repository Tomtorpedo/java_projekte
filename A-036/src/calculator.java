public class calculator {
    double intermediateResult=0;
    //
    public calculator() {
    }
    public calculator(double Startwert) {
        this.intermediateResult=Startwert;
    }
    public calculator plus(double a) {
        this.intermediateResult+=a;
        return this;
    }
    public calculator minus(double a) {
        this.intermediateResult-=a;
        return this;
    }
    public calculator multiply(double a) {
        this.intermediateResult*=a;
        return this;
    }
    public calculator devide(double a) {
        this.intermediateResult/=a;
        return this;
    }
    public double solve() {
        return intermediateResult;
    }

}
