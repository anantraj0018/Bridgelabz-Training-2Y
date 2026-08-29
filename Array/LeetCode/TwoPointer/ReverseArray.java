import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int st = 0, end = n - 1;

        while (st < end) {
            int temp = a[st];
            a[st] = a[end];
            a[end] = temp;

            st++;
            end--;
        }

        System.out.println(Arrays.toString(a));
    }
}
