package ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throws_example {
    // throws will say the whole code as vulnerable
    //try and catch say only 2to 3 lines alone
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException {
        readFile();
    }

    private static void readFile() throws FileNotFoundException, ArithmeticException {
        System.out.println("Hello Pramod");
        try {
            String path = "E:/BACK UP/New folder/Documents/Sound recordings";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        }
        catch(Exception e)
        {
            System.out.println("file not found/ file  not able to access");
        }

        // read the file txt it can read the file
        System.out.println("End of the program");


    }
}
