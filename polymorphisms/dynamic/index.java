package polymorphisms.dynamic;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)){

            Animal animal;

            System.out.println("What is the name of the animal?");
            System.out.print("1. Dog -------- 2. Cat : ");

            int choice = scanner.nextInt();

            if(choice == 1){
                animal = new Dog();
                animal.speak();
            }
            else if(choice == 2){
                animal = new Cat();
                animal.speak();
            }
            else{
                animal = new Animal();
                System.out.println("That chose invalid!");
                animal.speak();
            }
        }
    }
}


class Animal {
    public void speak(){
        System.out.println("Animal speak!");
    }
}

class Dog extends Animal {

    @Override
    public void speak(){
        System.out.println("The dog is gose gose");
    }
}

class Cat extends Animal {
    @Override
    public void speak(){
        System.out.println("The cat is loud");
    }
}