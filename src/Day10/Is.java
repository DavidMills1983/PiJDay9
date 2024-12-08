package Day10;


//Write a program that shows the names of the files in the current directory on screen. (Hint: look at
//methods from class File).


import java.io.File;

public class Is {

    public static void main(String[] args) {

        try {

            File file = new File("../");

            File[] files = file.listFiles();

            System.out.println("Contents of the directory: ");

            for (File f : files){
                if (f.isFile()) {
                    System.out.println("File: " + f.getName());
                } else if (f.isDirectory()){
                    System.out.println("Directory: " + f.getName());
                }
            }

        }
        catch (NullPointerException e){
            System.err.println("Empty directory");

        }



    }

}
