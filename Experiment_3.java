/*
						Question

Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for all account holders.

Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has ondeposit.

Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12 this interest should be added to savingsBalance.

Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.

Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for both savers. Then set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers.

*/

import java.io.*;
class SavingsAccount{
    private static double annualInterestRate;
    private double savings;
    
    public SavingsAccount(){}
    public SavingsAccount(double savings){
        this.savings=savings;
    }
    
    public void setSavings(double savings){
        this.savings = savings;
    }
    public void setAnnualInterestRate( double annualInterestRate){
        this.annualInterestRate= annualInterestRate;
    }
    
    public double calculateMonthlyInterest(){
        double monthlyInterest = savings*annualInterestRate/12 ;
        return savings+monthlyInterest;
    }
}

public class Experiment_3{
         public static void main(String []args){
             SavingsAccount account1 = new SavingsAccount(2000.00);
             SavingsAccount account2 = new SavingsAccount(3000.00);
             account1.setAnnualInterestRate(0.04);
             account2.setAnnualInterestRate(0.04);
             System.out.println("Monthly Interest of $2000 with 4% annual rate = "+account1.calculateMonthlyInterest());
             System.out.println("Monthly Interest of $3000 with 4% annual rate = "+account2.calculateMonthlyInterest());
             account1.setAnnualInterestRate(0.05);
             account2.setAnnualInterestRate(0.05);
             System.out.println("Monthly Interest of $2000 with 5% annual rate = "+account1.calculateMonthlyInterest());
             System.out.println("Monthly Interest of $3000 with 5% annual rate = "+account2.calculateMonthlyInterest());
             
         }
    
}
