public class Book extends LibraryItem {
    String author;
    public void printInformation() {
        System.out.println(this.title);
        System.out.println(this.year);
        System.out.println(this.author);
    }
}
