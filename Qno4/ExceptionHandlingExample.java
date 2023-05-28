
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close(); // Close the scanner to avoid resource leak
        }
    }
}
