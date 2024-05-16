import java.util.Scanner;
public class IntegerConverter {
public static int convertToInt(String input) {
Scanner scanner = new Scanner(System.in);
boolean isValidInput = false;
int number = 0;
while (!isValidInput) {
try {
number = Integer.parseInt(input);
isValidInput = true;
} catch (NumberFormatException e) {
System.out.println("Invalid input. Please enter a valid number:");
input = scanner.nextLine();
}
}
return number;
}
public static void main(String[] args) {
String input = "hello";
int number = convertToInt(input);
System.out.println("The integer value is: " + number);
}
}