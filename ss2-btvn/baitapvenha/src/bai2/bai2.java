package bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. In hình chữ nhật (Rectangle)\n" +
                    "2. In hình tam giác vuông góc vuông ở 4 góc khác nhau: \n" +
                    "3. In hình tam giác cân ( Isosceles triangle)\n" +
                    "4. Exit\n");
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // hiển thị hình chữ nhật
                    System.out.println("hay nhap chieu dai");
                    int cd = Integer.parseInt(sc.nextLine());
                    System.out.println("hay nhap chieu rong");
                    int cr = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < cr; i++) {
                        for (int j = 0; j < cd; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    // hiển thị tam giác vuông theo menu
                    System.out.println("a. Trên cùng bên trái (top-left) \n" +
                            "b. Trên cùng bên phải( top-right)\n" +
                            "c. Dưới cùng bên trái( bottom-left) \n" +
                            "d. Dưới cùng bên phải(bottom-right)\n");
                    System.out.println("nhập lựa chọn của bạn");
                    String next = sc.nextLine();
                    switch (next) {
                        case "a":
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case "b":
                            for (int j = 0; j < 5; j++) {
                                for (int i = 0; i <= j; i++) {
                                    System.out.print(" ");
                                }
                                for (int i = 5 - j; i > 0; i--) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case "c":
                            for (int i = 0; i <= 5; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case "d":
                            for (int j = 0; j < 5; j++) {
                                for (int i = j; i <= 5; i++) {
                                    System.out.print(" ");
                                }
                                for (int i = j; i >= 0; i--) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }

                            break;
                        default:
                            System.out.println("nhập lại");

                    }
                    break;
                case 3:
                    int k = 0;
                    for (int i = 1; i <= 4; ++i, k = 0) {
                        for (int j = 1; j <= 4 - i; ++j) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ;
                        }
                        System.out.println();
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
