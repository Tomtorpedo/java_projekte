import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] random = new int[40];
        for (int i = 0; i < random.length; i++) {
            random[i]=(int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(random));
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));
        int newArray[]={6,17,101,23,42};
        for (int i=0;i<newArray.length;i++) {
            if (0>Arrays.binarySearch(random,newArray[i]))
                System.out.println(newArray[i]+": not found");
        }
        int pointerKopie[]=random.clone();
        int komplettKopie[]=Arrays.copyOf(random,random.length);
        int array45[]=Arrays.copyOf(random,random.length+5);
        int array10[]=Arrays.copyOf(random,10);
        System.out.println("pointerKopie: "+Arrays.toString(pointerKopie));
        System.out.println("komplettkopie: "+Arrays.toString(komplettKopie));
        System.out.println("array45: "+Arrays.toString(array45));
        System.out.println("array10: "+Arrays.toString(array10));

    }
}