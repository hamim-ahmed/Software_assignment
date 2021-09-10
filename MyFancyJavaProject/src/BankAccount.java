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
private static BankAccount instance = null;
public String name;
public String id;
public double balance;

private BankAccount(String n,String i, int bal){
    this.name = n;
    this.id = i;
    this.balance = bal;
}
public static BankAccount getbankaccount(String n,String i,int bal){      //for singleton pattern.
    if(instance == null){
        instance = new BankAccount(n,i,bal);
    }
    return instance;
}
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
BankAccount account = BankAccount.getbankaccount("KHAN","0123456",2000);
// Assigning values to instance variables
System.out.println("Balance before deposit: " + account.balance);
account.deposit(2000);
System.out.println("Balance after deposit: " + account.balance);
<<<<<<< HEAD

BankAccount account2 = new BankAccount();
account2.name = "hamim";
account2.id = "654654";
account2.balance = 5000;
        
=======
// Print balance
BankAccount account1 = BankAccount.getbankaccount("hamim","1357",500);
System.out.println("balance: " + account1.balance );  //this object will get the previous object that already exit....so information will not be updated.
>>>>>>> branchY
}
}