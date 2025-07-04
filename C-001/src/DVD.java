public class DVD extends LibraryItem {
    int duration;

    public void printInformation() {
        System.out.println(this.title);
        System.out.println(this.year);
        System.out.println(this.duration);
    }
}
