import java.util.Scanner;

class BookFair{
        String Bname;
        double price;
        Scanner sc = new Scanner(System.in);
        
        public BookFair(){}
    
        public BookFair(String Bname,double price){
            this.Bname=Bname;
            this.price=price;
        }
        public void Input(){
            System.out.println("Enter the Name of the book");
            Bname=sc.nextLine();
            System.out.println("Enter the Price of the book");
            price=sc.nextDouble();
        }
        public void calculate(){
            if(price<=1000.00){
                price = price-(price*0.02);
            }
            else if(price>1000.00 && price<=3000.00){
                price =price-(price*0.1);
            }
            else if(price>3000.00){
                price=price-(price*0.15);
            }
        }
        public void display(){
            System.out.println("Name of the book = "+Bname);
            System.out.println("Price of the book after discount = "+price);
        }
}

public class BFair{
    public static void main(String args[]){
        BookFair book1;
        book1= new BookFair();
        book1.Input();
        book1.calculate();
        book1.display();

}

}