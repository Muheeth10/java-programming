package Files;


import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String arg[]){
       try{
           File myfile = new File("c:\\users\\muhee\\documents\\filedemo.txt");
           if(myfile.createNewFile()){
               System.out.println("The Name of the file is "+myfile.getName());
           }
           else{
               System.out.println("File already exists");
           }
       }
       catch(IOException ie){
           ie.printStackTrace();
       }
    }
}
