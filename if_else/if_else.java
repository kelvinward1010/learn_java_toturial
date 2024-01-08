package if_else;

public class if_else {
    public static void main(String[] args) {
        int age = 17;
        
        if(age >= 18){
            System.out.println("Your are an adult!");
        }
        else if(age <= 18 && age >= 12){
             System.out.println("Your are an teenager!");
        }
        else if(age <= 30 && age >= 18){
             System.out.println("Your are an adult!");
        }
        else{
            System.out.println("Your are an child!");
        }
    }
}
