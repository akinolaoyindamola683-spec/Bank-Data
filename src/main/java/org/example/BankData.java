package org.example;

public class BankData {
     String name;
     double balance;

    public BankData (String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }

    public  void chekBalance(){
        System.out.println("Hello " + name + " Your balance is: " + balance);
    }

    public void deposit(double amount){
        if(amount >0){
            balance = balance + amount;
            System.out.println(amount + " deposited successfully.");
        }
        else {
            System.out.println("Invalid amount. Deposit must be greater than 0.");
        }
    }

    public void withdraw(double amount){
        if(amount >0 && amount <= balance){
            balance = balance - amount;
            System.out.println(amount + " Withdrawn successfully.");
        }
        else {
            System.out.println(" Withdrawal failed. Check amount or balance.");
        }
    }

    public void transfer(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println(amount + " transferred successfully");
        }
        else{
            System.out.println("Transfer failed. Check amount or balance");
        }
    }
}
