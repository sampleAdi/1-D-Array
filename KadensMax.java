import java.util.*;

class KadensMax {

    public static void MaxSum(int arr[]) {

        int CS = 0;
        int MS = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            CS += arr[i];
            MS = Math.max(CS, MS); // this line always write first for negative and positive numbers array.
            if (CS < 0) {
                CS = 0;
            }
        }
        System.out.println(MS);
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -4 };
        MaxSum(arr);
    }
}
