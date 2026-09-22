import java.util.*;

public class LeetCodeMinimumSizeSubarraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int left = 0;
        int sum = 0;
        int minLen = n + 1;

        for (int right = 0; right < n; right++) {

            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        if (minLen == n + 1)
            System.out.println(0);
        else
            System.out.println(minLen);
    }
}
