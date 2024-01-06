package variables;

public class variable {
    public static void main(String[] args) {
        variableservice.show_2();
    }
}

class variableservice {
    static void show_1() {
        String name = "Kelvin";
        System.err.println(name);

        int number;
        number = 1010;
        System.out.println(number);

        float floatValue = 1.99f;
        System.out.println(floatValue);

        char charValue = 'D';
        System.out.println(charValue);

        boolean booleanValue = false;
        System.out.println(booleanValue);
    }

    static void show_2() {
        String name = "Kelvin";
        System.out.println("My name is " + name);

        String firstname = "Kelvin";
        String lastname = "Ward";
        String fullname = firstname + ' ' + lastname;
        System.out.println(fullname);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        int x2 = 5;
        int y2 = 6;
        int z2 = 50;
        System.out.println(x2 + y2 + z2);
    }
}