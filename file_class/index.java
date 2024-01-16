package file_class;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class index {
    public static void main(String[] args) {
        
        // File file = new File("test.txt");

        // if(file.exists()){
        //     System.out.println("This file exists!");
        //     System.out.println(file.getPath());
        //     System.out.println(file.getAbsolutePath());
        //     System.out.println(file.isFile());
        //     file.delete();
        // }else{
        //     System.out.println("This file does not exist!");
        // }

        //Write file
        // try {
        //     FileWriter writer = new FileWriter("test.txt");
        //     writer.write("HELLO\nOk em\n ahaha");
        //     writer.append("\nHome gunt");
        //     writer.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        //Read file
        try {
            FileReader reader = new FileReader("test.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }

            reader.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
