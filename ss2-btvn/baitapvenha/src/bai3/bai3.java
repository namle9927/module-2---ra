package bai3;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("cac so nguyen to nho hon 100 la: ");
        for (int j = 2; j < 100 ; j++) {
            boolean check = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    check = false;
                }
            }
          if (check){
              System.out.print(j +",");
          }
        }
    }
}
