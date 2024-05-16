public class Q3 {
    public static void main(String[] args) {
    String str = null;
    try {
    if (str.length() > 0) {
    System.out.println(str.toLowerCase());
    }
    } catch (NullPointerException e) {
    CustomNullPointerException ex = new CustomNullPointerException("The string variable is null.");
    System.err.println(ex.getMessage());
    System.out.println("Instead of null, you can initialize the string variable with an empty string:");
    String str2 = "";
    if (str2.length() > 0) {
    System.out.println(str2.toLowerCase());
    }
    }
    }
    }