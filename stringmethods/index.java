package stringmethods;


public class index {
    public static void main(String[] args) {
        
        String name = "Kelvin";

        //boolean result = name.equals("Kelvn");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("K");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace("n", "N");

        System.out.println(result);

    }
}