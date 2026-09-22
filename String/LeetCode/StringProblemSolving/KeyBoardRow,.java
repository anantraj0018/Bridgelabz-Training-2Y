import java.util.*;

public class KeyboardRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (int i = 0; i < n; i++) {
            String word = arr[i].toLowerCase();

            String row;

            if (row1.indexOf(word.charAt(0)) != -1) {
                row = row1;
            } else if (row2.indexOf(word.charAt(0)) != -1) {
                row = row2;
            } else {
                row = row3;
            }

            boolean valid = true;

            for (int j = 0; j < word.length(); j++) {
                if (row.indexOf(word.charAt(j)) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                System.out.println(arr[i]);
            }
        }
    }
}