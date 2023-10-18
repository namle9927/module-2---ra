package bai5;

public class bai5 {
    public static void main(String[] args) {
        boolean check = true;
        int n = 1;
        while (check){
            if (n % 5 == 0 && n % 7 == 0 && n % 11 == 0){
                check = false;
            } else { n++;}

        }
        if (check == false){
            System.out.println("so do la: " + n);
        }
    }
}
