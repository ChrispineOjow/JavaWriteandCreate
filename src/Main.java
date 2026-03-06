import java.util.Scanner;

public class Main{

    static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to write or create a file: ");
        String choice = input.nextLine().toLowerCase();

        if(choice.equals("create")) {


            System.out.print("Input the Filename to be created: ");
            String filename = input.nextLine().trim().toLowerCase();
            if (filename.isBlank() || filename.equals(".")) {
                System.out.println("Enter a FileName");
            } else {
                String fileName = filename + ".txt";

                CreateFile.createMyFile(fileName);
            }

        } else if (choice.equals( "write")) {

            System.out.print("Enter the name of the file: ");
            String fileName = input.nextLine().trim().toLowerCase();
            if(fileName.trim().isBlank()){
                System.out.println("Please enter the field you want to write in");
            }else{
                if(!fileName.contains(".txt")){
                    fileName = fileName+".txt";
                }
                System.out.println("Enter the details: ");
                String entry = input.nextLine();
                WriteFile.writeFile(fileName,entry);
            }

        }else{
            System.out.println("Enter either Create or Write");
        }
    }


}