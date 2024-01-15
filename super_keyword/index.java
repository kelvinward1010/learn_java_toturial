package super_keyword;

public class index{
    public static void main(String[] args) {
        Hero hero1 = new Hero("Baman", 42, "Intelli");
        Hero hero2 = new Hero("Superman", 45, "Intelli");

        // System.out.println(hero1.name);
        // System.out.println(hero1.power);

        System.err.println(hero2.toString());
    }
}


class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + " " + this.age;
    }
}

class Hero extends Person {
    String power;

    Hero(String name, int age, String power){
        super(name, age);
        this.power = power;
    }

    public String toString(){
        return super.toString() + " " + this.power;
    }
}