import java.util.Scanner;
public class SquareRootFinder {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter an integer:");
int number = scanner.nextInt();
try {
double squareRoot = findSquareRoot(number);
}
}
System.out.println("Square root of " + number + " is: " + squareRoot);
} catch (ArithmeticException e) {
System.out.println("Error: " + e.getMessage());
public static double findSquareRoot(int number) throws ArithmeticException {
if (number < 0) {
throw new ArithmeticException("Square root of a negative number is undefined.");
}
return Math.sqrt(number);
}
}