import java.util.Scanner;

public class NumberSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number < 10 || number > 50) {
                throw new Exception("Number is out of range (10-50)");
            } else {
                int square = number * number;
                System.out.println("Square of " + number + " is: " + square);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}