package logical_operator;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        
        // int temp = 25;

        // if(temp > 50) {
        //     System.out.println("It is hot outside");
        // }
        // else if(temp >= 30 && temp <= 40) {
        //     System.out.println("It is hot outside");
        // }
        // else if(temp >= 20 && temp <= 30){
        //     System.out.println("It is warm outside");
        // }
        // else{
        //     System.out.println("It is cold outside");
        // }



        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("You are playing a game! Press q or Q to quit.");
            String response = scanner.next();

            if(!response.startsWith("q") || !response.startsWith("Q")) {
                System.out.println("You quit the game.");
            }
            else{
                System.out.println("You quit still playing game.");
            }
        };

    }
}
