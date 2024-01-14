package arraylist;

import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        arrayList_3.main();
    }
}


class arrayList_1 {
    public static void main() {

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hotdog");
        food.add("Humberger");

        food.set(0, "Sushi");
        food.remove(1);
        //food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        
    }
}


class arrayList_2 {
    public static void main() {

        ArrayList<ArrayList<String>> cropList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomatos");
        produceList.add("Peppers");

        ArrayList<String> dirnkList = new ArrayList<String>();
        dirnkList.add("Sola");
        dirnkList.add("chill");
        dirnkList.add("coffee");


        cropList.add(bakeryList);
        cropList.add(produceList);
        cropList.add(dirnkList);

        System.out.println(cropList.get(0).get(1));
    }
}

class arrayList_3 {
    public static void main() {
        //for each

        //String[] animals = {"cat", "dog", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("bird");

        for(String animal : animals){
            System.out.println(animal);
        }
    }
}