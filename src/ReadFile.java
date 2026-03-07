import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    static void readFile(String filename){

        File myObj = new File(filename);

        try(Scanner myReader= new Scanner(myObj)){
            while(myReader.hasNextLine()){

                String data = myReader.nextLine();
                System.out.println(data);

            }
        }catch(FileNotFoundException e){

            System.out.println("There was an error accessing the File");
            e.printStackTrace();
        }
    }
}
