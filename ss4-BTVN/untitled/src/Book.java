public class Book {
    String bookName;
    double bookPrice;
    int totalPage;
    String authorName;
    public void read(){
        System.out.println("dg doc sach");
    }

    public Book(String bookName, double bookPrice, int totalPage, String authorName) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.totalPage = totalPage;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}
