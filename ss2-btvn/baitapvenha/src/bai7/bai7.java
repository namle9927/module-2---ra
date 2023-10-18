package bai7;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật .\n" +
                    "2. Tính chu vi và diện tích hình tam giác\n" +
                    "3. Tính chu vi và diện tích hình tròn.\n" +
                    "4. Thoát\n");
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("hay hap chieu dai HCN");
                    int cd = sc.nextInt();
                    System.out.println("hay hap chieu rong HCN");
                    int cr = sc.nextInt();
                    int s = cd * cr, p = (cd + cr)*2;
                    System.out.println("chu vi HCN la: " + p);
                    System.out.println("dien tich HCN la: " + s);
                    break;

                case 2:
                    while (true){
                        System.out.println("hay nhap canh dau tien cua tam giac");
                        double a = sc.nextDouble();
                        System.out.println("hay nhap canh thu hai cua tam giac");
                        double b = sc.nextDouble();
                        System.out.println("hay nhap canh thu ba cua tam giac");
                        double c = sc.nextDouble();
                        if (a > 0 && b > 0 && c > 0 && a+b>c && c+b>a && a+c>b ) {
                            double chuVi = Math.floor(a + b + c);
                            double thamSo = chuVi/2;
                            double dienTich = Math.sqrt(thamSo*(thamSo-a)*(thamSo-b)*(thamSo-c));
                            System.out.println("dien tich tam giac la " + dienTich);
                            System.out.println("chu vi tam giac la " + chuVi);
                            break;
                        } else {
                            System.out.println("hay nhap lai cac canh cua tam giac");
                        }
                    }
                    break;

                case 3:
                    System.out.println("hay hap ban kinh duong tron");
                    double bk = sc.nextInt();
                    double S = Math.PI * bk * bk, P = 2 * Math.PI * bk;
                    System.out.println("dien tich duong tron la: " + S);
                    System.out.println("ch vi duong tron la: " + P);
                    break;

                case 4:
//                    System.exit(0);
                    System.out.println("thoát chương trình");
                    break;
                default:
                    System.out.println("nhập không hợp lệ");
            }
            if (choice == 4) {
                break;
            }
        }
    }
}
