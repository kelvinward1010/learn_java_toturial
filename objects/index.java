package objects;

public class index {
    public static void main(String[] args) {
        
        double pi = 3.141592653589793;
        pi = 4;

        final double PI = 3.141592653589793; // can't change the value

        Car myCar = new Car();
        Car myCar2 = new Car();

        // System.out.println(myCar.make);
        // System.out.println(myCar.model);

        myCar.driver();
        myCar2.brake();
    }
}

// I have a bug with import car in another package file

class Car {
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 5000.00;

    void driver() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You brake the car");
    }
}

