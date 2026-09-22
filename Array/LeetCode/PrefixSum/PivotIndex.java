package PrefixSum;

import java.util.*;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }

        int leftSum = 0;
        int pivot = -1;

        for (int i = 0; i < n; i++) {
            int rightSum = total - leftSum - arr[i];

            if (leftSum == rightSum) {
                pivot = i;
                break;
            }

            leftSum = leftSum + arr[i];
        }

        System.out.println(pivot);
    }
}