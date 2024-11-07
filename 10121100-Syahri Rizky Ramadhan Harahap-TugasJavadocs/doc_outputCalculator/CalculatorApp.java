import java.util.Scanner;

/**
 * The CalculatorApp class provides a simple calculator that can perform
 * addition, subtraction, multiplication, and division operations.
 */
public class CalculatorApp {

    /**
     * This method adds two numbers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * This method subtracts the second number from the first number.
     * 
     * @param a the first number
     * @param b the second number
     * @return the result of a minus b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * This method multiplies two numbers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * This method divides the first number by the second number.
     * 
     * @param a the numerator
     * @param b the denominator
     * @return the quotient of a divided by b
     * @throws ArithmeticException if the denominator is zero
     */
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    /**
     * The main method to run the calculator program.
     * 
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                try {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
