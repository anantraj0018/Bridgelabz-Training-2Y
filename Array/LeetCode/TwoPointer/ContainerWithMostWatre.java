import java.util.*;

class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int st = 0, end = n - 1;
        int max = 0;

        while (st < end) {
            int height = Math.min(a[st], a[end]);
            int width = end - st;

            max = Math.max(max, height * width);

            if (a[st] < a[end])
                st++;
            else
                end--;
        }

        System.out.println(max);
    }
}