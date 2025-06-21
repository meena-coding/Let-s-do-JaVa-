package in.aryancoding.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write the name of the file you wish to Read: ");
        String filename = sc.next();

        try(FileReader reader = new FileReader(filename)){

            int read;
            while((read = reader.read()) != -1){
                System.out.print((char) read);
            }

        } catch (FileNotFoundException e){
            System.out.printf("%s file not found in the directory",filename);

        } catch (IOException e){
            System.out.printf("Exception occurred: %s",e.getMessage());

        }
    }
}
