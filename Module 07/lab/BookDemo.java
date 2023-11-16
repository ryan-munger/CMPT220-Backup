public class BookDemo {
    public static void main(String args[]) {
        Book book = new Book("Developing Java Software",
                new Author("Russel", "Winderland"),
                79.75);
        System.out.println(book);
    }
}
