package BTVN9_array;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN9 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] myNum = new int[5];
//        for (int i = 0; i <5 ; i++) {
//            System.out.println("nhap phan tu thu " + i + " cua mang");
//            myNum[i] = sc.nextInt();
//        }
//
//        int max  = 0;
//        int max2 = 0;
//        int max3 = 0;
//        for (int i = 0; i < 5; i++) {
//            if (myNum[i] > max  ){
//                max = myNum[i];
//            }
//        }
//        //tao mang tham chieu
//        int[] newMyNum = new int[4];
//        for (int i = 0; i < newMyNum.length; i++) {
//            if (myNum[i] == max) {
//                continue;
//            } else {
//            newMyNum[i] = myNum[i];}
//        }
//        for (int i = 0; i <newMyNum.length ; i++) {
//            if (newMyNum[i] > max2  ){
//                max2 = newMyNum[i];
//            }
//        }
//
//        System.out.println("phan tu lon thu 2 cua mang la " + max2);
        Scanner sc = new Scanner(System.in);
        int[] myNum = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("nhap phan tu thu " + i + " cua mang");
            myNum[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE; // Sử dụng giá trị Integer.MIN_VALUE làm giá trị khởi tạo ban đầu.
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            if (myNum[i] > max) {
                max2 = max; // Cập nhật max2 thành giá trị cũ của max.
                max = myNum[i]; // Cập nhật max thành giá trị lớn nhất mới.
            } else if (myNum[i] > max2 && myNum[i] < max) {
                max2 = myNum[i]; // Cập nhật max2 nếu tìm thấy giá trị lớn thứ 2.
            }
        }

        System.out.println("phan tu lon thu 2 cua mang la " + max2);
    }
}
