import java.util.*;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Stack<Integer> numbers = new Stack<>();
        Stack<String> strings = new Stack<>();

        String current = "";
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                numbers.push(num);
                strings.push(current);

                num = 0;
                current = "";
            }
            else if (ch == ']') {
                int times = numbers.pop();
                String old = strings.pop();

                String temp = "";

                for (int j = 0; j < times; j++) {
                    temp = temp + current;
                }

                current = old + temp;
            }
            else {
                current = current + ch;
            }
        }

        System.out.println(current);
    }
}