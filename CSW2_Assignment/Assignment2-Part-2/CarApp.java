import java.util.*;
class Car implements Comparable<Car> {
    private int modelNo;
    private String name;
    private int stock;
    public Car(int modelNo, String name, int stock) {
    this.modelNo = modelNo;
    this.name = name;
    this.stock = stock;
    }
    public int getModelNo() {
    return modelNo;
    }
    public void setModelNo(int modelNo) {
    this.modelNo = modelNo;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public int getStock() {
    return stock;
    }
    public void setStock(int stock) {
    this.stock = stock;
    }
    public int compareTo(Car car) {
    return Integer.compare(this.stock, car.stock);
    }
    public String toString() {
    return String.format("%d %s %d", modelNo, name, stock);
    }
    }
    public class CarApp {
    public static void main(String[] args) {
    List<Car> carList = new ArrayList<>();
    carList.add(new Car(2013, "creta", 10));
    carList.add(new Car(2020, "MG", 13));
    carList.add(new Car(2018, "Kia", 20));
    carList.add(new Car(2017, "Audi", 45));
    carList.add(new Car(2015, "BMW", 55));
    System.out.println("Initial Car List:");
    for (Car car : carList) {
    System.out.println(car);
    }
    Collections.sort(carList);
    System.out.println("\nSorted Car List by Stock:");
    for (Car car : carList) {
    System.out.println(car);
    }
    }
    }