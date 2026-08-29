import java.util.*;

class SquareofaSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int st = 0;
        int end = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[st]) > Math.abs(nums[end])) {
                result[i] = nums[st] * nums[st];
                st++;
            } else {
                result[i] = nums[end] * nums[end];
                end--;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}