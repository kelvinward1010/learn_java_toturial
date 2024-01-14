package contructors;

public class index {
    public static void main(String[] args) {
        String name = "Kelvin";
        int age = 23;
        double weight = 65.4;
        Human human = new Human(name, age, weight);

        Human human2 = new Human("Tyler", age, weight);

        System.out.println(human.name);
        System.out.println(human2.name);

        human2.eat();
        human.drinking();
    }
}


class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + " eating pizza");
    }

    void drinking(){
        System.out.println(this.name + " drinking pizza");
    }
}