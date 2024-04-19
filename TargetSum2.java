import java.util.ArrayList;

public class TargetSum2 {
    public static boolean Sum(ArrayList<Integer> arr, int Target) {
        int BP = -1;
        int size = arr.size();
        for(int i = 0;i<arr.size(); i++)
        {
            if(arr.get(i) > arr.get(i+1))
            {
                BP = i;
                break;
            }
        }

        int RP = BP;
        int LP = BP+1;
        while (LP < RP) {
            if (arr.get(LP) + arr.get(RP) == Target ) {
                return true;
            }
            else if(arr.get(LP) + arr.get(RP) < Target)
            {
                LP = (LP + 1)%size;
            }
            else{
                RP = (RP + size - 1)%size;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        int Target = 16;
        System.out.println(Sum(arr, Target));
    }
}
