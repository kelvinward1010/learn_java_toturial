package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter a number to divide: ");
            int x = scanner.nextInt();

            System.out.println("The number type to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("Result: " + z);
        } 
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a number to divide!");
        }

        catch(Exception e){
            System.out.println("'Something went wrong!");
        }
        finally {
            System.out.println("This will divide");
        }
    }
}
