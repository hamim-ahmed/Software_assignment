/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamim
 */
public class BankAccount {
// Instance variables
public String name;
public String id;
public double balance;
// Methods
public void deposit(double amount){
balance = balance + amount;
}
public void withdraw(double amount){
if (amount<balance)
balance -= amount;
}
}
class TestBankAccount {
public static void main(String[] args) {
// Creating objects
BankAccount account = new BankAccount();
// Assigning values to instance variables
account.name = "Rashid";
account.id = "1000500";
account.balance = 1000;
// Print balance
System.out.println("Balance before deposit: " + account.balance);
// Calling methods
account.deposit(2000);
// Print balance
System.out.println("Balance after deposit: " + account.balance);
}
}