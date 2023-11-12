import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(2);
        collection.add(1);
        collection.add(3);
        collection.add(4);
//        for (Integer num: collection
//             ) {
//            System.out.println(num);
//        }
        //duyet mang bang iterator
        Iterator<Integer> integerIterator = collection.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        arrayList.add("Nam Le");
        arrayList.add(1, "Lo Le");
        arrayList.add(2, "Ly Le");
        System.out.println(arrayList);

        linkedList = new LinkedList<>(arrayList);
        arrayList = new ArrayList<>(linkedList);

        //thao tac co ban
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //thay doi gia tri
        arrayList.set(0, "Linh");
        System.out.println(arrayList);
        //kiem tra danh sach trong
        System.out.println(arrayList.isEmpty());
        // kirm tra ton tai 1 ptu
        System.out.println(arrayList.contains("Linh"));

        //tao nhanh danh sach
        List<String> subList = Arrays.asList("Linh", "Lo Le");
        //kiem tra ton tai cua 1 danh sach
        System.out.println(arrayList.containsAll(subList));

        // xpa 1 ptu theo vi tri
        arrayList.remove(1);
        System.out.println(arrayList);
        // xoa theo gia tri
        arrayList.remove("Linh");
        System.out.println(arrayList);

        linkedList = new LinkedList<>(arrayList);
//        linkedList.add
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(4);
        set.add(45);
        set.add(6);
        set.add(4543);
        set.add(343);
        set.add(767);
        set.add(45);
        System.out.println(set);

        HocSinh h1 = new HocSinh(1,"Nam");
        HocSinh h2 = new HocSinh(2,"Linh");
        HocSinh h3 = new HocSinh(3,"Lo");
        Set<HocSinh> set1 = new TreeSet<>();
    }
}