package Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main (String args[]){
        File myfile = new File("c:\\users\\muhee\\documents\\filedemo.txt");
        try{
            Scanner reader = new Scanner(myfile);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
    }
}
