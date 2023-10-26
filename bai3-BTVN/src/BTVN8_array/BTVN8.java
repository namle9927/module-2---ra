package BTVN8_array;

import java.util.Scanner;

public class BTVN8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao chuoi can kiem tra");
        String mySting = sc.nextLine();
        System.out.println("hay nhap vao ky tu can kiem tra");
        String x = sc.nextLine();
        int count = 0;
        for (int i = 0; i < mySting.length(); i++) {
            if (x.equals(String.valueOf(mySting.charAt(i)))) {
                count++;
            }
        }
        System.out.printf("so lan xuat hien cua ky tu %s la %d", x, count);
    }
}
