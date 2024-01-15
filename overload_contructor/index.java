package overload_contructor;

public class index {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("dry", "sweet");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}

class Pizza {

    String bread, sauce, cheese, topping;

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}