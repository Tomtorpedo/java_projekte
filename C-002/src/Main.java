public class Main {
    public static void main(String[] args) {
        LibraryItem item = new LibraryItem("Allgemeines Medium",2005);
        Book book = new Book("Clean Code",2008,"Robert Martin");
        DVD dvd = new DVD("Inception",2010,148);

        item.printInformation();
        book.printInformation();
        dvd.printInformation();
    }
}