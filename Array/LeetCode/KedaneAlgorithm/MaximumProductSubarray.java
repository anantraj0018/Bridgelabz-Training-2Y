package KedaneAlgorithm;

import java.util.*;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int answer = arr[0];

        for (int i = 1; i < n; i++) {
            int temp = max;

            max = Math.max(arr[i], Math.max(max * arr[i], min * arr[i]));
            min = Math.min(arr[i], Math.min(temp * arr[i], min * arr[i]));

            answer = Math.max(answer, max);
        }

        System.out.println(answer);
    }
}