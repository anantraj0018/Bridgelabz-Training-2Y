import java.util.Scanner;

public class StringIndexExceptionDemo {

    
    public static void generateException(String text) {

      
        System.out.println("Character: " + text.charAt(text.length()));
    }

   
    public static void handleException(String text) {

        try {
            
            System.out.println("Character: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Message: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = sc.next();

        
        handleException(text);

        sc.close();
    }
}
