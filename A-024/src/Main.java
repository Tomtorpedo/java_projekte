
public class Main {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.print(i+": ");
            for (int k=1;k<=10;k++) {
                System.out.print(k + "x" + i + "=" + (i * k) + ", ");
            }
            System.out.print("\n");
        }
    }
}