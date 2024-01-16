package polymorphisms;

public class index {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehacel[] racers = {car,bicycle,boat};

        // car.go();
        // bicycle.go();
        // boat.go();

        for(Vehacel x : racers) {
            x.go();
        }
    }
}


class Vehacel {
    public void go(){

    };
}


class Car extends Vehacel{

    @Override
    public void go(){
        System.out.println("The car is moving!");
    }
}

class Bicycle extends Vehacel{

    @Override
    public void go(){
        System.out.println("The bicycle is moving!");
    }
}


class Boat extends Vehacel{

    @Override
    public void go(){
        System.out.println("The boat is moving!");
    }
}