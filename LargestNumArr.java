import java.util.*;

public class LargestNumArr {

    public static int Largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 5, 7, 6 };
        int demo = Largest(numbers);
        System.out.println("Largest number is: " + demo);
    }
}
