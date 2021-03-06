import java.io.*;
import java.util.Scanner;
class Invoice{
        //Define instance variables here
        private String id;
        private String description;
        private int quantity;
        private double price;
        
        public Invoice(){ }
        //Define parameterized constructor here
        public Invoice(String id,String description,int quantity,double price){
         this.id=id;
         this.description = description;
         this.quantity = quantity;
         this.price = price;
        }
        
       // Setters
        public void setId(String id){
            this.id=id;
        }
        public void setDescription(String description){
            this.description = description;
        }
        public void setQuantity(int quantity){
            if (quantity>0){
                this.quantity=quantity;
                
            }
            else{
                this.quantity = 0;
            }
        }
        public void setPrice(double price){
             if (price<0){
                this.price=price;
                
            }
            else{
                this.price = 0.0;
            }
        }
        
       // Getters
        public String getId(){
            return id;
        }
        public String getDescription(){
            return description;
        }
        public int getQuantity(){
            return quantity;
        }
        public double getPrice(){
            return price;
        }
        
       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                if (quantity<0){
                    invoiceAmount=(int) 0;
                    quantity=0;
                }
                else if (price<0){
                    invoiceAmount=0.0;
                    price=0;
                }
                else{
                    invoiceAmount=(quantity*price);
                }
                return invoiceAmount;
       }
}
public class Experiment_1{
         public static void main(String []args){
                   Invoice myInvoice;
                   //Write your code here 
                   myInvoice = new Invoice("212","description",-1,20);
                   System.out.println("Total Invoice amount ="+ myInvoice.getInvoiceAmount());
                   System.out.println("Invoice Id ="+ myInvoice.getId());
                   System.out.println("Invoice Description ="+myInvoice.getDescription());
                   System.out.println("Invoice quantity ="+myInvoice.getQuantity());
                   System.out.println("Invoice price ="+myInvoice.getPrice());
         }
}




