import java.util.Scanner;
public class FunctionEvaluator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value of x:");
double x = scanner.nextDouble();
double result = evaluateFunction(x);
System.out.println("Result: " + result);
}
public static double evaluateFunction(double x) {
double sinX = Math.sin(x);
double cosX = Math.cos(x);
if (Double.isNaN(sinX) | Double.isNaN(cosX)) {
throw new ArithmeticException("Invalid input: Math operation resulted in NaN (Not-a-Number).");
}
double numerator = sinX * cosX;
double denominator = sinX + cosX;
if (denominator == 0) {
throw new ArithmeticException("Invalid input: Division by zero.");
}
return numerator / denominator;
}
}