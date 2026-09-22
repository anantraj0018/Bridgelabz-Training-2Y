package KedaneAlgorithm;

import java.util.*;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int profit = 0;

        for (int i = 1; i < n; i++) {
            int currentProfit = arr[i] - min;

            if (currentProfit > profit) {
                profit = currentProfit;
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(profit);
    }
}