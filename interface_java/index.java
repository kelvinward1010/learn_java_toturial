package interface_java;

public class index {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();


        fish.flee();
        fish.hunt();
    }
}


interface Predator {
    void hunt();
}

interface Prey {
    void flee();
}

class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println("Rabbit is fleeing");
    }
    
}

class Hawk implements Predator{

    @Override
    public void hunt() {
        System.out.println("The hawk is hunt");
    }
}


class Fish implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("The fish is hunt");
    }

    @Override
    public void flee(){
        System.out.println("The fish is fleeing");
    }
}