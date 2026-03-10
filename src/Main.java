import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to write or create a file or read a file or delete a file:  ");
        String choice = input.nextLine().toLowerCase();

        if(choice.equals("create")) { //This is to create a file with the extension .txt


            System.out.print("Input the Filename to be created: ");
            String filename = input.nextLine().trim().toLowerCase();
            if (filename.isBlank() || filename.equals(".")) {
                System.out.println("Enter a FileName");
            } else {
                if(!filename.contains(".txt")){
                    filename = filename + ".txt";
                }


                CreateFile.createMyFile(filename);
            }

        } else if (choice.equals( "write")) { // This is to write and append a file with the extension .txt

            System.out.print("Enter the name of the file: ");
            String fileName = input.nextLine().trim().toLowerCase();
            if(fileName.isBlank()){
                System.out.println("Please enter the field you want to write in");
            }else{
                if(!fileName.contains(".txt")){
                    fileName = fileName+".txt";
                }
                System.out.println("Enter the details: ");
                String entry = input.nextLine();
                WriteFile.writeFile(fileName,entry);
            }

        } else if (choice.equals("read")) { // this is to read a file with the extension .txt

            System.out.print("Enter the name of the file: ");
            String filename = input.nextLine().trim().toLowerCase();
            if(filename.isBlank()){
                System.out.println("Please enter a file name");
            }else{
                if(!filename.contains(".txt")){
                    filename = filename+ ".txt";
                }

                ReadFile.readFile(filename);
            }

        } else if (choice.equals("delete")) {
            System.out.print("Enter the name of the file you want to delete: ");
            String fileName = input.nextLine().trim().toLowerCase();

            if(fileName.isBlank()){;
                System.out.println("Please enter the filename of the file you want to delete!!!");
            }else{
                if(!fileName.contains(".txt")){
                    fileName = fileName + ".txt";
                }
                DeleteFile.deleteFile(fileName);
            }

        } else{
            System.out.println("Enter either Create or Write or Read");
        }
    }


}