package datatype;

public class datatype {
    public static void main(String[] args) {
        //exampleType.main(args);
        //numberType.main();
        //booleanType.main();
        characterType.main();
    }
}


class exampleType {
    static void main(String[] args) {
        int number = 5;               // Integer (whole number)
        float floatValue = 5.99f;    // Floating point number
        char charValue = 'D';         // Character
        boolean boolValue = true;       // Boolean
        String textValue = "Hello";     // String

        System.out.println(number);
        System.out.println(floatValue);
        System.out.println(charValue);
        System.out.println(boolValue);
        System.out.println(textValue);
    }
}

class numberType {
    static void main() {
        int number_1 = 100;
        System.out.println(number_1);

        long longValue = 123000L;
        System.out.println(longValue);

        float floatValue = 5.55f;
        System.out.println(floatValue);

        double doubleValue = 177.77d;
        System.out.println(doubleValue);

        byte byteValue = 100;
        System.out.println(byteValue);

        //Scientific Numbers

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
    }
}

class booleanType {
    static void main() {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
    }
}


class characterType {
    static void main() {
        char var_1 = 10, var_2 = 11, var_3 = 12;
        System.out.println(var_1);
        System.out.println(var_2);
        System.out.println(var_3);

        String greeting = "Hello World";
        System.out.println(greeting);
    }
}