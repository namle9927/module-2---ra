import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap so can kiem tra");
        int testNum = sc.nextInt();
        if (testNum % 3 == 0 && testNum % 5 == 0 ){
            System.out.println("Chia hết cho cả 3 và 5");
        } else if (testNum % 3 == 0 && testNum % 5 != 0) {
            System.out.println("Chỉ chia hết cho 3");
        }else if (testNum % 3 != 0 && testNum % 5 == 0) {
            System.out.println("Chỉ chia hết cho 5");
        }else if (testNum % 3 != 0 && testNum % 5 != 0) {
            System.out.println("Không chia hết cho 3 , cũng không chia hết cho 5");
        }
    }
}