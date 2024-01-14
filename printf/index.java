package printf;

public class index {
    public static void main(String[] args) {
        System.out.printf("This is a format string %d", 123);

        boolean myBoolean = false;
        char myChar = '@';
        String myString = "Kelvin";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n\n", myDouble);

        System.out.printf("Hello %10s\n", myString);

        System.out.printf("%.2f\n", myDouble);

        System.out.printf("%,f\n", myDouble);
        System.out.printf("%020f\n", myDouble);
    }
}
