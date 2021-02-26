package Files;

import java.io.File;

public class FileInformation {
    public static void main(String args[]){
        File myfile = new File("c:\\users\\muhee\\documents\\filedemo.txt");
        if(myfile.exists()){
            System.out.println("File name is "+myfile.getName());
            System.out.println("is File readable " + myfile.canRead());
            System.out.println("is File writable "+ myfile.canWrite());
            System.out.println("length of the file is "+myfile.length());
        }
        else{
            System.out.println("file doesn't exists");
        }
    }
}
