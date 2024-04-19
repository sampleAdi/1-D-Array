import java.util.*;

public class Alex {

    public static void support(int prices[], int n, int budget[], int k[]) {
        for (int x = 0; x <= n; x++) {
            int A = budget[x];
            if (Option(prices, n, A, k[x])) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean Option(int prices[], int n, int A, int k) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (A >= prices[j]) {
                if (A % prices[j] == 0) {
                    count++;
                }
            }
        }

        if (count >= k) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int prices[] = { 100, 200, 400, 100 };
        int budget[] = { 100, 200, 500, 600, 800 };
        int[] k = new int[n + 1];
        System.out.println("enter the values of k: ");
        for (int y = 0; y <= n; y++) {
            k[y] = sc.nextInt();
        }

        support(prices, n, budget, k);
    }
}
