// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("de men", 100, 20, "To Hoai");
        System.out.println("ten sach " + book1.getBookName());
        changeBookName(book1);
        System.out.println(book1.getBookName());
        int b = 10;
        changeValueNum(b);
        System.out.println(b);
    }

    public static void changeBookName(Book book) {
        book.setBookName("aloalo");
    }

    public static void changeValueNum(int a) {
        a = 100;
    }
}
