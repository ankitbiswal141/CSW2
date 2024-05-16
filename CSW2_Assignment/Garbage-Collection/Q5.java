class DataMembers {
    private int intValue;
    private double doubleValue;
    public void initialize(int intVal, double doubleVal) {
    intValue = intVal;
    doubleValue = doubleVal;
    }
    public void setIntValue(int intVal) {
    intValue = intVal;
    }
    public void setDoubleValue(double doubleVal) {
    doubleValue = doubleVal;
    }
    public int getIntValue() {
    return intValue;
    }
    public double getDoubleValue() {
   }
    }
    return doubleValue;
    public class Q5 {
    public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
   
    long totalMemory = runtime.totalMemory();
    
    DataMembers obj1 = new DataMembers();
    DataMembers obj2 = new DataMembers();
   
    obj1.initialize(ThreadLocalRandom.current().nextInt(100),
    ThreadLocalRandom.current().nextDouble());
    obj2.initialize(ThreadLocalRandom.current().nextInt(100),
    ThreadLocalRandom.current().nextDouble());
  
    obj1 = null;
    obj2 = null;
   
    runtime.gc();
   
    long usedMemory = runtime.totalMemory()- runtime.freeMemory();
    System.out.println("Total memory allocated: " + totalMemory + " bytes");
    System.out.println("Memory occupied by objects: " + usedMemory + " bytes");
    }
    }