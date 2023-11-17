package BT.b1;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<FootballTeam> arr = new ArrayList<>();
        FootballTeam t1 = new FootballTeam(1, "alo", 2, 10);
        FootballTeam t2 = new FootballTeam(2, "ola", 3, 11);
        FootballTeam t3 = new FootballTeam(3, "elo", 4, 12);
        arr.add(t3);
        arr.add(t1);
        arr.add(t2);
        sapXepChen(arr);
        System.out.println(arr);

    }

    public static void noiBot(List<FootballTeam> a) {
        boolean check = true;
        for (int i = 1; i < a.size() && check; i++) {
            check = false;
            for (int j = 0; j < a.size() - i; j++) {
                if (a.get(j).getScore() < (a.get(j + 1).getScore())) {
                    FootballTeam temp = a.get(j);
                    a.set(j, a.get(j + 1));
//                    a.get(j)= a.get(j + 1);
                    a.set(j + 1, temp);
//                j + 1] = temp;
                    check = true;
                }
            }
        }
    }

    public static void sepXepChon(List<FootballTeam> a) {
        for (int i = 0; i < a.size() - 1; i++) {
            FootballTeam currentMin = a.get(i);
            int indexMin = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (currentMin.getScore() < a.get(j).getScore()) {
                    currentMin = a.get(j);
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                FootballTeam temp = a.get(i);
                a.set(i, a.get(indexMin));
                a.set(indexMin, temp);
//                arr[i] = arr[indexMin];
//                arr[indexMin] = temp;
            }
        }
    }

    public static void sapXepChen(List<FootballTeam> a) {
        for (int i = 1; i < a.size(); i++) {
            //gia su ptu dau tien da dc xap xep
            // ptu can chen la ptu thu i
            FootballTeam currentInsert = a.get(i);
            //khai bao bien k la vi tri duoc chen cho gia tri hien tai
            int j;
            for (j = i - 1; j >= 0 && a.get(j).getScore() < currentInsert.getScore(); j--) {
            a.set(j+1,a.get(j));
                //                arr[j+1] = arr[j];
            }
            a.set(j+1,currentInsert);
//            arr[j + 1] = currentInsert;

        }
    }
}
