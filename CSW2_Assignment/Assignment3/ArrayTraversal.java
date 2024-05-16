public class ArrayTraversal {
    public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    traverseArray(array, 0);
    }
    public static void traverseArray(int[] array, int index) {
    if (index >= array.length) {
   }
    System.out.println("End of array reached. Recursion terminated.");
    return;
    try {
    System.out.println("Element at index " + index + ": " + array[index]);
    traverseArray(array, index + 1);
    } catch (ArrayIndexOutOfBoundsException e) {
    System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
    traverseArray(array, index + 1);
    }
    }
    }