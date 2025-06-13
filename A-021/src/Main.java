import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(42069);
        int i = 438675002;
        int k = 100;
        while (i != 1_101_300_066) {
            i = rand.nextInt();
            System.out.println(k);
            k -= 10;
        }

        /*
        int i=100;
        do {
            System.out.println(i);
            i-=10;
        }
        while (i>=40);

         */
        /*
        for (int i = 100;i>=40;i-=10){
            System.out.println(i);
        }

         */
    }
}