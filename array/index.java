package array;

public class index{
    public static void main(String[] args) {
        //StringArray.main();
        array_2d.main();
    }
}


class StringArray{
    public static void main() {
        String[] cars = {"Camaro", "Camino", "TESLA"};
        cars[0] = "Mustang";


        String[] cars2 = new String[3];

        cars2[0] = "Mustang";
        cars2[1] = "BWM";
        cars2[2] = "TESLA";

        for(int i = 0; i < cars2.length; i++){
            System.out.println(cars2[i]);
        }
    }
}

class array_2d {
    public static void main(){

        //String[][] cars = new String[3][3]; 

        // cars[0][0] = "Camaro1";
        // cars[0][1] = "Camaro2";
        // cars[0][2] = "Camaro3";
        // cars[1][0] = "Camaro4";
        // cars[1][1] = "Camaro5";
        // cars[1][2] = "Camaro6";
        // cars[2][0] = "Camaro7";
        // cars[2][1] = "Camaro8";
        // cars[2][2] = "Camaro9";

        String[][] cars = 
                        {{"Camaro1", "Camaro2", "Camaro3"},
                        {"Camaro4", "Camaro5", "Camaro6"},
                        {"Camaro7", "Camaro8", "Camaro9"}};

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + "");
            }
        }
    }
}