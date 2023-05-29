import java.util.Scanner;

class sumofArray {
    public static void main(String[] args) {
        int size, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.print("Enter the numbers: ");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of elements of an array: " + sum);
    }
}
