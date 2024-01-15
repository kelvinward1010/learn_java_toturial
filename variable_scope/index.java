package variable_scope;
import java.util.Random;
public class index {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();
    }
}


class DiceRoller {

    //global variables
    Random random;
    int number = 0;

    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(number);
        System.err.println(number);
    }
}