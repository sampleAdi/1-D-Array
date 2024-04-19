import java.util.*;

public class MaxPath {

    public static void TrackSum(int brr[], int arr[], int n, int m) {
        int p = 0, q = 0, MaxSum = 0, Max;
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        while (i < n && j < m) {
            if (arr[i] < brr[j]) {
                i++;
            } else if (arr[i] > brr[j]) {
                j++;
            } else {
                for (int k = p; k <= i; k++) {
                    sum1 += arr[k];
                }
                for (int l = q; l <= j; l++) {
                    sum2 += brr[l];
                }
                Max = Math.max(sum1, sum2);
                MaxSum = MaxSum + Max;
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
                p = i;
                q = j;
            }
        }
        if (i == arr.length) {
            for (int k = q; k < m; k++) {
                MaxSum += brr[k];
            }
        }
        if (j == brr.length) {
            for (int k = p; k < n; k++) {
                MaxSum += arr[k];
            }
        }
        System.out.println(MaxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Enter no. of test cases: ");
        t = sc.nextInt();
        while (t-- > 0) {
            int n, m;
            System.out.println("Enter the size of arr1: ");
            n = sc.nextInt();
            System.out.println("Enter the size of arr2: ");
            m = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the values for arr1: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] brr = new int[m];
            System.out.println("Enter the values for arr2: ");
            for (int j = 0; j < m; j++) {
                brr[j] = sc.nextInt();
            }
            TrackSum(arr, brr, n, m);
        }
    }
}
