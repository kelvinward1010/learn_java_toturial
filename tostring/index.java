package tostring;

public class index {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        System.out.println(car.toString());
    }
}


class Car{
    String make = "Ford", model = "Mustang", color = "red";
    int year = 2023;

    public String toString() { 
        String myString = make + " " + model + " " + color + " " + year;

        return myString;
    }
}