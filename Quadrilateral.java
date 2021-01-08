import java.util.Scanner;
class QuadrilateralTest{
    double x;
    double y;
    Scanner sc=new Scanner(System.in);
}
class Parallelogram extends QuadrilateralTest{
    double a=60;//default angle
    public void input(){
        System.out.println("Enter the side1 value of Parallelogram");
        x=sc.nextDouble();
        System.out.println("Enter the side2 value of Parallelogram");
        y=sc.nextDouble();
    }
    public void changeAngle(){
        System.out.println("Enter the new angle of the Parallelogram");
        a=sc.nextDouble();      
    }
    public double area(){
        System.out.println("Area is calculated when angle is "+a+"°");
        return a*x*y;
    }
    
   }
class Rectangle extends QuadrilateralTest{
    
    public void input(){
        System.out.println("Enter the side1 value of the Rectangle");
        x=sc.nextDouble();
        System.out.println("Enter the side2 value of the Rectangle");
        y=sc.nextDouble();
    }
    
    public double area(){
        
        return x*y;
    }
    
   }
class Square extends QuadrilateralTest{
    
    public void input(){
        System.out.println("Enter the side value of the Sqaure");
        x=sc.nextDouble();
       
    }
    
    public double area(){
        return x*x;
    }
    
   }
public class Quadrilateral{
    public static void main(String args[]){
        Parallelogram ob1=new Parallelogram();
        Rectangle ob2=new Rectangle();
        Square ob3=new Square();
        ob1.input();
        System.out.println("\nArea of the Parallelogram "+ob1.area()+"\n");
        ob2.input();
        System.out.println("\nArea of the Rectangle "+ob2.area()+"\n");
        ob3.input();
        System.out.println("\nArea of the Square "+ob3.area()+"\n");
    }
}
