/*
 * Classes and Objects
 * @author: Mark Zarak, Oct 2020
 */

public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        // Initiate accounts
        Account a1 = new Account("Matthews account", 1000);
        Account a2 = new Account("My account", 0);
        
        // Perform transactions
        a1.withdrawal(100);
        a2.deposit(100);
        
        // Print account details
        System.out.println(a1);
        System.out.println(a2);
    }
}
