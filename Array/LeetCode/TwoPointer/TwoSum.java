import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int target = sc.nextInt();

        Arrays.sort(a);

        int st = 0, end = n - 1;

        while (st < end) {
            int sum = a[st] + a[end];

            if (sum == target) {
                System.out.println(a[st] + " " + a[end]);
                return;
            } 
            else if (sum < target) {
                st++;
            } 
            else {
                end--;
            }
        }

        System.out.println("No pair found");
    }
}