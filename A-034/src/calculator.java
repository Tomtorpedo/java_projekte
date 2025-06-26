public class calculator {
    double intermediateResult=0;
    //
    public void plus(double a) {
        intermediateResult+=a;
    }
    public void minus(double a) {
        intermediateResult-=a;
    }
    public void multiply(double a) {
        intermediateResult*=a;
    }
    public void devide(double a) {
        intermediateResult/=a;
    }
    public double solve() {
        return intermediateResult;
    }

}
