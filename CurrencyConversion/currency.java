package CurrencyConversion;
import java.util.Scanner;

public class currency {
    double inr,usd,euro , yen;
    Scanner sc = new Scanner(System.in);

    public void dollartorupee(){
        System.out.println("Enter Dollars to convert into rupees");
        usd = sc.nextInt();
        inr = usd*73;
        System.out.println("Dollars = "+usd +"equals to INR ="+inr);
    }
    public void rupeetodollar(){
        System.out.println("Enter INR to convert into dollars");
        inr = sc.nextInt();
        usd= inr/73;
        System.out.println("INR = "+inr +"equals to USD ="+usd);
    }
    public void yentorupee(){
        System.out.println("Enter yen to convert into rupees");
        yen = sc.nextInt();
        inr = yen*0.71;
        System.out.println("Dollars = "+usd +"equals to INR ="+inr);
    }
    public void rupeetoyen(){
        System.out.println("Enter INR to convert into YEN");
        inr = sc.nextInt();
        yen = inr/0.71;
        System.out.println("YEN = "+yen +"equals to INR ="+inr);
    }
    public void eurotorupee(){
        System.out.println("Enter Euros to convert into rupees");
        euro = sc.nextInt();
        inr = usd*89.69;
        System.out.println("Euro = "+euro +"equals to INR ="+inr);
    }
    public void rupeetoeuro(){
        System.out.println("Enter INR to convert into Euro");
        inr = sc.nextInt();
        euro = inr*73;
        System.out.println("Euro = "+usd +"equals to INR ="+inr);
    }
}
