package basic_concept.mathclass;

import java.util.Scanner;

public class mathclass {
    public static void main(String[] args){
        // double x = 3.14;
        // double y = -10;

        // double z1 = Math.max(x, y);
        // double z2 = Math.abs(y);
        // double z3 = Math.sqrt(z2);
        // double z4 = Math.round(z1);
        // double z5 = Math.ceil(x);
        // double z6 = Math.floor(x);

        // System.out.println(z5);
        tamgiac.main();
    }
}


class tamgiac {
    public static void main(){
        double x;
        double y;
        double z;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter side x: ");
            x = scanner.nextDouble();
            System.out.println("Enter side y: ");
            y = scanner.nextDouble();


            z = Math.sqrt((x*x) + (y*y));
            System.out.println("The hypothesis: " + z);

            scanner.close();
        }
    }
}