import java.util.InputMismatchException;
import java.util.Scanner;
public class InputReader {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter an integer:");
try {
int number = readInteger(scanner);
System.out.println("You entered: " + number);
} catch (InputMismatchException e) {
System.err.println("InputMismatchException: Please enter a valid integer.");
}
}
public static int readInteger(Scanner scanner) throws InputMismatchException {
int number;
try {
number = scanner.nextInt();
} catch (InputMismatchException e) {
scanner.next();
throw e;
}
return number;
}
}