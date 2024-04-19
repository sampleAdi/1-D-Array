import java.util.ArrayList;

public class MostWater2 {
    public static int container(ArrayList<Integer> height) {
        int maxArea = Integer.MIN_VALUE;
        int LP = 0;
        int RP = height.size() - 1;
        while (LP < RP) {
            int currWidth = RP - LP;
            int minH = Math.min(height.get(LP), height.get(RP));
            int area = minH * currWidth;
            maxArea = Math.max(maxArea, area);

            if (height.get(LP) < height.get(RP)) {
                LP++;
            } else {
                RP--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int max = container(height);
        System.out.println(max);
    }
}
