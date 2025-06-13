public class Main {
    public static void main(String[] args) {
        char a = ' ';
        char b = '*';
        int height=3;
        int schaftLaenge=8;
        int nuesse=4;
        int breite=height;
        if (nuesse>height){
            breite=nuesse;
        }
        for(int hTree=0;hTree<height;hTree++) {
            for(int i = 0; i<breite-hTree;i++){
                System.out.print(a);
            }
            for(int i=0;i<  (hTree*2)+1;i++) {
                System.out.print(b);
            }
            System.out.print("\n");
        }
        for(int i = 0;i<schaftLaenge;i++) {
            for (int k=0;k<breite-1;k++) {
                System.out.print(a);
            }
            for (int k=0; k<3;k++) {
                System.out.print(b);
            }
            System.out.print("\n");
        }
        for(int i=0;i<nuesse;i++) {
            for(int k = 0; k<breite-nuesse-1;k++){
                System.out.print(a);
            }
            for(int k=0;k<  (nuesse*2)+1;k++) {
                System.out.print(b);
            }
            System.out.print("\n");
        }
    }
}