import java.util.*;

public class BinarySearch {
    public static int binarysearch(int arr[], int key) {
        int i = 0, j = arr.length - 1;
        int mid = (i + j) / 2;
        while (i <= j) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                i = mid + 1;
                mid++;
            } else {
                j = mid - 1;
                mid--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 12;
        System.out.println("Number is found at index: " + binarysearch(arr, key));
    }
}
