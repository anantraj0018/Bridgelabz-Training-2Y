import java.util.*;

public class RemoveDuplicateFromSorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[k - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nUnique elements = " + k);
    }
}
