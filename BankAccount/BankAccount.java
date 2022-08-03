import java.util.ArrayList;
import java.util.Arrays;


public class BankAccount {
            //Attributes------ they belong to the class
    private double checkAccount;
    private double savingsAccount;

    private double checkBalance;
    private double savingsBalance;
    private static int totalAccounts;

        //contructors

    public BankAccount(){
        totalAccounts++;  
    }

//methods need .get


        //getters & setters ---gotta make getters and setters public. Will it work the other way? Public attributes and private getters? .this points to the variable
        //methods
        public double getCheckBalance(){
            return this.checkBalance;
        }
        public double getSavingsBalance(){
            return this.savingsBalance;
        }

        public static int getTotalAccounts(){
            return totalAccounts;
        }
        // public static double getTotalAccounts(){
        //     return totalAccounts;
        // }


        
    //method deposit money into either acnt (earn pts)
    //method withdraw money from either acnt, cannot withdraw w/o sufficient funds (redeemPoints)
    
    
    
    
    public void depositCheckAccount(double depostCheckAccount){
        this.checkAccount += checkAccount;
        checkAccount += checkBalance;
    }
    public void withdrawCheckAccount(double withdrawCheckAccount){
        this.checkAccount -= checkAccount;
        checkBalance -= checkBalance;
    }
    public void depostSavingsAccount(double depositSavingsAccount){
        this.savingsAccount += savingsAccount;
        savingsBalance += savingsBalance;
    }






    public void numberOfAccounts(){
        System.out.println("Checking Balance:" + this.checkBalance);
        System.out.println("Savings Balance:" + this.savingsBalance);
    } 
    }


//method total balance 