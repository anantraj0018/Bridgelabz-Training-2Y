
import java.util.*;

public class CountDistinctElementInEveryWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i <= n - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(arr[j]);
            }

            System.out.print(set.size() + " ");
        }

        sc.close();
    }
}