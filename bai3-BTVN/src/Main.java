import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] arrayString = {"Hung", "Nam", "giang"}; // co 3 ptu
        //int[] arrInt = new int[100]; //co 100 ptu co gia tri mac dinh la 0
        int arrInt[] = {1, 2, 3, 4, 5, 6, 776, 434, 23};
        System.out.println("gia tri ptu tai vi tri 2 la: " + arrayString[1]);
        arrayString[1] = "linh";
        System.out.println(arrayString[1]);
        System.out.println("do dai cua mang la: " + arrayString.length);
        //duyet mang
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("phan tu thu " + i + " la: " + arrayString[i]);
        }
        // arrays
        String[] cloneArrayString = arrayString.clone();
        //arrayString[0] = null;
        for (int i = 0; i < cloneArrayString.length; i++) {
            System.out.println("phan tu thu " + i + " la: " + arrayString[i]);
        }
        System.out.println(Arrays.toString(arrayString));
        String[] CopyArray1 = Arrays.copyOfRange(arrayString, 1, 2); //copy array
        System.out.println(Arrays.toString(CopyArray1));
        Arrays.sort(arrayString);
        System.out.println("mang sau khi sapxep" + Arrays.toString(arrayString));
        for (int number : arrInt
        ) {
            System.out.println(number);
        }
        // mang 2 chieu
        int[][] arrayInteger = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array2 = new int[3][3];
        System.out.println("phan tu vi tri i = 1 va j = 2 la " + arrayInteger[1][2]);
        //duyet mang 2 chieu
        for (int i = 0; i <arrayInteger.length ; i++) {
            int[] element = arrayInteger[i];
            for (int j= 0; j < element.length ; j++) {
                System.out.print(arrayInteger[i][j]);
            }
            System.out.println();
        }

    }
}