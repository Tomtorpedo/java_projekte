public class Main {
    public static void main(String[] args) {
        LibraryItem item = new LibraryItem();
        item.title = "Allgemeines Medium";
        item.year = 2005;
        Book book = new Book();
        book.title = "Clean Code";
        book.year = 2008;
        book.author = "Robert Martin";
        DVD dvd = new DVD();
        dvd.title = "Inception";
        dvd.year = 2010;
        dvd.duration = 148;

        item.printInformation();
        book.printInformation();
        dvd.printInformation();
    }
}