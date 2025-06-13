public class Main {
    public static void main(String[] args) {
        for (int b=0;b<=100;b++){
            for (int a =0;a<=b;a++){
                if ((a+b)%40==0){
                    System.out.println(a+"+"+b+"="+(a+b));
                }
            }
        }
    }
}