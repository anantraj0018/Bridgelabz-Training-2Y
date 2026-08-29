import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int st = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[st];
                a[st] = temp;
                st++;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
