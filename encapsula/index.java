package encapsula;

public class index {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model X", 2020);

        System.out.println(car.getMake());
        System.out.println(car.getYear());
        System.out.println(car.getModel());

        car.setMake("BWM");
        System.out.println(car.getMake());
    }
}


class Car {
    private String make, model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}