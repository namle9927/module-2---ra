package bai6;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số.\n" +
                    "2.Kiểm tra số nguyên tố.\n" +
                    "3.Kiểm tra một số có chia hết cho 3 không.\n" +
                    "4.Thoát\n");
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("hay nhap so can kiem tra");
                    int a = sc.nextInt();
                    if (a % 2 == 0) {
                        System.out.println("so chan");
                    } else {
                        System.out.println("so le");
                    }
                    break;

                case 2:
                    System.out.println("hay nhap so can kiem tra");
                    int b = sc.nextInt();

                    boolean check = true;
                    if (b == 1) {
                        System.out.println("so ko la so nguyen to");
                        break;
                    } else {
                        for (int i = 2; i < b / 2; i++) {
                            if (b % i == 0) {
                                check = false;
                            }
                        }
                        if (check) {
                            System.out.println("so la so nguyen to");
                        } else {
                            System.out.println("so ko la so nguyen to");
                        }
                    }
                    break;

                case 3:
                    System.out.println("hay nhap so can kiem tra");
                    int c = sc.nextInt();
                    if (c % 3 == 0) {
                        System.out.println("so chia het cho 3");
                    } else {
                        System.out.println("so ko chia het cho 3");
                    }
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
