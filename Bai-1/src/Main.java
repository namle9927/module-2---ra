import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int global ;
    static String text;
    static char link;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//            for (int i = 1; i <= 5; i++) {
//
//                // Press Shift+F9 to start debugging your code. We have set one breakpoint
//                // for you, but you can always add more by pressing Ctrl+F8.
//                System.out.println("i = " + i);
    int a = 10;
    double d = 5.6;
    float f = 3.2f;
    boolean check = true;
    short sh = 100;
    long l = 1000;
    char c = '.';

        System.out.println("gia tri bien a " + a );
        System.out.println("gia tri bien d " + d );
        System.out.println("gia tri bien f " + f );
        System.out.println("gia tri bien check " + check );
        System.out.println("gia tri bien sh " + sh );
        System.out.println("gia tri bien l " + l );
        System.out.println("gia tri bien c " + c );
        System.out.println(global);
        System.out.println(link);
        //chuỗi giữ phím ctrl
        String fullName = "Le Ngọc Nam" ;// khởi tạo tường minh
        System.out.println(fullName);
        System.out.println(text);
        String name = new String("le Ngoc nam");
        System.out.println(name);
        Date date = new Date();
        System.out.println(date);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //nhap xuat du lieu
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap ten ban");
        String hoTen = sc.nextLine(); //cho phep nguoi dung nhap
        System.out.println(hoTen);
        // nhap so
        System.out.println(" hay nhap 1 so");
        int number = Integer.parseInt(sc.nextLine()); //ep kieu tu string
//        float real = sc.nextFloat();
//        double db = sc.nextDouble();
//        char ch = sc.nextLine().charAt(0);// lay ki tu dau tien
//        boolean bool = sc.nextBoolean();
        System.out.println("hay nhap 1 chuoi");
//        sc.nextLine();
        String str = sc.nextLine();
        Integer num = 10;
        System.out.printf("ho ten: %s, tuoi : %d, diem: %.2f", fullName, a, d);
    }
    }

