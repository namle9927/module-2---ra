package thuatToanSapXep;

import java.util.Arrays;

public class thuatToanSapXep {
    public static void main(String[] args) {

        int[] arr = {1,3,5,3,5,85445,232,6564,32,34,7436};
        //test noi bot
        //noiBot(arr);
        //test chon
        sepXepChon(arr);
        // test chen
//        sapXepChen(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void noiBot(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length && check; i++) {
            check = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
        }
    }
    public static void sepXepChon(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int currentMin = arr[i];
            int indexMin = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (currentMin>arr[j]){
                    currentMin = arr[j];
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }
    }
    public static void sapXepChen(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            //gia su ptu dau tien da dc xap xep
            // ptu can chen la ptu thu i
            int currentInsert = arr[i];
            //khai bao bien k la vi tri duoc chen cho gia tri hien tai
            int j;
            for (j = i-1; j>=0 && arr[j]>currentInsert; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = currentInsert;

        }
    }
}
