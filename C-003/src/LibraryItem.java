public class LibraryItem {
    String title;
    int year;

    public LibraryItem(String title, int year){
        this.title=title;
        this.year=year;
    }

    public void printInformation() {
        System.out.println(this.title);
        System.out.println(this.year);
    }
}
