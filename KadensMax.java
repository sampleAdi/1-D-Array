public class KadensMaximum {
    public static void KadensMax(int arr[]) {
        int cs = 0, k, sum1 = 0;
        int ms = Integer.MIN_VALUE;
        int currsum1 = Integer.MIN_VALUE;
        for (k = 0; k < arr.length; k++) {
            cs = cs + arr[k];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
            if (ms == 0) {
                for (k = 0; k < arr.length; k++) {
                    sum1 = sum1 + arr[k];
                    if (sum1 > currsum1) {
                        currsum1 = sum1;
                    }
                }
                System.out.println("Our Maximum subarray sum: " + currsum1);
            }
        }
        System.out.println("Our Maximum sum of subarray: " + ms);
    }

    public static void main(String[] args) {
        int Kadens[] = { 2, 4, 6, 8, 10 };
        KadensMax(Kadens);
    }
}
