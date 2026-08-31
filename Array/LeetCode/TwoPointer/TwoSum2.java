import java.util.*;

public class TwoSum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Brute Force
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Indices: " + (i + 1) + ", " + (j + 1));
                    return;
                }
            }
        }

        System.out.println("No pair found.");
    }
}