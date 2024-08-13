import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find the last digit using the modulus operator
        int lastDigit = number % 10; //modulus of any number with 10 will always be the last number; 123 divided by 10 results in 3

        // Print the last digit
        System.out.println("The last digit of the number is: " + lastDigit);

        // Close the scanner
        sc.close();
    }
}
//Solution for finding last digit of a number;
