import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("hay nhap so USD can chuyen doi: ");
        int usd = sc.nextInt();
        System.out.println("ket qua la: " + (usd*rate) +"VND");
    }
}