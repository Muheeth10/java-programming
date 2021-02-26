package Files;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main (String args[]){
        try{
            FileWriter mywriter = new FileWriter("c:\\users\\muhee\\documents\\filedemo.txt");
            mywriter.write("this is a demo file");
            mywriter.close();
            System.out.println("Successfully Wrote to file");
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
    }
}
