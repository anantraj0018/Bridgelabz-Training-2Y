import java.util.*;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] s = new char[n];

        for (int i = 0; i < n; i++)
            s[i] = sc.next().charAt(0);

        int st = 0, end = n - 1;

        while (st < end) {
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }

        System.out.println(Arrays.toString(s));
    }
}