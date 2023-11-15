package b13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bt3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < list.size() ; i++) {
            if ( !map.containsKey(list.get(i))){
                map.put(list.get(i),1 );
            }else map.put(list.get(i),map.get(list.get(i))+1);
        }
        for (Map.Entry<Integer, Integer> mp: map.entrySet()
             ) {
            System.out.println("so: "+mp.getKey() + " xuat hien " + mp.getValue()+" lan");
        }
    }
}
