public class Main {
    public static void main(String[] args) {
        point p1= new point();
        point p2= new point(69,42);
        String p1Co=p1.createRepresentation();
        String p2Co=p2.createRepresentation();
        System.out.println(p1Co);
        System.out.println(p2Co);

    }
}