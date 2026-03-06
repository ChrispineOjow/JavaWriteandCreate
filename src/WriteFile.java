import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    static void writeFile(String fileName, String entry){

        try{
            FileWriter myObj = new FileWriter(fileName);
            myObj.write(entry);
            System.out.println("The file has been written in " + fileName);
            myObj.close();
        }catch(IOException e){
            System.out.println("Their was an error in writing the file");
        }
    }
}
