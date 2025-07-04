public class DVD extends LibraryItem {
    int duration;

    public DVD(String title, int year, int duration) {
        super(title, year);
        this.duration=duration;
    }

    public void printInformation() {
        System.out.println(this.title);
        System.out.println(this.year);
        System.out.println(this.duration);
    }
}
