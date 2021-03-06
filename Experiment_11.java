import java.lang.Math.*;
import java.util.Scanner;
abstract class Shape {
  Scanner sc = new Scanner(System.in);
    int a;
    int b;
    
    public Shape(){
        System.out.println("Enter the value of the (length of Rectangle/side of square/radius of circle)");
        a=sc.nextInt();
        System.out.println("Enter the  value (breadth of Rectangle/side of square/radius of circle)");
        b=sc.nextInt();
        this.a=a;
        this.b=b;
    }

    abstract void print_area();
}


class Rectangle1 extends Shape{
    void print_area(){
        System.out.println("Area of the Rectangle of length = "+a+" breadth = "+b+" is");
        double area=a*b;
        System.out.println(area);
    }
}

class Square1 extends Shape{
    void print_area(){
        System.out.println("area of the Square with side "+a+" is");
        double area=a*a; 
        System.out.println(area);
    }
}

class Circle extends Shape{
    void print_area(){
        System.out.println("Area of circle with radius"+a);
        double area=a*a*Math.PI;//value b = pie
        System.out.println(area);
    }
}


public class Experiment_11
{
	public static void main(String[] args) {
		Rectangle1 rc = new Rectangle1();
		rc.print_area();
		Square1 sq=new Square1();
		sq.print_area();
		Circle cr=new Circle();
		cr.print_area();
	}
}


