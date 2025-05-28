
// Exercise 17: Class and Object Creation
class Car {
    String make, model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}

public class Exercise17 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022);
        car1.displayDetails();
    }
}
