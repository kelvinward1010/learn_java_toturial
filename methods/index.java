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

        OverloadMethod.main(args);
    }

    static void hello(String name, int currentAge) {
        System.out.println("Hello " + name);
        System.out.println("You're " + currentAge + " years old!");
    }

    static int plus(int x, int y) {
        int z = x + y;
        return z;
    }

    static int div(int x, int y) {
        int z = x / y;
        return z;
    }
}


class OverloadMethod {
    public static void main(String[] args) {
        int z = add(1, 2);
        System.out.println(z);
    }

    static int add(int a, int b){
        System.out.println("This is overload #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overload #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overload #3");
        return a + b + c + d;
    }
}