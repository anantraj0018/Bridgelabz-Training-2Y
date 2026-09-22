import java.util.*;

public class FirstNegativeIntegerInFixedVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i <= n - k; i++) {

            int ans = 0;

            for (int j = i; j < i + k; j++) {

                if (arr[j] < 0) {
                    ans = arr[j];
                    break;
                }
            }

            System.out.print(ans + " ");
        }
    }
}
