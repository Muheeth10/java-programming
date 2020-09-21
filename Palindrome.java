import java.util.Scanner;

public class Palindrome
{
 public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String str=in.nextLine();
        String rev="";
    
        int len = str.length();
    
        for (int i = len - 1 ; i >= 0 ; i--){
          rev = rev + str.charAt(i);
        }
    
        System.out.println("reverse of the string: " + rev);
        
        if(str.equals(rev))
            System.out.println(str+" is a Palindrome");
        else if(str.substring(0,1).equals(str.substring(len-1)))
            System.out.println(str+" is a special String");
        else 
            System.out.println("it is not a palindrome and not special a string");
        }
 
}