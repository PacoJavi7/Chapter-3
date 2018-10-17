import javax.swing.JOptionPane;
/**
 * BankAccount.java  
 *
 * @author: Javier Espinosa
 * Assignment #: 20
 * 
 * Brief Program Description: 
 * Will design the blueprint for a class that will create and change bankaccounts
 * 
 *
 */
public class BankAccount
{
   //Class Variable are for the whole class
   //Keyword = static
   public static int nextAccountNum=1000;
   //Instancec variable
   private String owner;
   private int accountNumber;
   private double balance;
   
    /**
     * This is the parameterized constructor for creating a bank account.
     *
     * @param String - The name of the owner
     * @param int - The account number
     * @param double - The initial balance
     * 
     */
   public BankAccount(String o, double b) {
       //radiud = radius
       owner = o;
       accountNumber = nextAccountNum;
       nextAccountNum++; //gives us new account number each time
       balance = b;
       
   }
   
   /**
     * Returns the bank account's balance
     * 
     * @return - Bank account's balance
     */
    public double getBalance() {
    return balance;
    }
   
   /**
     * Returns the Account Number
     * 
     * @return - The Account Number
     */
   public int getAccountNumber() {
    return accountNumber;
    } 
   
   /**
     * Returns the owner of the account
     * 
     * @return - The Owner of the Bank Account
     */
    public String getOwner() {
    return owner;
    } 
    
   /**
     * This method changes the owner's name
     * 
     * @param String - The Owner's new Name
     */
    public void changeOwner() {
     owner = JOptionPane.showInputDialog("Enter New Owner");
    }
    
   /**
     * This withdraws money into your account
     * 
     * 
     */
    public void Withdraw(double w) {
     //balance -= Double.parseDouble(JOptionPane.showInputDialog("Enter Desired Withdrawl"));
     double b = balance+w;
    }
    /**
     * This adds interest to your balanced based on what percentage you want
     * @param double - interest that will be dived by 100
     */
   public void addInterest(double i) {
      balance += (i/100*balance); 
    }
    
   /**
     * This deposits money into your account
     * 
     *
     */
   public void Deposit(double d) {
       //balance+= Double.parseDouble(JOptionPane.showInputDialog("Enter Desired Deposit"));
       double b = balance+d;
     }
     
   /**
     * Returns a string representation of the object
     * 
     * @return - toString reprsenting the object
     */
     public String toString() {
    String str ="Owner: "+ getOwner()+ "\nAccount Number: "+getAccountNumber()+"\nBalance: $" + getBalance();
    return str;
    }
}
/**
 * Will not have output untill used in a main class
 */
