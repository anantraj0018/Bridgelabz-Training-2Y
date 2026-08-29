import java.util.*;

public class ReverseVowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] a = sc.nextLine().toCharArray();

        int st = 0, end = a.length - 1;

        while (st < end) {
            while (st < end && !"aeiouAEIOU".contains("" + a[st]))
                st++;

            while (st < end && !"aeiouAEIOU".contains("" + a[end]))
                end--;

            char temp = a[st];
            a[st] = a[end];
            a[end] = temp;

            st++;
            end--;
        }

        System.out.println(a);
    }
}