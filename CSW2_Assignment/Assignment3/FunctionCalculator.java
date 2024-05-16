import java.util.Scanner;
public class FunctionCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value of x:");
double x = scanner.nextDouble();
try {
double result = computeFunction(x);
System.out.println("Result: " + result);
} catch (ArithmeticException e) {
System.err.println("Error: " + e.getMessage());
}
}
public static double computeFunction(double x) throws ArithmeticException {
double sinX = Math.sin(x);
double cosX = Math.cos(x);
double tanX = Math.tan(x);
double cotX = 1.0 / tanX;
if (sinX + cosX <= 0) {
throw new ArithmeticException("Invalid operation: log(sin(x) + cos(x)) is not defined for the given value of x.");
}
if (tanX- cotX == 0) {
throw new ArithmeticException("Invalid operation: division by zero (tan(x)- cot(x)).");
}
double numerator = Math.log(sinX + cosX);
double denominator = tanX- cotX;
return numerator / denominator;
}
}