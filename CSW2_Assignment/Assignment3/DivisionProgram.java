import java.util.Scanner;
public class DivisionProgram {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the dividend:");
double dividend = scanner.nextDouble();
System.out.println("Enter the divisor:");
double divisor = scanner.nextDouble();
try {
double quotient = divideNumbers(dividend, divisor);
System.out.println("Result of division: " + quotient);
} catch (ArithmeticException e) {
System.err.println("Error: " + e.getMessage());
}
}
public static double divideNumbers(double dividend, double divisor) throws ArithmeticException {
if (divisor == 0) {
throw new ArithmeticException("Division by zero is not allowed.");
}
return dividend / divisor;
}
}