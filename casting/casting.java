package casting;

public class casting {
    public static void main(String[] args) {
        //WideningCasting.main();
        NarrowingCasting.main();
    }
}

// Java Type Casting
// Type casting is when you assign a value of one primitive data type to another type.

// In Java, there are two types of casting:

// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte


class WideningCasting{
    static void main(){
        int number = 9;
        long numberLong = number;
        double number_widening = number;

        System.out.println(number);
        System.out.println(numberLong);
        System.out.println(number_widening);
    }
}


class NarrowingCasting {
    static void main(){
        short number = 10;
        char number_narrowing = (char) number;
        int number_narrowing_2 = (int) number;

        System.out.println(number);
        System.out.println(number_narrowing);
        System.out.println(number_narrowing_2 + number);
    }
}