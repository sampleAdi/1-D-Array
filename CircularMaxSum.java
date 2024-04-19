import java.util.*;

public class CircularMaxSum {

    public static int linearkadens(int nums[]) {
        int MS = Integer.MIN_VALUE;
        int CS = 0;
        for (int i = 0; i < nums.length; i++) {
            CS = CS + nums[i];
            MS = Math.max(CS, MS);
            if (CS < 0) {
                CS = 0;
            }
        }
        return MS;
    }

    public static int maximum(int nums[]) {
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum = sum + nums[j];
            nums[j] = nums[j] * -1;
        }

        int invertedkadens = linearkadens(nums);

        int CircularSum = sum + invertedkadens;
        return Math.max(linearkadens(nums), CircularSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Enter no. of test cases: ");
        t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the no. of digits for a array: ");
            int digits;
            digits = sc.nextInt();
            int[] nums = new int[digits];
            System.out.println("Enter the digits for array: ");
            for (int i = 0; i < digits; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.println(maximum(nums));
        }
    }
}
