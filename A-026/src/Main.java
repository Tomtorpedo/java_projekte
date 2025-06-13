public class Main {
    public static void main(String[] args) {
        int summe=0;
        while (true){
            System.out.print("Gib eine Zahl ein: ");
            int number = new java.util.Scanner(System.in).nextInt();
            if (number==0) {
                System.err.print("Zahl ist Null!");
                break;
            }
            else if (number<0) {
                System.err.print("Zahl ist zu klein!\n");
                wait(100);
                continue;
            }
            summe+=number;
            System.out.println("Summe:"+summe);
        }
    }
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
