package inheritance;

public class index {
    public static void main(String[] args) {
        
        Car car = new Car();

        car.go();

        Bicycle bicycle = new Bicycle();

        bicycle.stop();

        System.out.println(car.pedals);
    }
}


class Vehicle{
    double speed;

    void go(){
        System.out.println("Moving " + speed);
    }

    void stop() {
        System.out.println("Stopping " + speed);
    }
}

class Car extends Vehicle{
    int wheels = 5;
    int pedals = 5;
}

class Bicycle extends Vehicle{
    int wheels = 2;
    int pedals = 2;
}