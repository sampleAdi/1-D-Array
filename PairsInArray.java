import java.util.*;

public class PairsInArray {
    static int ps = 0;

    public static void pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " " + arr[j] + ")");
                ps++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairsInArray: " + ps);
    }

    public static int TP(int arr[]) {
        int n = arr.length;
        int temp = (n * (n - 1)) / 2;
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        pairs(arr);
        System.out.println("Total number of pairs: " + TP(arr));
    }
}
