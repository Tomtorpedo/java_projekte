public class Book extends LibraryItem {
    String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author=author;
    }

    public void printInformation() {
        System.out.println(this.title);
        System.out.println(this.year);
        System.out.println(this.author);
    }
}
