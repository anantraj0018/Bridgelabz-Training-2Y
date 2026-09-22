import java.util.*;

public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peak = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                peak = i;
                break;
            }
        }

        if (peak == 0 && arr[0] < arr[1]) {
            peak = n - 1;
        }

        System.out.println(peak);
    }
}