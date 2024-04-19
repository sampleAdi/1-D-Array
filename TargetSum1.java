import java.util.ArrayList;

public class TargetSum1 {
    public static boolean Sum(ArrayList<Integer> arr, int Target) {
        int LP = 0;
        int RP = arr.size() - 1;
        while (LP < RP) {
            if (arr.get(LP) + arr.get(RP) == Target ) {
                return true;
            }
            else if(arr.get(LP) + arr.get(RP) < Target)
            {
                LP++;
            }
            else{
                RP--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        int Target = 5;
        System.out.println(Sum(arr, Target));
    }
}
