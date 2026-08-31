import java.util.*;

public class threeSumClosest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Arrays.sort(arr);

        int closest = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (Math.abs(target - sum) < Math.abs(target - closest))
                    closest = sum;

                if (sum < target)
                    left++;
                else if (sum > target)
                    right--;
                else {
                    closest = sum;
                    break;
                }
            }
        }

        System.out.println("Closest sum = " + closest);
    }
}