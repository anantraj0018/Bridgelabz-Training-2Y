import java.util.*;

class ReverseVowel {
    static boolean vowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();

        int st = 0, end = s.length - 1;

        while (st < end) {
            while (st < end && !vowel(s[st])) st++;
            while (st < end && !vowel(s[end])) end--;

            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;

            st++;
            end--;
        }

        System.out.println(s);
    }
}