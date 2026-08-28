import java.util.Scanner;

public class NumberFormatDemo {

  
    public static void generateException(String text) {

        
        int number = Integer.parseInt(text);

        System.out.println("Converted number: " + number);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a value: ");
        String text = sc.next();

        
        generateException(text);

        sc.close();
    }
}
