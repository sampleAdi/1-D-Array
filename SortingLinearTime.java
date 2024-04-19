import java.util.*;

public class SortingLinearTime {
    public static void SameColor(int nums[]) {
        int LP = 0, RP = nums.length - 1, mid = 0;

        while (mid <= RP) {
            if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[RP];
                nums[RP] = temp;
                RP--;
            } else if (nums[mid] == 0) {
                int demo = nums[mid];
                nums[mid] = nums[LP];
                nums[LP] = demo;
                LP++;
                mid++;
            } else {
                mid++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of digits for a array: ");
        int digits;
        digits = sc.nextInt();
        int[] nums = new int[digits];
        System.out.println("Enter the digits for array: ");
        for (int i = 0; i < digits; i++) {
            nums[i] = sc.nextInt();
        }

        SameColor(nums);
    }
}
