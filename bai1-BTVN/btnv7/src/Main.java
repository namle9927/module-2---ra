import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("hay nhap so can chuyen doi:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0 || a > 9) {
            System.out.println("Số không hợp lệ");
        } else {
            switch (a) {
                case 1:
                    System.out.println("so mot");
                    break;
                case 2:
                    System.out.println("so hai");
                    break;
                case 3:
                    System.out.println("so ba");
                    break;
                case 4:
                    System.out.println("so bon");
                    break;
                case 5:
                    System.out.println("so nam");
                    break;
                case 6:
                    System.out.println("so sau");
                    break;
                case 7:
                    System.out.println("so bay");
                    break;
                case 8:
                    System.out.println("so tam");
                    break;
                case 9:
                    System.out.println("so chin");
                    break;
            }

        }
    }
}