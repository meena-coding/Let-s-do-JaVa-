package in.AryanCoding.file;
import java.io.FileWriter;
import java.io.IOException;

public class meenaCodingWriter {

    public static void main(String[] args) {

        String fileName = "java-course.txt";

//        FileWriter writer = null;    --> to solve this kind of error, we use try with resources.
        try (FileWriter writer = new FileWriter(fileName)){

            for (int i = 0; i < 10000; i++) {
                writer.write('*');

            }
            writer.write("This is the best java course");
            writer.flush();
            System.out.println("File written successfully");
        }catch (IOException exception){
            System.out.printf("Exception occurred %s",exception.getMessage());

        }
    }
}
