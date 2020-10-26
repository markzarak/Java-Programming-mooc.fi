/*
 * Classes and Objects
 * @author: Mark Zarak, Oct 2020
 */

public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account account = new Account("Mark", 100);
        account.deposit(20);
        System.out.println(account);
    }
}
