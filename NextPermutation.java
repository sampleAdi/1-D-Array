import java.util.*;

public class NextPermutation {
    public static void next(int nums[]) {
        int i = nums.length - 2, p = 0;
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p = i;
                break;
            }
        }

        int q = 0;
        for (int j = nums.length - 1; j > p; j--) {
            if (nums[j] > nums[p]) {
                q = j;
                break;
            }
        }

        if (p == 0 && q == 0) {
            Reverse(nums, 0, nums.length - 1);
            return;
        }

        int demo = nums[q];
        nums[q] = nums[p];
        nums[p] = demo;

        Reverse(nums, p + 1, nums.length - 1);
    }

    public static void Reverse(int nums[], int i, int j) {
        while (i < j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Enter no. of test cases: ");
        t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the no. of digits for a number: ");
            int digits;
            digits = sc.nextInt();
            int[] nums = new int[digits];
            System.out.println("Enter the digits for array: ");
            for (int i = 0; i < digits; i++) {
                nums[i] = sc.nextInt();
            }
            next(nums);

            for (int k = 0; k < nums.length; k++) {
                System.out.print(nums[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
