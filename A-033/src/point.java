public class point {
    int x=3;
    int y=4;
    //constructor
    public point(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public String createRepresentation() {
        return "("+x+", "+y+")";
    }
}
