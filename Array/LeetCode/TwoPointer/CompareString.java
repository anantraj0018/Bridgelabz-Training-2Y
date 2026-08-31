import java.util.*;

public class CompareString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Strings are not equal");
            return;
        }

        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                System.out.println("Strings are not equal");
                return;
            }

            i++;
            j++;
        }

        System.out.println("Strings are equal");
    }
}