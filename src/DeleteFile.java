import java.io.File;

public class DeleteFile {

    static void deleteFile(String fileName){

        File deletedFile = new File(fileName);

        if(deletedFile.delete()){
            System.out.println("The file "+ deletedFile.getName()+ " has been deleted");
        }else{
            System.out.println("There was an error deleting the file "+ deletedFile.getName());
        }
    }
}

