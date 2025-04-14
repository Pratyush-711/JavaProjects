public class Car {
    String brand;
    String model;
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        System.out.println("Car Details:");
        myCar.displayDetails();
        System.out.println("\nCar Details printed directly:");
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
    }
}
