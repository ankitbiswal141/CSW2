import java.util.Scanner;
public class ExpressionCalculator {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the value of x:");
 double x = scanner.nextDouble();
 try {
 double result = calculateExpression(x);
 System.out.println("Result: " + result);
 } catch (ArithmeticException e) {
 System.err.println("Error: " + e.getMessage());
 }
 }
 public static double calculateExpression(double x) throws ArithmeticException {
 double sinX = Math.sin(x);
 double cosX = Math.cos(x);
 double tanX = Math.tan(x);
 double numerator = Math.sqrt(Math.abs(sinX * cosX));
 double denominator = tanX + 1;
 if (denominator == 0) {
 throw new ArithmeticException("Division by zero is not allowed.");
 }
 if (numerator < 0) {
 throw new ArithmeticException("Square root of a negative number is not allowed.");
 }
 return numerator / denominator;
 }
 }