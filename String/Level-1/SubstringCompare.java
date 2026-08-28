import java.util.Scanner;

public class SubstringCompare {

    // Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string: ");
        String text = sc.next();

        // Input start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using charAt()
        String manualSubstring = createSubstring(text, start, end);

        // Substring using built-in method
        String builtInSubstring = text.substring(start, end);

        // Compare both substrings
        boolean result = compareStrings(manualSubstring, builtInSubstring);

        // Display results
        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + result);

        sc.close();
    }
}
