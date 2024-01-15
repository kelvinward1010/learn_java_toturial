package random;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();

        int x = rand.nextInt(9) + 1;
        double y = rand.nextDouble();
        boolean z = rand.nextBoolean();

        System.out.println(z);
    }

    public static int nextInt(int number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextInt'");
    }
}