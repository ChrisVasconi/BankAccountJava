import java.util.ArrayList;
import java.util.Arrays;

public class BankAccountTest {
    public static void main (String[] args){
        System.out.println("Testing");
        BankAccount checking = new BankAccount ();
        BankAccount savingsAccount = new BankAccount ();
        BankAccount account1 = new BankAccount ();
        
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
       
    }
}