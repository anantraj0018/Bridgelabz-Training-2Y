import java.util.*;

public class RestoreIpAddresses {

    static void solve(String s, int index, int parts, String ip) {

        if (parts == 4) {
            if (index == s.length()) {
                System.out.println(ip.substring(0, ip.length() - 1));
            }
            return;
        }

        for (int len = 1; len <= 3; len++) {

            if (index + len > s.length()) {
                break;
            }

            String part = s.substring(index, index + len);

            if (part.length() > 1 && part.charAt(0) == '0') {
                continue;
            }

            int num = Integer.parseInt(part);

            if (num > 255) {
                continue;
            }

            solve(s, index + len, parts + 1, ip + part + ".");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        solve(s, 0, 0, "");
    }
}