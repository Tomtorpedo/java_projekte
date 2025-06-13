public class Main {
    public static void main(String[] args) {
        char a = ' ';
        char b = '*';
        int height=100;
        int heightOfTrunk=4;
        for(int hTree=0;hTree<height;hTree++) {
            for(int i = 0; i<height-hTree-1;i++){
                System.out.print(a);
            }
            for(int i=0;i<  (hTree*2)+1;i++) {
                System.out.print(b);
            }
            System.out.print("\n");
        }
        for(int i = 0;i<heightOfTrunk;i++) {
            for (int k=0;k<height-2;k++) {
                System.out.print(a);
            }
            for (int k=0; k<3;k++) {
                System.out.print(b);
            }
            System.out.print("\n");
        }
    }
}