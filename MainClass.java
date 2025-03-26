package arithmetic;

public class ArithClass {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
import arithmetic.ArithClass;

public class MainClass {
    public static void main(String[] args) {
        ArithClass obj = new ArithClass();

        int num1 = 10;
        int num2 = 5;

        int sum = obj.add(num1, num2);
        int diff = obj.subtract(num1, num2);
        int product = obj.multiply(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
    }
}