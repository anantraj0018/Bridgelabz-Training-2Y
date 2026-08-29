import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int target = sc.nextInt();

        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (a[mid] == target) {
                System.out.println(mid);
                return;
            } 
            else if (a[mid] < target) {
                st = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        System.out.println(-1);
    }
}