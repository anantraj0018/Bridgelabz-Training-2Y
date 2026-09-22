import java.util.*;

public class DefuseTheBomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;

            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum = sum + arr[(i + j) % n];
                }
            } 
            else if (k < 0) {
                for (int j = 1; j <= -k; j++) {
                    sum = sum + arr[(i - j + n) % n];
                }
            }

            result[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}