package BTVN2;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arrNum = {0,1,2,3,4,5,6,7,8,8,10};
//        System.out.println("nhap vao so can chen");
//        int x = sc.nextInt();
//        System.out.println("nhap vao vi tri can chen");
//        int index = sc.nextInt();
//        if (index < 0 || index > arrNum.length){
//            System.out.println("khong chen duoc");
//        }else {
//            for (int i = index; i < arrNum.length -1 ; i++) {
//
//                arrNum[i+1] = arrNum[i];
//                arrNum[i] = x;
//            }
//        }
//        System.out.println("mang moi la:" + Arrays.toString(arrNum));

        Scanner scanner = new Scanner(System.in);

        // Khởi tạo mảng ban đầu
        int[] arr = {1, 2, 3, 4, 5};

        // Hiển thị mảng ban đầu
        System.out.println("Mảng ban đầu: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        // Nhập vị trí để thêm phần tử mới từ bàn phím
        System.out.print("\nNhập vị trí để thêm phần tử mới (từ 0 đến " + (arr.length) + "): ");
        int position = scanner.nextInt();

        if (position < 0 || position > arr.length) {
            System.out.println("Vị trí không hợp lệ.");
        } else {
            // Nhập phần tử mới từ bàn phím
            System.out.print("Nhập phần tử mới: ");
            int newElement = scanner.nextInt();

            // Tạo mảng mới với kích thước lớn hơn 1 và chép các phần tử từ mảng ban đầu
            int[] newArr = new int[arr.length + 1];
            int newIndex = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i == position) {
                    newArr[newIndex++] = newElement;
                }
                newArr[newIndex++] = arr[i];
            }

            // Hiển thị mảng sau khi thêm phần tử
            System.out.println("Mảng sau khi thêm phần tử: ");
            for (int value : newArr) {
                System.out.print(value + " ");
            }
        }

        scanner.close();
    }

}
