import java.util.*;

public class MaxSubArraySum {
    public static void MaxSub(int arr[]) {
        int sum = 0, currsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j=i;j<arr.length;j++) {
                sum = sum + arr[j];
            }
            if (sum > currsum) {
                currsum = sum;
            }
        }
        System.out.println("Maximum sum of subarray :" + currsum);
    }

    public static void main(String[] args) {
        int arr[] = { -1,2,1,2,3 };
        MaxSub(arr);
    }
}
