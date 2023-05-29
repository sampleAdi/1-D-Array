import java.util.*;

public class MaxSubArraySum {
    public static void MaxSub(int arr[]) {
        int sum = 0, currsum = Integer.MIN_VALUE, start, end, i;
        for (i = 0; i < arr.length; i++) {
            sum = 0;
            start = i;
            end = arr.length - 1;
            for (; start <= end; start++) {
                sum = sum + arr[start];
            }
            if (sum > currsum) {
                currsum = sum;
            }
        }
        System.out.println("Maximum sum of subarray :" + currsum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        MaxSub(arr);
    }
}
