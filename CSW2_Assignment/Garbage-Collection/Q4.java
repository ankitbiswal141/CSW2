class AnonymousObject {
    String name;
    public AnonymousObject(String name) {
    this.name = name;
    }
    
   @Override
    protected void finalize() throws Throwable {
    System.out.println("Garbage collecting object: " + name);
    }
    }
    public class Q4 {
    public static void main(String[] args) {
    new AnonymousObject("Anonymous Object") {
    
    @Override
    protected void finalize() throws Throwable {
    super.finalize();
    }
    };
    
    System.gc();
    }
    }