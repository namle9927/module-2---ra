import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int cd, cr, s, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap chieu dai: ");
        cd = sc.nextInt();
        System.out.println("hay nhap chieu rong: ");
        cr = sc.nextInt();
        s = cr * cd;
        p = (cr + cd) * 2;
        System.out.println("chu vi la: " + p + " don vi");
        System.out.println("dien tich la: " + s + " don vi");


    }
}