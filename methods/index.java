package methods;

public class index {
    public static void main(String[] args) {
        // String name = "Kelvin";
        // int age = 23;
        // hello(name, age);

        int x = 3;
        int y = 2;
        //plus(x, y);

        int z = plus(x, y);
        System.out.println(z);
    }

    static void hello(String name, int currentAge) {
        System.out.println("Hello " + name);
        System.out.println("You're " + currentAge + " years old!");
    }

    static int plus(int x, int y) {
        
        // System.out.println(z);
        int z = x + y;
        return z;
    }
}
