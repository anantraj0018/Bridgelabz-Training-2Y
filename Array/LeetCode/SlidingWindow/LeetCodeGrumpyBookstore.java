import java.util.*;

public class LeetCodeGrumpyBookstore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] customers = new int[n];
        int[] grumpy = new int[n];

        for (int i = 0; i < n; i++) {
            customers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            grumpy[i] = sc.nextInt();
        }
        int minutes = sc.nextInt();
        int satisfied = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }
        int extra = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }
        int maxExtra = extra;
        for (int i = minutes; i < n; i++) {

            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            if (grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }

            maxExtra = Math.max(maxExtra, extra);
        }

        System.out.println(satisfied + maxExtra);
    }
}