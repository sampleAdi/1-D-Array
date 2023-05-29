import java.util.*;

public class Percentage {
    public static void main(String[] args) {
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject of physics: ");
        marks[0] = sc.nextInt();
        System.out.println("Enter marks of subject of chemistry: ");
        marks[1] = sc.nextInt();
        System.out.println("Enter marks of subject of math: ");
        marks[2] = sc.nextInt();
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("percentage from these subjects: " + percentage + "%");
  
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks=" + marks[i]);
        }
    }
}
