import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand=new Random(1234);
        int i = 0;
        while (i != 1_362_132_786) {
            i = rand.nextInt();
            System.out.println(i);
        }


    }
}