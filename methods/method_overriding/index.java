package methods.method_overriding;

public class index {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
        animal.speak();
    }
}

class Animal {

    String name;

    void speak() {
        System.out.println("The animal speaking!");
    }
}


class Dog extends Animal {

    //@Override // take everything from animal
    void speak() {
        System.out.println("The dog go go!");
    }
}

class Chicken extends Animal {
    void speak() {
        System.out.println("The chicken chic chic!");
    }
}