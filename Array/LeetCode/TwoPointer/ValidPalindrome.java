
import java.util.*;

class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int st = 0, end = s.length() - 1;

        while (st < end) {
            while (st < end && !Character.isLetterOrDigit(s.charAt(st)))
                st++;

            while (st < end && !Character.isLetterOrDigit(s.charAt(end)))
                end--;

            if (Character.toLowerCase(s.charAt(st)) !=
                Character.toLowerCase(s.charAt(end))) {
                System.out.println(false);
                return;
            }

            st++;
            end--;
        }

        System.out.println(true);
    }
}