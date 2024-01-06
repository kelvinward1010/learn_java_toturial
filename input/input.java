package input;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        test_1.main();
    }
}

class test_1 {
    static void main(){

        // you can use like: Scanner scanner = new Scanner(System.in);
        // but you have a wanring scanner

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("What's your name? ");
            String name = scanner.nextLine();

            System.out.println("How's old are you? ");
            int age = scanner.nextInt();

            scanner.nextLine(); // if not this line, your broke up
            System.out.println("What's your favorite food? ");
            String food = scanner.nextLine();

            System.out.println("Hello " + name);
            System.out.println("You are " + age + " years old!");
            System.out.println("You like " + food);
        }
    }
}