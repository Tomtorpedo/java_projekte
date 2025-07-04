public class Main {
    public static void main(String[] args) {
        System.out.println(fib(-1));
    }
    static long fib(int n) {
        if (n<0){
            throw new RuntimeException("n is to low");
        }
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}