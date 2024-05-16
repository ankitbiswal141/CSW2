import java.util.Scanner;
 public class TrigonometricExpressionCalculator {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the value of x:");
 double x = scanner.nextDouble();
 double result = calculateExpression(x);
 System.out.println("Result: " + result);
 }
 public static double calculateExpression(double x) {
 double epsilon = 1e-10;
double piOver2 = Math.PI / 2.0;
 for (int n =-100; n <= 100; n++) {
 double multipleOfPiOver2 = n * piOver2;
 if (Math.abs(x- multipleOfPiOver2) < epsilon) {
 System.err.println("Error: x is close to " + multipleOfPiOver2 + ", which is a multiple of pi/2.");
 return Double.NaN;
 }
 }
 double sinX = Math.sin(x);
 double cosX = Math.cos(x);
 double tanX = Math.tan(x);
 return (sinX + cosX) / tanX;
 }
 }