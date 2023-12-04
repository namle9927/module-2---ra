package business.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public static String PRODUCT_PATH = "C:\\Users\\lenovo\\OneDrive\\Desktop\\modu2-local\\md2.pj\\pjnd2\\src\\business\\data\\product.txt";
    public static String CATALOG_PATH = "C:\\Users\\lenovo\\OneDrive\\Desktop\\modu2-local\\md2.pj\\pjnd2\\src\\business\\data\\catalog.txt";
    public static String USER_PATH = "C:\\Users\\lenovo\\OneDrive\\Desktop\\modu2-local\\md2.pj\\pjnd2\\src\\business\\data\\user.txt";

    public static <T> List<T> getListFromFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        List<T> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<T>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không tim thấy File ");
        } catch (IOException e) {
            System.err.println("Khong đọc được file");
        } catch (ClassNotFoundException e) {
            System.err.println("KHôgn thể ép về Class");
        }
        return list;
    }

    public static <T> void writeToFile(String path, List<T> list) {
        File file = new File(path);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);//write data
            oos.close();
        } catch (FileNotFoundException e) {
            System.err.println("Khôgn tìm thấy file");
        } catch (IOException e) {
            System.err.println("Loi ghi file");
        }
        ;

    }
}
