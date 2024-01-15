package basic_concept.loops;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        //whileloop.main(args);
        //forloop.main(args);
        nestedloop.main(args);
    }   
}

class whileloop{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String name = "";

            while (name.isBlank()) {
                System.out.println("Enter name: ");
                name = scanner.nextLine();
            }

            System.out.println("Hello " + name);
        }
    }
}

class forloop{
    public static void main(String[] args) {
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i-=2) {
            System.out.println(i);
        }

        System.out.println("Happy new year!");
    }
}


class nestedloop{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int rows;
            int columns;
            String symbol = "";

            System.out.println("Enter # of the rows: ");
            rows = scanner.nextInt();

            System.out.println("Enter # of the columns: ");
            columns = scanner.nextInt();

            System.out.println("Enter symbol to use: ");
            symbol = scanner.next();

            for(int i = 1; i <= rows; i ++){
                 System.out.println();
                for(int j = 1; j <= columns; j ++){
                    System.out.print(symbol);
                }
            }
        }
    }
}