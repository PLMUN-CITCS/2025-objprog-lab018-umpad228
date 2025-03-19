import java.util.Scanner;

public class EvenOddChecker {
    
    // Method to get user input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // Validate user input
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear invalid input
            System.out.print("Enter an integer: ");
        }
        
        return scanner.nextInt();
    }
    
    // Method to check if a number is even or odd
    public static String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
    
    public static void main(String[] args) {
        // Get user input
        int number = getUserInput();
        
        // Determine if even or odd
        String result = checkEvenOdd(number);
        
        // Display result
        System.out.println(number + " is an " + result + " number.");
    }
}
