package b1;

import java.util.ArrayList;
import java.util.Collections;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int)(Math.random()*101));
        }
        System.out.println(arrayList);
        int a = 0;
//        for (int i = 0; i <arrayList.size() ; i++) {
//            if (arrayList.get(i) >= a){
//                a = arrayList.get(i);
//            }
//        }
//        System.out.println(a);
        System.out.println(Collections.max(arrayList));

    }

}
