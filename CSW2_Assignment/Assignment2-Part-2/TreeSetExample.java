import java.util.TreeSet;
public class TreeSetExample {
public static void main(String[] args) {
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(5);
treeSet.add(2);
treeSet.add(8);
treeSet.add(1);
treeSet.add(4);
System.out.println("Initial TreeSet: " + treeSet);
Scanner scanner = new Scanner(System.in);
System.out.println("\nEnter a number to search: ");
int num = scanner.nextInt();
System.out.println("Is " + num + " present in the TreeSet? " + treeSet.contains(num));
treeSet.remove(5);
System.out.println("\nUpdated TreeSet: " + treeSet);
}
}