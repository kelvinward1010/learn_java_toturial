package objects.array_of_object;

public class index {
    public static void main(String[] args) {

        //Food[] refrigerator = new Food[3];

        Food food_1 = new Food("pizza");
        Food food_2 = new Food("apple");
        Food food_3 = new Food("orange");

        // refrigerator[0] = food_1;
        // refrigerator[1] = food_2;
        // refrigerator[2] = food_3; 

        Food[] refrigerator = {food_1, food_2, food_3};

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}


class Food {
    // public static void main(String[] args) {
    //     int[] numbers = new int[3];
    //     char[] characters = new char[4];
    //     String[] strings = new String[5];
    // }

    String name;
    Food(String name) {
        this.name = name;
    }
}