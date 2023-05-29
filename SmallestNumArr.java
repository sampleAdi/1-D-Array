import java.util.*;

public class SmallestNumArr {

    public static int Smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 4, 78, 56, 2, 3 };
        int demo = Smallest(numbers);
        System.out.println("Smallest number is: " + demo);
    }
}
