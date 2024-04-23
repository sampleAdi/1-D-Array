import java.util.*;

class numSubarrayProductLessThanK {
    public static void count(int[] nums, int k) {
        System.out.println(countsubarr(nums, k));
    }

    public static int countsubarr(int arr[], int k) {
        int si = 0;
        int ei = 0;
        int p = 1;
        int ans = 0;

        // Window Grow
        while (ei < arr.length) {
            p = p * arr[ei];

            // Window Shrink
            while (p >= k && si <= ei) {
                p = p / arr[si];
                si++;
            }

            // Calculate ans
            ans = ans + ei - si + 1;
            ei++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 2, 3 };
        int k = 10;
        count(nums, k);
    }
}
