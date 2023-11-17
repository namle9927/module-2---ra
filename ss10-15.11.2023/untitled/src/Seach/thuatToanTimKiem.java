package Seach;

import java.util.*;

public class thuatToanTimKiem {
    //ganeric - tham so kieu du lieu

    public static void main(String[] args) {
        List<Integer> listNumber = Arrays.asList(2, 4, 6, 8, 6, 3, 4, 6, 7, 9, 7, 66);
        Student s1 = new Student(1,"Hung");
        List<Student> students = Arrays.asList(s1, new Student(2,"Nam"));
        Collections.sort(students);
        System.out.println(timKiemNhiPhan(students,s1));
        boolean check = timKiemTuyeTinh(listNumber, 222);
        if (check) {
            System.out.println("co ton tai ptu can tim");
        } else System.out.println("ko ton tai ptu can tim");
        Collections.sort(listNumber);
        boolean check2 = timKiemNhiPhan(listNumber,8);
        System.out.println(check2);

    }

    public static <T> boolean timKiemTuyeTinh(List<T> list, T element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element) ) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> boolean timKiemNhiPhan(List<T> list, T element) {
        int start = 0;
        int end = list.size() - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2; //(start + end)/2
            if (list.get(mid) == element) {
                return true;
            } else if (list.get(mid).compareTo(element) > 0) {
                end = mid - 1;
            } else start = mid +1;
        }
        return false;
    }
}
