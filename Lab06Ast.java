// Lab06Ast.java
// The First Bank Program
// Object Methods and Output Formatting
// This is the student, starting version of Lab 06A.

import java.text.DecimalFormat;

public class Lab06Ast
{
    public static void main(String args[])
    {
      // Create DecimalFormat and Bank Objects
      DecimalFormat money = new DecimalFormat("$00,000.00");
      Bank tom = new Bank();                              
      Bank suzy = new Bank(1600,32000);                    
      Bank bill = new Bank(8000,Expo.random(20000,90000)); 
      double billsaving = bill.getSavings();
      
      // Display Initial Balances
      System.out.println();
      System.out.println("Initial Balances");
      System.out.println("Tom's Check balance   : " + tom.getChecking());
      System.out.println("Tom's Saving balance  : " + tom.getSavings());
      System.out.println("Suzy's Check balance  : " + suzy.getChecking());
      System.out.println("Suzy's Saving balance : " + suzy.getSavings());
      System.out.println("Bill's Check balance  : " + bill.getChecking());
      System.out.println("Bill's Saving balance : " + bill.getSavings());
      
      // Deposits and Withdrawals
      tom.checkingDeposit(500);
      tom.savingsDeposit(7000);
      bill.checkingWithdrawal(8000);
      suzy.savingsWithdrawal(20000);
      suzy.checkingDeposit(20000);
      bill.savingsWithdrawal(billsaving);
      
      // Display Final Balances
      System.out.println();
      System.out.println("Final Balances");
      System.out.println("Tom's Check balance   : " + tom.getChecking());
      System.out.println("Tom's Saving balance  : " + tom.getSavings());
      System.out.println("Suzy's Check balance  : " + suzy.getChecking());
      System.out.println("Suzy's Saving balance : " + suzy.getSavings());
      System.out.println("Bill's Check balance  : " + bill.getChecking());
      System.out.println("Bill's Saving balance : " + bill.getSavings());
      
    }
}
