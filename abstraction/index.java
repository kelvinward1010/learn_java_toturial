package abstraction;

public class index {
    public static void main(String[] args) {
        //Vehical vehicle = new Vehical();
        Car car = new Car();

        car.go();
    }
}


abstract class Vehical{

    abstract void go();
}


class Car extends Vehical{

    @Override
    void go() {
        System.out.println("The driver is running");
    }
}