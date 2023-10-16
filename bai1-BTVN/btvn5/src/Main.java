import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap diem toan:");
        double diemToan = sc.nextDouble();
        System.out.println("hay nhap diem ly:");
        double diemLy = sc.nextDouble();
        System.out.println("hay nhap diem hoa:");
        double diemHoa= sc.nextDouble();
        System.out.println("hay nhap diem van:");
        double diemVan = sc.nextDouble();
        System.out.println("hay nhap diem tieng anh:");
        double diemTa = sc.nextDouble();
        double avg = (diemToan + diemLy + diemHoa + diemVan + diemTa)/5;
        System.out.println("diem trung binh la: " + avg);
        if (avg < 5) {
            System.out.println("xep loai yeu");
        } else if (avg < 6.5) {
            System.out.println("xep loai trung binh");
        } else if (avg < 8) {
            System.out.println("xep loai kha");
        } else if (avg < 9) {
            System.out.println("xep loai gioi");
        }else if (avg <= 10 ){
            System.out.println("xep loai xuat xac");
        }
    }
}