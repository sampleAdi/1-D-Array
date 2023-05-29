import java.util.*;

public class PrintSubArray {
    static int ts = 0;

    public static void subarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays: " + ts);
    }

    public static void SB(int arr[]) {
        int n = arr.length;
        int temp = (n * (n + 1)) / 2;
        System.out.println("total no. of subarrays: " + temp);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subarr(arr);
        SB(arr);
    }
}
