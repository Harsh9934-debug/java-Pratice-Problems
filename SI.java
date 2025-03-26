import java.util.Scanner;

class SI {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter Principle Amount: ");
            double p = in.nextDouble();

            System.out.print("Enter Interest Rate: ");
            double r = in.nextDouble();

            System.out.print("Enter Time in Years: ");
            int t = in.nextInt();

            double si = p * r * t / 100;
            double ta = p + si;

            System.out.printf("Simple Interest = %.2f%n", si);
            System.out.printf("Total Amount = %.2f%n", ta);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            in.close();
        }
    }
}
