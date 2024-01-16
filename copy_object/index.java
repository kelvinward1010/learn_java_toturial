package copy_object;

public class index {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "model", 2012);
        Car car2 = new Car("TELSA", "model2", 2022);

        Car car3 = new Car(car1);

        //car1 = car2;
        car1.copy(car2);

        System.out.println(car1.getMake());
        System.out.println(car2.getMake());

        System.out.println(car3);

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

    Car(Car x){
        this.copy(x);
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

    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}